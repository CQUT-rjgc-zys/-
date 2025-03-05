package org.bysj.service.impl;

import org.bysj.entity.ShipmentInformationEntity;
import org.bysj.mapper.ShipmentInformationMapper;
import org.bysj.service.ShipmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bysj.block.Block;
import org.bysj.block.Blockchain;
import org.bysj.block.Transaction;

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

    private Blockchain blockchain = new Blockchain();

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

        Transaction transaction = new Transaction(
            shipment.getShipmentId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "保存运输信息: " + shipment.getShipmentId()
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
     * 更新运输信息
     * @param shipment 运输信息
     */
    @Override
    public void updateShipment(ShipmentInformationEntity shipment) {
        shipmentInformationMapper.updateById(shipment);

        Transaction transaction = new Transaction(
            shipment.getShipmentId().toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "更新运输信息: " + shipment.getShipmentId()
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
     * 根据ID删除运输信息
     * @param id 运输ID
     */
    @Override
    public void deleteShipment(Integer id) {
        shipmentInformationMapper.deleteById(id);

        Transaction transaction = new Transaction(
            id.toString(),
            "system",
            "blockchain",
            System.currentTimeMillis(),
            "删除运输信息ID: " + id
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
