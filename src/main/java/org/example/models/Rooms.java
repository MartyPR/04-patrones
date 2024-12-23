package org.example.models;


public class Rooms {
    private String type;
    private String description;
    private Double price;
    private Integer capacityMaxPersons;
    private Integer numberRooms;

    public Rooms(String type, String description, Double price, Integer capacityMaxPersons, Integer numberRooms) {
        this.type = type;
        this.description = description;
        this.price = price;
        this.capacityMaxPersons = capacityMaxPersons;
        this.numberRooms = numberRooms;
    }

    public Rooms() {
    }
    public void showInformation(){
        System.out.println("Habitaciones en " + type + ":");
        System.out.println("*********************************************************");
        System.out.println("Tipo: " + type);
        System.out.println("Descripción: " + description);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCapacityMaxPersons() {
        return capacityMaxPersons;
    }

    public void setCapacityMaxPersons(Integer capacityMaxPersons) {
        this.capacityMaxPersons = capacityMaxPersons;
    }

    public Integer getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(Integer numberRooms) {
        this.numberRooms = numberRooms;
    }


    @Override
    public String toString() {
        return "Rooms{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", capacityMaxPersons=" + capacityMaxPersons +
                ", numberRooms=" + numberRooms +
                '}';
    }
}
