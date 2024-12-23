package org.example.models;

import org.example.constans.AccommodationType;

import java.util.List;

public class Hotel extends Accommodation {
    private Daypass daypass;

    public Hotel(String name, String city, AccommodationType type, Double rating, List<Rooms> rooms) {
        super(name, city, type, rating, rooms);
    }

    public Hotel(String name, String city, AccommodationType type, Double rating, List<Rooms> rooms, Daypass daypass) {
        super(name, city, type, rating, rooms);
        this.daypass = daypass;
    }

    public Hotel() {
    }

    @Override
    public void showInformation() {
        System.out.println(getCity() + ":" + getType());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ciudad Seleccionada: " + getCity());
        System.out.println("Nombre: " + getName());
        System.out.println((daypass != null) ? "Precio: " + daypass.getPrice() : "Precio: " + getRooms().get(0).getPrice());
        System.out.println("Calificación: " + getRating() + "⭐");
        System.out.println((daypass != null) ? "Información de DiaSol: " + daypass.getActivities() : "");
    }
}
