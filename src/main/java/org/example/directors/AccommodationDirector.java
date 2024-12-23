package org.example.directors;



import org.example.builders.AccommodationBuilder;
import org.example.constans.AccommodationType;
import org.example.models.Accommodation;
import org.example.models.Daypass;
import org.example.models.Rooms;

import java.util.Arrays;

public class AccommodationDirector {
    public Accommodation createHotelDefault(String city) {
        return new AccommodationBuilder()
                .setName("Hotel Estándar")
                .setCity(city)
                .setType(AccommodationType.HOTEL)
                .setRating(4.0)
                .addRoom((Arrays.asList(
                        new Rooms("Sencilla", "1 cama sencilla, TV, baño privado", 150000.0, 10, 4),
                        new Rooms("Duo", "2 camas sencillas, TV, baño privado", 200000.0, 5, 6),
                        new Rooms("Triple", "4 cama sencilla, TV, baño privado", 150000.0, 10, 4),
                        new Rooms("Lujo", "2 cama sencilla, TV, baño privado, servicio al cuarto", 150000.0, 10, 4),
                        new Rooms("Presidencial", "2 cama sencilla, TV, baño privado, Jacuzzi", 150000.0, 10, 4)
                )))
                .Build();
    }
    public Accommodation createApartmentDefault(String city) {
        return new AccommodationBuilder()
                .setName("Apartamento Estándar")
                .setCity(city)
                .setType(AccommodationType.APARTMENT)
                .setRating(4.0)
                .addRoom((Arrays.asList(
                        new Rooms("Sencilla", "1 cama sencilla, TV, baño privado", 150000.0, 4, 2)
                )))
                .Build();
    }
    public Accommodation createFarmHouse(String city) {
        return new AccommodationBuilder()
                .setName("Finca Estándar")
                .setCity(city)
                .setType(AccommodationType.APARTMENT)
                .setRating(4.0)
                .addRoom((Arrays.asList(
                        new Rooms("Habitación Campestre", "1 cama king, terraza privada", 280000.0, 3, 1)
                        )))
                .Build();
    }
    public Accommodation createDaypassDefault(String city) {
        return new AccommodationBuilder()
                .setName("Hotel Estándar con Daypass")
                .setCity(city)
                .setType(AccommodationType.HOTEL)
                .setRating(4.0)
                .addRoom(null)
                .setDaypass(new Daypass(40000.0,"Piscina, picnic y varias actividades"))

                .Build();
    }



}
