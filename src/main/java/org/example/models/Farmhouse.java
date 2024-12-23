package org.example.models;


import org.example.constans.AccommodationType;

import java.util.List;

public class Farmhouse extends Accommodation{
    public Farmhouse(String name, String city, AccommodationType type, Double calification, List<Rooms> rooms) {
        super(name, city, type, calification, rooms);
    }

    public Farmhouse() {
    }

    @Override
    public void showInformation() {
        System.out.println(getCity() + ":" + getType());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ciudad Seleccionada: " + getCity());
        System.out.println("Nombre: " + getName());
        System.out.println(("Precio: " + getRooms().get(0).getPrice()));
        System.out.println("Calificación: " + getRating() + "⭐");
    }
}
