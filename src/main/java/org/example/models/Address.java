package org.example.models;

public class Address {
    private String address;
    private String city;
    private String Country;
    private String zipCode;

    public Address() {
    }

    public Address(String address, String city, String country, String zipCode) {
        this.address = address;
        this.city = city;
        Country = country;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
