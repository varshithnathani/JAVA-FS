package com.varshith;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int roolNo;
    private String sName;
    private int sAge;

    public int getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(int roolNo) {
        this.roolNo = roolNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "student{" +
                "roolNo=" + roolNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}
