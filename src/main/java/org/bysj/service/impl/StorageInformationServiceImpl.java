package org.bysj.service.impl;

import org.bysj.entity.StorageInformationEntity;
import org.bysj.mapper.StorageInformationMapper;
import org.bysj.service.StorageInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bysj.block.Block;
import org.bysj.block.Blockchain;
import org.bysj.block.Transaction;

import java.util.List;

/**
 * 存储信息 Service 实现类
 *
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class StorageInformationServiceImpl implements StorageInformationService {

    @Autowired
    private StorageInformationMapper storageInformationMapper;

    private Blockchain blockchain = new Blockchain();

    /**
     * 获取所有存储信息
     * @return 存储信息列表
     */
    @Override
    public List<StorageInformationEntity> getAllStorages() {
        return storageInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取存储信息
     * @param id 存储ID
     * @return 存储信息
     */
    @Override
    public StorageInformationEntity getStorageById(Integer id) {
        return storageInformationMapper.selectById(id);
    }

    /**
     * 保存存储信息
     * @param storage 存储信息
     */
    @Override
    public void saveStorage(StorageInformationEntity storage) {
        storageInformationMapper.insert(storage);

        Transaction transaction = new Transaction(
            storage.getStorageId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "保存存储信息: " + storage.getStorageId()
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
     * 更新存储信息
     * @param storage 存储信息
     */
    @Override
    public void updateStorage(StorageInformationEntity storage) {
        storageInformationMapper.updateById(storage);

        Transaction transaction = new Transaction(
            storage.getStorageId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "更新存储信息: " + storage.getStorageId()
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
     * 根据ID删除存储信息
     * @param id 存储ID
     */
    @Override
    public void deleteStorage(Integer id) {
        storageInformationMapper.deleteById(id);

        Transaction transaction = new Transaction(
            id.toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "删除存储信息ID: " + id
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
