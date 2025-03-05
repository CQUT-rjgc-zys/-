package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 销售信息实体类
 */
@Data
@TableName("SalesInformation")
public class SalesInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer saleId; // 销售唯一标识ID
    private Integer drugId; // 关联的药品ID
    private Integer retailerId; // 关联的零售商ID
    private Date saleDate; // 销售日期
    private Integer quantity; // 销售数量
    private Double price; // 销售价格
    private Double discount; // 折扣信息
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 