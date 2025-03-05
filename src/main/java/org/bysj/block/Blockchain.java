package org.bysj.block;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain;
    private int difficulty;

    public Blockchain() {
        this.chain = new ArrayList<>();
        // 创建创世区块
        this.chain.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        return new Block(0, System.currentTimeMillis(), new ArrayList<>(), "0", 0);
    }

    public Block getLatestBlock() {
        return chain.get(chain.size() - 1);
    }

    /**
     * 添加一个新的区块到区块链中。
     * 在添加之前，先进行挖矿以确保区块的哈希值符合难度要求。
     * @param newBlock 要添加的区块
     */
    public void addBlock(Block newBlock) {
        // 设置新块的前一个哈希值为当前链中最后一个块的哈希值
        newBlock.setPreviousHash(getLatestBlock().getHash());
        // 挖矿以找到符合难度要求的哈希值
        newBlock.mineBlock(difficulty);
        // 将新块添加到区块链中
        this.chain.add(newBlock);
    }

    // 其他区块链相关方法
    // ...
} 