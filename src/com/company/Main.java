package com.company;

public class Main {

    public static void main(String[] args) {
	Human me = new Human();
	me.pet = new Animal("dog", 5.0, "Milka");
	System.out.println(me.pet.name);
	System.out.println(me.pet.species);

		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
    }
}
