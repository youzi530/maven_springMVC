package com.domain;

public class Infomation {
    private int id;
    private String fileName;
    private String path;

    @Override
    public String toString() {
        return "Infomation{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;}
}
