package org.example.constans;

public enum AccommodationType {

    HOTEL(1, "Hotel"),
    APARTMENT(2, "Apartamento"),
    DAYPASS(3, "Dia de sol"),
    FARMHOUSE(4, "Finca");

    private final String name;
    private final Integer id;

    AccommodationType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static AccommodationType fromId(int id) {
        for (AccommodationType type : AccommodationType.values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        throw new IllegalArgumentException("No se encontró un tipo de alojamiento con el ID: " + id);
    }

}


