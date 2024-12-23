package org.example.models;




import org.example.constans.AccommodationType;

import java.util.List;

public abstract class Accommodation {
    private String name;
    private String city;
    private AccommodationType type;
    private Double rating;
    private List<Rooms> rooms;

     protected Accommodation(String name, String city, AccommodationType type, Double calification, List<Rooms> rooms) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = calification;
        this.rooms = rooms;
    }
     public abstract void showInformation();

    public Accommodation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AccommodationType getType() {
        return type;
    }

    public void setType(AccommodationType type) {
        this.type = type;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }
}
