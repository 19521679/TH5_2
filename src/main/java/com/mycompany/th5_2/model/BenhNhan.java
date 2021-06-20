package com.mycompany.th5_2.model;

import java.util.Date;

public class BenhNhan
{
    String MABN;
    String TENBN;
    Date NGSINH;
    String DCHI;
    String DTHOAI;

    public BenhNhan() {
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "MABN='" + MABN + '\'' +
                ", TENBN='" + TENBN + '\'' +
                ", NGSINH=" + NGSINH +
                ", DCHI='" + DCHI + '\'' +
                ", DTHOAI='" + DTHOAI + '\'' +
                ", GIOTINH=" + GIOTINH +
                '}';
    }

    public String getMABN() {
        return MABN;
    }

    public void setMABN(String MABN) {
        this.MABN = MABN;
    }

    public String getTENBN() {
        return TENBN;
    }

    public void setTENBN(String TENBN) {
        this.TENBN = TENBN;
    }

    public Date getNGSINH() {
        return NGSINH;
    }

    public void setNGSINH(Date NGSINH) {
        this.NGSINH = NGSINH;
    }

    public String getDCHI() {
        return DCHI;
    }

    public void setDCHI(String DCHI) {
        this.DCHI = DCHI;
    }

    public String getDTHOAI() {
        return DTHOAI;
    }

    public void setDTHOAI(String DTHOAI) {
        this.DTHOAI = DTHOAI;
    }

    public Boolean getGIOTINH() {
        return GIOTINH;
    }

    public void setGIOTINH(Boolean GIOTINH) {
        this.GIOTINH = GIOTINH;
    }

    public BenhNhan(String MABN, String TENBN, Date NGSINH, String DCHI, String DTHOAI, Boolean GIOTINH) {
        this.MABN = MABN;
        this.TENBN = TENBN;
        this.NGSINH = NGSINH;
        this.DCHI = DCHI;
        this.DTHOAI = DTHOAI;
        this.GIOTINH = GIOTINH;
    }

    Boolean GIOTINH;
}
