package com.company;

import com.company.device.Car;

public class Human extends Animal implements Washable, Comparable<Human>{
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
    @Override
    public void wash() {
        System.out.println("myju myju");
    }

    @Override
    public void dry() {
        System.out.println("szuuuuuuuuuuuuu");
    }

    @Override
    public int compareTo(Human otherHuman) {
        return (int) (this.weight - otherHuman.weight);
    }
}
