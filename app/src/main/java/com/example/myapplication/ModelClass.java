package com.example.myapplication;


public class ModelClass {
    private int imageview1;
    private String textview1;
    private String textview2;
    private String textview;
    private String divider;

    ModelClass(int imageview1,String textview,String textview1,String textview2,String textview3){
        this.imageview1=imageview1;
        this.textview=textview;
        this.textview1=textview1;
        this.textview2=textview2;
        this.divider=textview3;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview() {
        return textview;
    }

    public String getDivider() {
        return divider;
    }
}
