package com.company;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    public Car car;

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }
}
