package org.bysj.block;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
    private String drugId;
    private String from;
    private String to;
    private long timestamp;
    private String details;
} 