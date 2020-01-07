package com.xinwu.gof23.structure.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

/**
 * 这个对应叶子构件
 */
class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public TextFile() {
    }

    @Override
    public void killVirus() {
        System.out.println("text file:" + this.name + "kill virus");
    }
}

class VideoFile implements AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public VideoFile() {
    }

    @Override
    public void killVirus() {
        System.out.println("video file:" + this.name + "kill virus");
    }
}

class FileFolder implements AbstractFile {
    private String name;

    private List<AbstractFile> list = new ArrayList<>();

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile get(int i) {
        return list.get(i);
    }

    public FileFolder() {
    }

    public FileFolder(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("folder：" + name + "kill virus");
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
