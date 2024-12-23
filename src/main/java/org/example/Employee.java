package org.example;

import org.example.models.Address;
import org.example.models.Contact;
import org.example.models.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private Integer age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phoneList = new ArrayList<>();
    private List<Contact> contacts= new ArrayList<>();

    public Employee() {
    }

    public Employee(Integer age, String gender, String name, Address address, List<Phone> phoneList, List<Contact> contacts) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.phoneList = phoneList;
        this.contacts = contacts;
    }

    public static class EmployeeBuilder implements IBuilder {
        private Integer age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phoneList;
        private List<Contact> contacts;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setAge(int age) {//hace que sea totalmente opcional
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name) {//hace que sea totalmente opcional
            this.name = name;
            return this;
        }

        public EmployeeBuilder setGender(String gender){
            this.gender=gender;
            return this;
        }
        public EmployeeBuilder setAddress(Address address){
            this.address= address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String zipCode){
            this.address= new Address(address,city,country,zipCode);
            return this;
        }
        public EmployeeBuilder setPhone(Phone phone){
            this.phoneList.add(phone);
            return this;
        }
        public EmployeeBuilder setPhone(String phoneNumber, String ext, String phoneType){
            this.phoneList.add(new Phone(phoneNumber,ext,phoneType));
            return this;
        }
        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact);
            return this;
        }
        public EmployeeBuilder setContact(String name, Phone phone, Address address){
            this.contacts.add(new Contact(name,phone,address));
            return this;
        }


        @Override
        public Employee Build() {
            return new Employee(age,name,gender,address,phoneList,contacts);
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n age=" + age +
                "\n , name='" + name + '\'' +
                "\n , gender='" + gender + '\'' +
                "\n , address=" + address +
                "\n , phoneList=" + phoneList +
                "\n , contacts=" + contacts +
                '}';
    }
}
