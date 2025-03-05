package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 药品类型实体类
 */
@Data
@TableName("DrugType")
public class DrugTypeEntity {
    @TableId(type = IdType.AUTO)
    private Integer typeId; // 药品类型唯一标识ID
    private String typeName; // 药品类型名称
    private String description; // 类型描述
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 