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
        System.out.println(animal.getName() + "'s hunger level is " + animal.getHunger());
        System.out.println(animal.getName() + "'s happiness level is " + animal.getHappiness());
        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());
        animal.setHunger(animal.getHunger()-1);
        if (food.getName()==animal.getFavFood()){
            animal.setHappiness(animal.getHappiness()+1);
        }
        System.out.println("The new hunger level is " + animal.getHunger());
        System.out.println("The new happiness level is " + animal.getHappiness());

    }

    public void playing (Animal animal, Recreation recreation){
        System.out.println();
        System.out.println(animal.getName() + "'s happiness level is " + animal.getHappiness());
        System.out.println(name + " is playing " + recreation.getName() + " with " + animal.getName() );
        if (recreation.getName()==animal.getPrefActivity()){
            animal.setHappiness(animal.getHappiness()+2);
        }
        else animal.setHappiness(animal.getHappiness()+1);
        System.out.println("The new happiness level is " + animal.getHappiness());

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
