package org.bysj.block;

import lombok.Data;
import java.util.List;

@Data
public class Block {
    private int index;
    private long timestamp;
    private List<Transaction> transactions;
    private String previousHash;
    private String hash;
    private int nonce;

    // 构造函数、getters 和 setters
    public Block(int index, long timestamp, List<Transaction> transactions, String previousHash, int nonce) {
        this.index = index;
        this.timestamp = timestamp;
        this.transactions = transactions;
        this.previousHash = previousHash;
        this.nonce = nonce;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        // 使用简单的字符串连接来计算哈希（仅为示例，实际应用中应使用更安全的哈希算法）
        return Integer.toString((previousHash + Long.toString(timestamp) + transactions.toString() + nonce).hashCode());
    }

    // Getters and Setters
    public int getIndex() {
        return index;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }
} 