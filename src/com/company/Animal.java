package com.company;

import java.io.File;

public class Animal {

    final public String species;
    private Double weight;
    public String name;
    public File pic;

    static final public double DEFAULT_ANIMAL_WEIGHT = 2.0;

    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String species){
        this.species = species;
        this.weight = DEFAULT_ANIMAL_WEIGHT;
    }

    void feed(){
        this.weight += 1;
        System.out.println("Thx for food, bro");
    }

    void takeForAWalk(){
        this.weight -= 1;
        System.out.println("I lost 1kg bro");
        if(weight > 0) {
            System.out.println("Im happy doggeh");
        }
        else{
            System.out.println("Im dead bro");
        }
    }



}
