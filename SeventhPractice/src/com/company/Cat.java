package com.company;

public class Cat {
    private final String name;

    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p){
        if (p.decreaseFood(appetite)){
            satiety = true;
        }
    }

    public void status(){
        if (satiety){
            System.out.println("Кот " + getName() + " наелся");
        }else
            System.out.println("Кот " + getName() + " не наелся");
    }
}
