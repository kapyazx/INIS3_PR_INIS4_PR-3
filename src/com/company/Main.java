package com.company;

public class Main {

    public static void main(String[] args) {
	Human Kacper = new Human();
	Kacper.pet = new Animal("dog", 5.0, "Milka");
	Kacper.auto = new Car("Chiron", "Bugatti");


	System.out.println(Kacper.pet.name);
	System.out.println(Kacper.pet.species);

		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
    }
}
