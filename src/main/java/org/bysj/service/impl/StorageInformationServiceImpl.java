package org.bysj.service.impl;

import org.bysj.entity.StorageInformationEntity;
import org.bysj.mapper.StorageInformationEntityMapper;
import org.bysj.service.StorageInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private StorageInformationEntityMapper storageInformationEntityMapper;

    /**
     * 获取所有存储信息
     * @return 存储信息列表
     */
    @Override
    public List<StorageInformationEntity> getAllStorages() {
        return storageInformationEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取存储信息
     * @param id 存储ID
     * @return 存储信息
     */
    @Override
    public StorageInformationEntity getStorageById(Integer id) {
        return storageInformationEntityMapper.selectById(id);
    }

    /**
     * 保存存储信息
     * @param storage 存储信息
     */
    @Override
    public void saveStorage(StorageInformationEntity storage) {
        storageInformationEntityMapper.insert(storage);
    }

    /**
     * 更新存储信息
     * @param storage 存储信息
     */
    @Override
    public void updateStorage(StorageInformationEntity storage) {
        storageInformationEntityMapper.updateById(storage);
    }

    /**
     * 根据ID删除存储信息
     * @param id 存储ID
     */
    @Override
    public void deleteStorage(Integer id) {
        storageInformationEntityMapper.deleteById(id);
    }
} 