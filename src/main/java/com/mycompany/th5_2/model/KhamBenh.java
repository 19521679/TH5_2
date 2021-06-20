package com.mycompany.th5_2.model;

import java.util.Date;

public class KhamBenh {
    String MAKB;
    String MABN;
    String MABS;
    Date NGAYKHAM;
    String YEUCAUKHAM;
    String KETLUAN;
    Boolean THANHTOAN;

    @Override
    public String toString() {
        return "KhamBenh{" +
                "MAKB='" + MAKB + '\'' +
                ", MABN='" + MABN + '\'' +
                ", MABS='" + MABS + '\'' +
                ", NGAYKHAM=" + NGAYKHAM +
                ", YEUCAUKHAM='" + YEUCAUKHAM + '\'' +
                ", KETLUAN='" + KETLUAN + '\'' +
                ", THANHTOAN=" + THANHTOAN +
                '}';
    }

    public String getMAKB() {
        return MAKB;
    }

    public void setMAKB(String MAKB) {
        this.MAKB = MAKB;
    }

    public String getMABN() {
        return MABN;
    }

    public void setMABN(String MABN) {
        this.MABN = MABN;
    }

    public String getMABS() {
        return MABS;
    }

    public void setMABS(String MABS) {
        this.MABS = MABS;
    }

    public Date getNGAYKHAM() {
        return NGAYKHAM;
    }

    public void setNGAYKHAM(Date NGAYKHAM) {
        this.NGAYKHAM = NGAYKHAM;
    }

    public String getYEUCAUKHAM() {
        return YEUCAUKHAM;
    }

    public void setYEUCAUKHAM(String YEUCAUKHAM) {
        this.YEUCAUKHAM = YEUCAUKHAM;
    }

    public String getKETLUAN() {
        return KETLUAN;
    }

    public void setKETLUAN(String KETLUAN) {
        this.KETLUAN = KETLUAN;
    }

    public Boolean getTHANHTOAN() {
        return THANHTOAN;
    }

    public void setTHANHTOAN(Boolean THANHTOAN) {
        this.THANHTOAN = THANHTOAN;
    }

    public KhamBenh() {
    }

    public KhamBenh(String MAKB, String MABN, String MABS, Date NGAYKHAM, String YEUCAUKHAM, String KETLUAN, Boolean THANHTOAN) {
        this.MAKB = MAKB;
        this.MABN = MABN;
        this.MABS = MABS;
        this.NGAYKHAM = NGAYKHAM;
        this.YEUCAUKHAM = YEUCAUKHAM;
        this.KETLUAN = KETLUAN;
        this.THANHTOAN = THANHTOAN;
    }
}
