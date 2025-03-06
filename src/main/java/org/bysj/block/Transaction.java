package org.bysj.block;

import lombok.Data;

@Data
public class Transaction {
    private String drugId;
    private String from;
    private String to;
    private long timestamp;
    private String details;

    // 构造函数、getters 和 setters
    public Transaction(String drugId, String from, String to, long timestamp, String details) {
        this.drugId = drugId;
        this.from = from;
        this.to = to;
        this.timestamp = timestamp;
        this.details = details;
    }
} 