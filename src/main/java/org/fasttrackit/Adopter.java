package org.fasttrackit;

public class Adopter {

    String name;
    int money;

    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;

    }

    public void feeding (Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
    }

    public void playing (Animal animal, Recreation recreation){

        System.out.println(name + " is playing " + recreation.name + " with " + animal.getName() );
    }


 }
