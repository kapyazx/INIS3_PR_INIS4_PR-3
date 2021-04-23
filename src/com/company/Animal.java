package com.company;

import java.io.File;

public class Animal {

    public final String species;
    public Double weight;
    public String name;
    public File pic;

    static final public double DEFAULT_ANIMAL_WEIGHT = 2.0;
    static final public double DEFAULT_DOG_WEIGHT = 5.0;
    static final public double DEFAULT_CAT_WEIGHT = 2.0;
    static final public double DEFAULT_COW_WEIGHT = 300.0;

    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String species) {
        this.species = species;


        switch (this.species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }

    void feed(){
        if(weight > 0) {
            this.weight += 1;
            System.out.println("Thx for food, bro" + this.weight);
            System.out.println("Im happy doggeh");
        }
        else{
            System.out.println("Im dead bro, why are u feedin me?" + this.weight);
        }

    }

    void takeForAWalk(){
        if(weight > 0) {
            this.weight -= 1;
            System.out.println("Thx for walk, bro" + this.weight);
            System.out.println("Im happy doggeh");
        }
        else{
            System.out.println("Im dead bro, what do u want?" + this.weight);
        }
    }



}
