package com.mycompany.th5_2.model;

public class BacSi {
    String MABS;
    String TENBS;

    public BacSi(String MABS, String TENBS) {
        this.MABS = MABS;
        this.TENBS = TENBS;
    }

    @Override
    public String toString() {
        return "BacSi{" +
                "MABS='" + MABS + '\'' +
                ", TENBS='" + TENBS + '\'' +
                '}';
    }

    public String getMABS() {
        return MABS;
    }

    public void setMABS(String MABS) {
        this.MABS = MABS;
    }

    public String getTENBS() {
        return TENBS;
    }

    public void setTENBS(String TENBS) {
        this.TENBS = TENBS;
    }

    public BacSi() {
    }
}
