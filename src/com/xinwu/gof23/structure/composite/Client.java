package com.xinwu.gof23.structure.composite;

/**
 * 结构型设计模式之--组合模式（composite）
 * 使用场景：把部分和整理的关系用树形结构来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象。
 * 组合模式核心：
 * - 抽象构件（component）角色：定义了叶子和容器构件的共同点
 * - 叶子（Leaf）构件角色：无子节点
 * - 容器（Composite）构件角色：有容器特征，可以包含子节点
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile a1 = new TextFile("1");
        AbstractFile a2 = new TextFile("2");
        AbstractFile a3 = new TextFile("3");

        FileFolder fileFolder1 = new FileFolder("file folder1");
        FileFolder fileFolder2 = new FileFolder("file folder2");

        fileFolder1.add(a1);
        fileFolder1.add(a2);

        fileFolder2.add(a3);

        fileFolder1.add(fileFolder2);

        fileFolder1.killVirus();
    }
}
