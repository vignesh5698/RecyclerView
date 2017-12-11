package com.example.vignesh.test;

/**
 * Created by vignesh on 11/12/17.
 */

public class DataProvider {
    private int img;
    private String fname,dname;
    public DataProvider(int img,String fname,String dname){
            this.setImg(img);
            this.setFname(fname);
            this.setDname(dname);

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
