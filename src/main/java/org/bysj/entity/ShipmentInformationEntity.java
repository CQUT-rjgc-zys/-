package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 运输信息实体类
 */
@Data
@TableName("ShipmentInformation")
public class ShipmentInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer shipmentId; // 运输唯一标识ID
    private Integer drugId; // 关联的药品ID
    private String fromLocation; // 出发地
    private String toLocation; // 目的地
    private Date departureDate; // 出发日期
    private Date arrivalDate; // 到达日期
    private Integer carrierId; // 关联的承运商ID
    private String status; // 运输状态
    private String trackingNumber; // 追踪号码
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 