package com.jomariabejo.payrollsystem.payroll_system.model;

public class Person {
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;

    public Person(String lastName, String firstName, String birthday, String address, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
