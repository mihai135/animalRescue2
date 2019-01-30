package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Vet vet;
    private Animal animal;
    private List<Food> foodList = new ArrayList<Food>();
    private Recreation[] availableRecreations = new Recreation[3];

    private void initRecreation() {
        Recreation activity1 = new Recreation("running");
        Recreation activity2 = new Recreation("ball chaseing");
        availableRecreations[0] = activity1;
        availableRecreations[1] = activity2;
    }

    private void initFood() {
        Food food1 = new Food("meat");
        Food food2 = new Food("bones");
        foodList.add(food1);
        foodList.add(food2);
    }

    public void contentList() {
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i).getName());
        }
    }

    public void contentArray(){
        for (Recreation recreation:availableRecreations){
            if (recreation != null){
                System.out.println(recreation.getName() );

            }
        }


    }

    public void start(Game game){
        game.initFood();
        game.initRecreation();
        game.contentList();
        System.out.println();
        game.contentArray();


    }




    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
