package com.mycompany.th5_2.model;

public class DichVu {
    String MADV;
    String TENDV;
    Integer DONGIA;

    @Override
    public String toString() {
        return "DichVu{" +
                "MADV='" + MADV + '\'' +
                ", TENDV='" + TENDV + '\'' +
                ", DONGIA=" + DONGIA +
                '}';
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getTENDV() {
        return TENDV;
    }

    public void setTENDV(String TENDV) {
        this.TENDV = TENDV;
    }

    public Integer getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(Integer DONGIA) {
        this.DONGIA = DONGIA;
    }

    public DichVu() {
    }

    public DichVu(String MADV, String TENDV, Integer DONGIA) {
        this.MADV = MADV;
        this.TENDV = TENDV;
        this.DONGIA = DONGIA;
    }
}
