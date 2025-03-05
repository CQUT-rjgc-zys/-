package org.bysj.service.impl;

import org.bysj.entity.DrugInformationEntity;
import org.bysj.mapper.DrugInformationMapper;
import org.bysj.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bysj.block.Block;
import org.bysj.block.Blockchain;
import org.bysj.block.Transaction;

import java.util.List;

/**
 * 药品信息 Service 实现类
 *
 * 作者: zys
 * 时间: 2025-03-04
 */
@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugInformationMapper drugInformationMapper;

    private Blockchain blockchain = new Blockchain();

    /**
     * 获取所有药品信息
     *
     * @return 药品信息列表
     */
    @Override
    public List<DrugInformationEntity> getAllDrugs() {
        return drugInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取药品信息
     *
     * @param id 药品ID
     * @return 药品信息
     */
    @Override
    public DrugInformationEntity getDrugById(Integer id) {
        return drugInformationMapper.selectById(id);
    }

    /**
     * 保存药品信息
     *
     * @param drug 药品信息
     */
    @Override
    public void saveDrug(DrugInformationEntity drug) {
        drugInformationMapper.insert(drug);

        Transaction transaction = new Transaction(
            drug.getDrugId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "保存药品信息: " + drug.getName()
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
     * 更新药品信息
     *
     * @param drug 药品信息
     */
    @Override
    public void updateDrug(DrugInformationEntity drug) {
        drugInformationMapper.updateById(drug);

        Transaction transaction = new Transaction(
            drug.getDrugId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "更新药品信息: " + drug.getName()
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
     * 根据ID删除药品信息
     *
     * @param id 药品ID
     */
    @Override
    public void deleteDrug(Integer id) {
        drugInformationMapper.deleteById(id);

        Transaction transaction = new Transaction(
            id.toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "删除药品信息ID: " + id
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
