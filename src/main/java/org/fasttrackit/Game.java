package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Vet vet;
    private Animal animal;
    private List<Food> foodList = new ArrayList<Food>();
    private Recreation[] availableRecreations = new Recreation[3];

    Food food1 = new Food("meat");
    Food food2 = new Food("bones");
    Food food3 = new Food("milk");

    Recreation activity1 = new Recreation("running");
    Recreation activity2 = new Recreation("ball chaseing");
    Recreation activity3 = new Recreation("hiding");

    private void initRecreation(int index, Recreation recreation){
        availableRecreations[index] = recreation;
    }

    private void initFood(Food food){
        foodList.add(food);
    }

    public void start(){
        Game game = new Game();
        game.initFood(food1);
        game.initFood(food2);
        game.initFood(food3);

        game.initRecreation(0,activity1);
        game.initRecreation(1,activity2);
        game.initRecreation(2,activity3);

        for (int i=0; i< foodList.size(); i++){
            System.out.println(foodList.get(i));
        }

        for (Recreation recreation:availableRecreations){
            if (recreation != null){
                System.out.println(recreation.getName() );

            }
        }
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
