package com.company;

public class Main {

    public static void main(String[] args) {

	    Plate plate = new Plate(150);
		Cat[] cats = {
			new Cat("Барсик", 25),
			new Cat("Рыжиик", 25),
			new Cat("Пушок", 25),
			new Cat("Ириска", 25),
			new Cat("Космос", 55)
		};

		for (Cat cat : cats) {
			cat.eat(plate);
			plate.info();
			cat.status();
			plate.increaseFood(5);
		}
    }
}
