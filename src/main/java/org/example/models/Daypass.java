package org.example.models;

public class Daypass extends Hotel {

    private Double price;
    private String activities;

    public Daypass(Double price, String activities) {
        this.price = price;
        this.activities = activities;
    }

    public Daypass() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}
