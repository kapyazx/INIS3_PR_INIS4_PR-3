package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	Phone iphone = new Phone("apple", "6S", 4.5, "iOS", 2020);
		iphone.turnOn();
		System.out.println(iphone.model);
		System.out.println(iphone.producer);
		Human Kacper = new Human();
		Kacper.pet = new Animal("dog", 5.0, "Milka");


	System.out.println(Kacper.pet.name);
	System.out.println(Kacper.pet.species);

	Human[] people = new Human[3];
	people[0] = new Human();
	people[1] = new Human();
	people[2] = new Human();

	Arrays.sort(people);


		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
		Kacper.pet.takeForAWalk();
    }
}
