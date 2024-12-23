package org.example.builders;


import org.example.IBuilder;
import org.example.constans.AccommodationType;
import org.example.models.Accommodation;
import org.example.models.Apartment;
import org.example.models.Daypass;
import org.example.models.Farmhouse;
import org.example.models.Hotel;
import org.example.models.Rooms;

import java.util.List;


public class AccommodationBuilder implements IBuilder {
    private String name;
    private String city;
    private AccommodationType type;
    private Double rating;
    private List<Rooms> rooms;
    private Daypass daypass;

    public AccommodationBuilder setDaypass(Daypass daypass) {
        this.daypass = daypass;
        return this;
    }

    public AccommodationBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AccommodationBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AccommodationBuilder setTypeById(int id) {
        this.type = AccommodationType.fromId(id);
        return this;
    }

    public AccommodationBuilder setType(AccommodationType type) {
        this.type = type;
        return this;
    }

    public AccommodationBuilder setRating(Double rating) {
        this.rating = rating;
        return this;
    }

    public AccommodationBuilder addRoom(List<Rooms> rooms) {
        this.rooms=rooms;
        return this;
    }

    public Accommodation Build() {
        if (type == null) {
            throw new IllegalStateException("El tipo de alojamiento es obligatorio.");
        }
        return switch (type) {
            case HOTEL -> new Hotel(name, city, type, rating, rooms);
            case APARTMENT -> new Apartment(name, city, type, rating, rooms);
            case FARMHOUSE -> new Farmhouse(name, city, type, rating, rooms);
            case DAYPASS -> new Hotel(name, city, type, rating, rooms, daypass);
        };
    }
}
