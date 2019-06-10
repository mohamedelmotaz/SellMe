package com.example.moataz.sellme;

public class data {
    private int imgId;
    private  String title;
    private String description;

    public data(int imgId, String title, String description) {
        this.imgId = imgId;
        this.title = title;
        this.description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
