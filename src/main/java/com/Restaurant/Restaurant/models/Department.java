package com.Restaurant.Restaurant.models;

public class Department {
    private int deptId;
    private String deptName;
    private String deptDescription;
    private Restaurant Restaurant;

    public Department(int deptId, String deptName, String deptDescription, com.Restaurant.Restaurant.models.Restaurant restaurant) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptDescription = deptDescription;
        Restaurant = restaurant;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDescription() {
        return deptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public com.Restaurant.Restaurant.models.Restaurant getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(com.Restaurant.Restaurant.models.Restaurant restaurant) {
        Restaurant = restaurant;
    }
}
