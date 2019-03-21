package com.zheng.mylistviewtest;

/**
 * Created by zheng on 3/20/19.
 */

public class Num {
    private int imageId;
    private String numName;

    public Num(int imageId, String numName) {
        this.imageId = imageId;
        this.numName = numName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getNumName() {
        return numName;
    }

    public void setNumName(String numName) {
        this.numName = numName;
    }
}
