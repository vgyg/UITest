package com.zheng.recycleviewtest;

/**
 * Created by zheng on 3/21/19.
 */

public class Num  {
    private int imagesrc;
    private String num_text;

    public Num(int imagesrc, String num_text) {
        this.imagesrc = imagesrc;
        this.num_text = num_text;
    }

    public int getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(int imagesrc) {
        this.imagesrc = imagesrc;
    }

    public String getNum_text() {
        return num_text;
    }

    public void setNum_text(String num_text) {
        this.num_text = num_text;
    }
}
