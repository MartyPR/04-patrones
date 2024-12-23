package org.example;

import org.example.EmployeeDirector;
import org.example.models.Address;
import org.example.models.Phone;

public class Main {
    public static void main(String[] args) {
        //creacion de empleados solo con el builder
        Employee employee = new Employee.EmployeeBuilder()
                .setAge(24)
                .setName("Simon")
                .Build();//pueden ser opcionales o obligaaatios
        Employee employee2 = new Employee.EmployeeBuilder()
                .setAge(24)
                .setName("Carla")
                .setGender("Male")
                .setAddress(new Address("Calle 3","Cali","Colombia","1231"))
                .Build();

        Employee employee4 = new Employee.EmployeeBuilder()
                .setAge(24)
                .setName("Carla")
                .setGender("Male")
                .setAddress("Calle 32","Cali","Colombia","1231")
                .setPhone("13212312","+57","Fijo")
                .setContact("Simon",
                        new Phone("3123123","+52","cel"),
                        new Address("Car 84","Bogota","Colombia","42321"))
                .Build();
        System.out.println(employee);

        //ejemplo con director
        Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();
        EmployeeDirector director= new EmployeeDirector(builder);

        Employee defaultEmployeeFemale = director.createDefaultEmployeeFemale("Luis","4123123132");
        System.out.println(defaultEmployeeFemale);

        Employee defaultEmployeeMale = director.createDefaultEmployeeFemale("Luis","4123123132");
        System.out.println(defaultEmployeeMale);

        Employee customEmployee = director.createCustomEmployee("Alice Brown", 28, "Female");
        System.out.println(customEmployee);


//        Employee employee= new Employee();
//        Address address= new Address();
//        employee.setAddress(address);
//        Contact contact = new Contact();
//        employee.setContacts(contact);
    }






}