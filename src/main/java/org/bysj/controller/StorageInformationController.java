package org.bysj.controller;

import org.bysj.entity.StorageInformationEntity;
import org.bysj.service.StorageInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 存储信息控制器，提供存储信息的CRUD操作。
 */
@RestController
@RequestMapping("/storages")
public class StorageInformationController {

    @Autowired
    private StorageInformationService storageInformationService;

    /**
     * 获取所有存储信息。
     * @return 存储信息列表
     */
    @GetMapping
    public List<StorageInformationEntity> getAllStorages() {
        return storageInformationService.getAllStorages();
    }

    /**
     * 根据ID获取存储信息。
     * @param id 存储ID
     * @return 存储信息
     */
    @GetMapping("/{id}")
    public StorageInformationEntity getStorageById(@PathVariable Integer id) {
        return storageInformationService.getStorageById(id);
    }

    /**
     * 保存存储信息。
     * @param storage 存储信息
     */
    @PostMapping
    public void saveStorage(@RequestBody StorageInformationEntity storage) {
        storageInformationService.saveStorage(storage);
    }

    /**
     * 更新存储信息。
     * @param storage 存储信息
     */
    @PutMapping
    public void updateStorage(@RequestBody StorageInformationEntity storage) {
        storageInformationService.updateStorage(storage);
    }

    /**
     * 根据ID删除存储信息。
     * @param id 存储ID
     */
    @DeleteMapping("/{id}")
    public void deleteStorage(@PathVariable Integer id) {
        storageInformationService.deleteStorage(id);
    }
} 