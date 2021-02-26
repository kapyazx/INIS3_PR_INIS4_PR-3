package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal( "dog", 20.0, "Szarik" );


	Human me = new Human();
	me.firstName = "Kacper";
	me.lastName = "Piasecki";
	me.pet = dog;

	System.out.println("Zawierzak nazywa się: " + me.pet.name);
    }
}
