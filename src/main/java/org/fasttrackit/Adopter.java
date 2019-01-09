package org.fasttrackit;

public class Adopter {

    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;

    }

    public void feeding (Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
    }

    public void playing (Animal animal, Recreation recreation){

        System.out.println(name + " is playing " + recreation.getName() + " with " + animal.getName() );
    }


 }
