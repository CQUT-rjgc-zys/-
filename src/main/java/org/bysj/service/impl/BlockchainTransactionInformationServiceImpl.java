package org.bysj.service.impl;

import org.bysj.entity.BlockchainTransactionInformationEntity;
import org.bysj.mapper.BlockchainTransactionInformationMapper;
import org.bysj.service.BlockchainTransactionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 区块链交易信息 Service 实现类
 *
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class BlockchainTransactionInformationServiceImpl implements BlockchainTransactionInformationService {

    @Autowired
    private BlockchainTransactionInformationMapper blockchainTransactionInformationMapper;

    /**
     * 获取所有区块链交易信息
     * @return 区块链交易信息列表
     */
    @Override
    public List<BlockchainTransactionInformationEntity> getAllTransactions() {
        return blockchainTransactionInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取区块链交易信息
     * @param id 交易ID
     * @return 区块链交易信息
     */
    @Override
    public BlockchainTransactionInformationEntity getTransactionById(Integer id) {
        return blockchainTransactionInformationMapper.selectById(id);
    }

    /**
     * 保存区块链交易信息
     * @param transaction 区块链交易信息
     */
    @Override
    public void saveTransaction(BlockchainTransactionInformationEntity transaction) {
        blockchainTransactionInformationMapper.insert(transaction);
    }

    /**
     * 更新区块链交易信息
     * @param transaction 区块链交易信息
     */
    @Override
    public void updateTransaction(BlockchainTransactionInformationEntity transaction) {
        blockchainTransactionInformationMapper.updateById(transaction);
    }

    /**
     * 根据ID删除区块链交易信息
     * @param id 交易ID
     */
    @Override
    public void deleteTransaction(Integer id) {
        blockchainTransactionInformationMapper.deleteById(id);
    }
}
