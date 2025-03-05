package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 药品信息实体类
 */
@Data
@TableName("DrugInformation")
public class DrugInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer drugId; // 药品唯一标识ID
    private String name; // 药品名称
    private Integer manufacturerId; // 关联的制造商ID
    private String batchNumber; // 批号
    private Date expiryDate; // 有效期
    private Integer typeId; // 关联的药品类型ID
    private Integer currentVersion; // 当前版本号
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 