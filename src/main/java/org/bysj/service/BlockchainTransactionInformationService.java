package org.bysj.service;

import org.bysj.entity.BlockchainTransactionInformationEntity;

import java.util.List;

/**
 * 区块链交易信息 Service 接口
 */
public interface BlockchainTransactionInformationService {
    
    /**
     * 获取所有区块链交易信息
     * @return 区块链交易信息列表
     */
    List<BlockchainTransactionInformationEntity> getAllTransactions();

    
    /**
     * 根据ID获取区块链交易信息
     * @param id 交易ID
     * @return 区块链交易信息
     */
    BlockchainTransactionInformationEntity getTransactionById(Integer id);

    
    /**
     * 保存区块链交易信息
     * @param transaction 区块链交易信息
     */
    void saveTransaction(BlockchainTransactionInformationEntity transaction);

    
    /**
     * 更新区块链交易信息
     * @param transaction 区块链交易信息
     */
    void updateTransaction(BlockchainTransactionInformationEntity transaction);

    
    /**
     * 根据ID删除区块链交易信息
     * @param id 交易ID
     */
    void deleteTransaction(Integer id);
} 