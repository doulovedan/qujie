package com.jizhiwei.entity;

public class Address {
    private Integer addId;

    private String addCity;

    private String addArea;

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getAddCity() {
        return addCity;
    }

    public void setAddCity(String addCity) {
        this.addCity = addCity == null ? null : addCity.trim();
    }

    public String getAddArea() {
        return addArea;
    }

    public void setAddArea(String addArea) {
        this.addArea = addArea == null ? null : addArea.trim();
    }
}