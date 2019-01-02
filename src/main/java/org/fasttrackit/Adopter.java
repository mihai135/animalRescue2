package org.fasttrackit;

public class Adopter {

    String name;
    int money;

    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;

    }


    public void feeding (String animal, String food) {

        System.out.println(name + " just gave some " + food + " food to " + animal);
    }

    public void playing (String animal, String activity){

        System.out.println(name + " is playing " + activity + " with " + animal );
    }


 }
