package org.bysj.service.impl;

import org.bysj.entity.SalesInformationEntity;
import org.bysj.mapper.SalesInformationMapper;
import org.bysj.service.SalesInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bysj.block.Block;
import org.bysj.block.Blockchain;
import org.bysj.block.Transaction;

import java.util.List;

/**
 * 销售信息 Service 实现类
 *
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class SalesInformationServiceImpl implements SalesInformationService {

    @Autowired
    private SalesInformationMapper salesInformationMapper;

    private Blockchain blockchain = new Blockchain();

    /**
     * 获取所有销售信息
     * @return 销售信息列表
     */
    @Override
    public List<SalesInformationEntity> getAllSales() {
        return salesInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取销售信息
     * @param id 销售ID
     * @return 销售信息
     */
    @Override
    public SalesInformationEntity getSaleById(Integer id) {
        return salesInformationMapper.selectById(id);
    }

    /**
     * 保存销售信息
     * @param sale 销售信息
     */
    @Override
    public void saveSale(SalesInformationEntity sale) {
        salesInformationMapper.insert(sale);

        Transaction transaction = new Transaction(
            sale.getSaleId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "保存销售信息: " + sale.getSaleId()
        );
        Block newBlock = new Block(
            blockchain.getLatestBlock().getIndex() + 1,
            System.currentTimeMillis(),
            List.of(transaction),
            blockchain.getLatestBlock().getHash(),
            0
        );
        blockchain.addBlock(newBlock);
    }

    /**
     * 更新销售信息
     * @param sale 销售信息
     */
    @Override
    public void updateSale(SalesInformationEntity sale) {
        salesInformationMapper.updateById(sale);

        Transaction transaction = new Transaction(
            sale.getSaleId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "更新销售信息: " + sale.getSaleId()
        );
        Block newBlock = new Block(
            blockchain.getLatestBlock().getIndex() + 1,
            System.currentTimeMillis(),
            List.of(transaction),
            blockchain.getLatestBlock().getHash(),
            0
        );
        blockchain.addBlock(newBlock);
    }

    /**
     * 根据ID删除销售信息
     * @param id 销售ID
     */
    @Override
    public void deleteSale(Integer id) {
        salesInformationMapper.deleteById(id);

        Transaction transaction = new Transaction(
            id.toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "删除销售信息ID: " + id
        );
        Block newBlock = new Block(
            blockchain.getLatestBlock().getIndex() + 1,
            System.currentTimeMillis(),
            List.of(transaction),
            blockchain.getLatestBlock().getHash(),
            0
        );
        blockchain.addBlock(newBlock);
    }
}
