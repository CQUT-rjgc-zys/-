package org.bysj.service.impl;

import org.bysj.entity.ShipmentInformationEntity;
import org.bysj.mapper.ShipmentInformationMapper;
import org.bysj.service.ShipmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 运输信息 Service 实现类
 *
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class ShipmentInformationServiceImpl implements ShipmentInformationService {

    @Autowired
    private ShipmentInformationMapper shipmentInformationMapper;

    /**
     * 获取所有运输信息
     * @return 运输信息列表
     */
    @Override
    public List<ShipmentInformationEntity> getAllShipments() {
        return shipmentInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取运输信息
     * @param id 运输ID
     * @return 运输信息
     */
    @Override
    public ShipmentInformationEntity getShipmentById(Integer id) {
        return shipmentInformationMapper.selectById(id);
    }

    /**
     * 保存运输信息
     * @param shipment 运输信息
     */
    @Override
    public void saveShipment(ShipmentInformationEntity shipment) {
        shipmentInformationMapper.insert(shipment);
    }

    /**
     * 更新运输信息
     * @param shipment 运输信息
     */
    @Override
    public void updateShipment(ShipmentInformationEntity shipment) {
        shipmentInformationMapper.updateById(shipment);
    }

    /**
     * 根据ID删除运输信息
     * @param id 运输ID
     */
    @Override
    public void deleteShipment(Integer id) {
        shipmentInformationMapper.deleteById(id);
    }
}
