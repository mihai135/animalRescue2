package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Adopter adopter;
    private Vet vet;
    private Animal animal;
    private Food food;
    private List<Food> foodList = new ArrayList<Food>();
    private Recreation[] availableRecreations = new Recreation[3];


    private void initAnimal(){
        Animal dog = new Dog();
        animal = dog;
        dog.setAge(2);
        dog.setHealth(5);
        dog.setHunger(6);
        dog.setHappiness(3);
        dog.setFavFood("meat");
        dog.setPrefActivity("ball chaseing");
        ((Dog) dog).setFurColor("black");
    }


    private void initRescuer(){
        Adopter rescuer = new Adopter();
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = input.next();
        System.out.println("Hello " + name);
        System.out.println();
        rescuer.setName(name);
        rescuer.setMoney(50);
    }

    private void nameAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's the name of your adopted dog? ");
        String name = input.next();
        animal.setName(name);
        System.out.println(name + " is a great name!");
        System.out.println();
    }

    private void requireFeeding(){
        Food foodd = new Food("sausage");
        food = foodd;
        initFood();
        Scanner input = new Scanner(System.in);
        System.out.println(animal.getName() + " is hungry. What do you give him to eat: ");
        contentList();
        String name = input.next();
        foodd.setName(name);
        System.out.println("You feed the animal with " + foodd.getName());

    }

    private void initRecreation() {
        Recreation activity1 = new Recreation("running");
        Recreation activity2 = new Recreation("ball chaseing");
        availableRecreations[0] = activity1;
        availableRecreations[1] = activity2;
    }

    private void initFood() {
        Food food1 = new Food("meat");
        Food food2 = new Food("bones");
        Food food3 = new Food("milk");
        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
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

    public void start(){
        initAnimal();
        initRescuer();
        nameAnimal();
        requireFeeding();
//        initFood();
//        initRecreation();
//        contentList();
//        System.out.println();
//        contentArray();


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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
