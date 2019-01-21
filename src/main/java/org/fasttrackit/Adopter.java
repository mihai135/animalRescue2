package org.fasttrackit;

public class Adopter {

    private String name;
    private int money;

    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;

    }

    public void feeding (Animal animal, Food food) {
        System.out.println();
        System.out.println("the animal's hunger level is " + animal.hunger);
        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
        Animal.hunger--;
        System.out.println("the new hunger level is " + Animal.hunger);

    }

    public void feedingDog (Dog animal, Food food) {
        System.out.println();
        System.out.println("the dog's hunger level is " + animal.dogHunger);
        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
        Dog.dogHunger--;
        System.out.println("the new hunger level is " + animal.dogHunger);

    }

    public void feedingCat (Cat animal, Food food) {
        System.out.println();
        System.out.println("the cat's hunger level is " + animal.catHunger);
        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
        Cat.catHunger--;
        System.out.println("the new hunger level is " + animal.catHunger);

    }

    public void playing (Animal animal, Recreation recreation){
        System.out.println();
        System.out.println(name + " is playing " + recreation.getName() + " with " + animal.getName() );
    }

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

 }
