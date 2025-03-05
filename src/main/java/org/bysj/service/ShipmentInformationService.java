package org.bysj.service;

import org.bysj.entity.ShipmentInformationEntity;

import java.util.List;

/**
 * 运输信息 Service 接口
 */
public interface ShipmentInformationService {
    
    /**
     * 获取所有运输信息
     * @return 运输信息列表
     */
    List<ShipmentInformationEntity> getAllShipments();

    
    /**
     * 根据ID获取运输信息
     * @param id 运输ID
     * @return 运输信息
     */
    ShipmentInformationEntity getShipmentById(Integer id);

    
    /**
     * 保存运输信息
     * @param shipment 运输信息
     */
    void saveShipment(ShipmentInformationEntity shipment);

    
    /**
     * 更新运输信息
     * @param shipment 运输信息
     */
    void updateShipment(ShipmentInformationEntity shipment);

    
    /**
     * 根据ID删除运输信息
     * @param id 运输ID
     */
    void deleteShipment(Integer id);
} 