package org.bysj.service;

import org.bysj.entity.StorageInformationEntity;

import java.util.List;

/**
 * 存储信息 Service 接口
 */
public interface StorageInformationService {
    
    /**
     * 获取所有存储信息
     * @return 存储信息列表
     */
    List<StorageInformationEntity> getAllStorages();

    
    /**
     * 根据ID获取存储信息
     * @param id 存储ID
     * @return 存储信息
     */
    StorageInformationEntity getStorageById(Integer id);

    
    /**
     * 保存存储信息
     * @param storage 存储信息
     */
    void saveStorage(StorageInformationEntity storage);

    
    /**
     * 更新存储信息
     * @param storage 存储信息
     */
    void updateStorage(StorageInformationEntity storage);

    
    /**
     * 根据ID删除存储信息
     * @param id 存储ID
     */
    void deleteStorage(Integer id);
} 