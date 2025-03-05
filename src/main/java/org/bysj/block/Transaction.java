package org.bysj.block;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Transaction {
    private String drugId;
    private String from;
    private String to;
    private long timestamp;
    private String details;
} 