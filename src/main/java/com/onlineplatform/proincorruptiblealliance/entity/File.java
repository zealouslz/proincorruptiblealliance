package com.onlineplatform.proincorruptiblealliance.entity;

public class File {
    private String fileId;

    private String fileName;

    private String belongItemId;

    private byte[] content;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getBelongItemId() {
        return belongItemId;
    }

    public void setBelongItemId(String belongItemId) {
        this.belongItemId = belongItemId == null ? null : belongItemId.trim();
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}