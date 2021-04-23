package com.company;

import com.company.device.Car;

public class Human extends Animal{
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    public Car car;

    static final public String SPECIES = "homo sapiens";

    public Human() {
        super(SPECIES);
    }
    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }
}
