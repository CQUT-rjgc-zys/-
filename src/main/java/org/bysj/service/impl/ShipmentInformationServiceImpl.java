package org.bysj.service.impl;

import org.bysj.entity.ShipmentInformationEntity;
import org.bysj.mapper.ShipmentInformationEntityMapper;
import org.bysj.service.ShipmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 运输信息 Service 实现类
 */
@Service
public class ShipmentInformationServiceImpl implements ShipmentInformationService {

    @Autowired
    private ShipmentInformationEntityMapper shipmentInformationEntityMapper;

    /**
     * 获取所有运输信息
     * @return 运输信息列表
     */
    @Override
    public List<ShipmentInformationEntity> getAllShipments() {
        return shipmentInformationEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取运输信息
     * @param id 运输ID
     * @return 运输信息
     */
    @Override
    public ShipmentInformationEntity getShipmentById(Integer id) {
        return shipmentInformationEntityMapper.selectById(id);
    }

    /**
     * 保存运输信息
     * @param shipment 运输信息
     */
    @Override
    public void saveShipment(ShipmentInformationEntity shipment) {
        shipmentInformationEntityMapper.insert(shipment);
    }

    /**
     * 更新运输信息
     * @param shipment 运输信息
     */
    @Override
    public void updateShipment(ShipmentInformationEntity shipment) {
        shipmentInformationEntityMapper.updateById(shipment);
    }

    /**
     * 根据ID删除运输信息
     * @param id 运输ID
     */
    @Override
    public void deleteShipment(Integer id) {
        shipmentInformationEntityMapper.deleteById(id);
    }
} 