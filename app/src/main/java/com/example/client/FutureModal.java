package com.example.client;

public class FutureModal {


    private int imageId;
    private int titleId;
    private int subtitleId;

    public FutureModal(int imageId, int titleId, int subtitleId) {
        this.imageId = imageId;
        this.titleId = titleId;
        this.subtitleId = subtitleId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getTitle() {
        return titleId;
    }

    public int getSubtitle() {
        return subtitleId;
    }
}