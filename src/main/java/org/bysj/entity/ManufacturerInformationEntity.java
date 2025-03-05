package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 制造商信息实体类
 */
@Data
@TableName("ManufacturerInformation")
public class ManufacturerInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer manufacturerId; // 制造商唯一标识ID
    private String name; // 制造商名称
    private String address; // 制造商地址
    private String contactInfo; // 联系信息
    private String country; // 国家
    private Date establishedDate; // 成立日期
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 