package com.mycompany.th5_2.model;

import java.math.BigInteger;

public class ThuPhi {
    String MAKB;
    String MADV;
    Integer SOLUONG;
    BigInteger  THANHTIEN;

    public ThuPhi() {
    }

    @Override
    public String toString() {
        return "ThuPhi{" +
                "MAKB='" + MAKB + '\'' +
                ", MADV='" + MADV + '\'' +
                ", SOLUONG=" + SOLUONG +
                ", THANHTIEN=" + THANHTIEN +
                '}';
    }

    public String getMAKB() {
        return MAKB;
    }

    public void setMAKB(String MAKB) {
        this.MAKB = MAKB;
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public Integer getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(Integer SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public BigInteger getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(BigInteger THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }

    public ThuPhi(String MAKB, String MADV, Integer SOLUONG, BigInteger THANHTIEN) {
        this.MAKB = MAKB;
        this.MADV = MADV;
        this.SOLUONG = SOLUONG;
        this.THANHTIEN = THANHTIEN;
    }
}
