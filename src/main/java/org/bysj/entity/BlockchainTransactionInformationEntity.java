package org.bysj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 区块链交易信息实体类
 */
@Data
@TableName("BlockchainTransactionInformation")
public class BlockchainTransactionInformationEntity {
    @TableId(type = IdType.AUTO)
    private Integer transactionId; // 区块链交易唯一标识ID
    private Date timestamp; // 交易时间戳
    private String previousHash; // 前一个区块的哈希
    private String currentHash; // 当前区块的哈希
    private String data; // 交易数据
    private String transactionType; // 交易类型
    private Date createDate; // 创建日期
    private Date lastUpdateDate; // 最后更新日期
} 