package org.radhatechi.spring.dto;

public class Address {

    private String address1;
    private String address2;
    private int aptNum;
    private String state;
    private String country;
    private int zipCode;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getAptNum() {
        return aptNum;
    }

    public void setAptNum(int aptNum) {
        this.aptNum = aptNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String address1, String address2, int aptNum, String state, String country, int zipCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.aptNum = aptNum;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }
}
