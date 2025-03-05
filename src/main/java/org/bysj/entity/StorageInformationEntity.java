package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 存储信息实体类
 */
@Data
@TableName("StorageInformation")
public class StorageInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer storageId; // 存储唯一标识ID
    private Integer drugId; // 关联的药品ID
    private Integer locationId; // 关联的存储地点ID
    private Double temperature; // 存储温度
    private Double humidity; // 存储湿度
    private Date storageDate; // 存储日期
    private Integer capacity; // 存储容量
    private String status; // 存储状态
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 