package org.bysj.block;

import lombok.Data;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

    /**
     * 计算区块的哈希值。
     * 使用SHA-256算法来确保安全性。
     * @return 计算出的哈希值
     */
    public String calculateHash() {
        // 将区块的所有数据拼接成一个字符串
        String dataToHash = previousHash + Long.toString(timestamp) + transactions.toString() + nonce;
        MessageDigest digest;
        byte[] hashBytes = null;
        try {
            // 获取SHA-256的MessageDigest实例
            digest = MessageDigest.getInstance("SHA-256");
            // 计算哈希值
            hashBytes = digest.digest(dataToHash.getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 将字节数组转换为十六进制字符串
        StringBuilder buffer = new StringBuilder();
        for (byte b : hashBytes) {
            buffer.append(String.format("%02x", b));
        }
        return buffer.toString();
    }

    /**
     * 挖矿方法，通过不断调整nonce值来找到符合难度要求的哈希值。
     * @param difficulty 挖矿难度，表示哈希值前面需要有多少个零
     */
    public void mineBlock(int difficulty) {
        // 生成目标字符串，表示哈希值前面需要有多少个零
        String target = new String(new char[difficulty]).replace('\0', '0');
        // 不断调整nonce值，直到找到符合难度要求的哈希值
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
    }
} 