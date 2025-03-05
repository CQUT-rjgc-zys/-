package org.bysj.controller;

import org.bysj.entity.ShipmentInformationEntity;
import org.bysj.service.ShipmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 运输信息控制器，提供运输信息的CRUD操作。
 */
@RestController
@RequestMapping("/shipments")
public class ShipmentInformationController {

    @Autowired
    private ShipmentInformationService shipmentInformationService;

    /**
     * 获取所有运输信息。
     * @return 运输信息列表
     */
    @GetMapping
    public List<ShipmentInformationEntity> getAllShipments() {
        return shipmentInformationService.getAllShipments();
    }

    /**
     * 根据ID获取运输信息。
     * @param id 运输ID
     * @return 运输信息
     */
    @GetMapping("/{id}")
    public ShipmentInformationEntity getShipmentById(@PathVariable Integer id) {
        return shipmentInformationService.getShipmentById(id);
    }

    /**
     * 保存运输信息。
     * @param shipment 运输信息
     */
    @PostMapping
    public void saveShipment(@RequestBody ShipmentInformationEntity shipment) {
        shipmentInformationService.saveShipment(shipment);
    }

    /**
     * 更新运输信息。
     * @param shipment 运输信息
     */
    @PutMapping
    public void updateShipment(@RequestBody ShipmentInformationEntity shipment) {
        shipmentInformationService.updateShipment(shipment);
    }

    /**
     * 根据ID删除运输信息。
     * @param id 运输ID
     */
    @DeleteMapping("/{id}")
    public void deleteShipment(@PathVariable Integer id) {
        shipmentInformationService.deleteShipment(id);
    }
} 