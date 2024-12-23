package org.example.directors;


import org.example.Employee;
import org.example.models.Address;
import org.example.models.Phone;

public class EmployeeDirector {

    private final Employee.EmployeeBuilder builder;

    public EmployeeDirector(Employee.EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee createDefaultEmployeeMale(String name,String PhoneNumber) {
        return builder
                .setName(name)
                .setAge(30)
                .setGender("Male")
                .setAddress(new Address("123 Main St", "New York", "USA", "10001"))
                .setPhone(new Phone(PhoneNumber ,"001", "Mobile"))
                .Build();
    }
    public Employee createDefaultEmployeeFemale(String name,String PhoneNumber) {
        return builder
                .setName(name)
                .setAge(30)
                .setGender("Female")
                .setAddress(new Address("123 Main St", "New York", "USA", "10001"))
                .setPhone(new Phone(PhoneNumber, "001", "Mobile"))
                .Build();
    }

    public Employee createEmployeeWithMultipleContacts() {
        return builder
                .setName("Jane Smith")
                .setAge(40)
                .setGender("Female")
                .setAddress("456 Elm St", "San Francisco", "USA", "94107")
                .setPhone("9876543210", "002", "Work")
                .setContact("Emergency Contact",
                        new Phone("1112223333", "003", "Home"),
                        new Address("789 Oak St", "Los Angeles", "USA", "90001"))
                .Build();
    }

    public Employee createMinimalEmployee() {
        return builder
                .setName("Minimal User")
                .Build();
    }

    public Employee createCustomEmployee(String name, int age, String gender) {
        return builder
                .setName(name)
                .setAge(age)
                .setGender(gender)
                .Build();
    }
}