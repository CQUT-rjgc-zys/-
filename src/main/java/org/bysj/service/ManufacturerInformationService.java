package org.bysj.service;

import org.bysj.entity.ManufacturerInformationEntity;

import java.util.List;

/**
 * 制造商信息 Service 接口
 */
public interface ManufacturerInformationService {
    
    /**
     * 获取所有制造商信息
     * @return 制造商信息列表
     */
    List<ManufacturerInformationEntity> getAllManufacturers();

    
    /**
     * 根据ID获取制造商信息
     * @param id 制造商ID
     * @return 制造商信息
     */
    ManufacturerInformationEntity getManufacturerById(Integer id);

    
    /**
     * 保存制造商信息
     * @param manufacturer 制造商信息
     */
    void saveManufacturer(ManufacturerInformationEntity manufacturer);

    
    /**
     * 更新制造商信息
     * @param manufacturer 制造商信息
     */
    void updateManufacturer(ManufacturerInformationEntity manufacturer);

    
    /**
     * 根据ID删除制造商信息
     * @param id 制造商ID
     */
    void deleteManufacturer(Integer id);
} 