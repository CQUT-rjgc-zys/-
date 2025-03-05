package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 药品信息历史实体类
 */
@Data
@TableName("DrugInformationHistory")
public class DrugInformationHistoryEntity {
    @TableId(type = IdType.AUTO)
    private Integer historyId; // 历史记录唯一标识ID
    private Integer drugId; // 关联的药品ID
    private Integer version; // 版本号
    private String name; // 药品名称
    private Integer manufacturerId; // 关联的制造商ID
    private String batchNumber; // 批号
    private Date expiryDate; // 有效期
    private Integer typeId; // 关联的药品类型ID
    private Date modifiedDate; // 修改日期
    private Integer modifiedBy; // 修改人（可关联用户表）
    private String changeDescription; // 修改描述
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 