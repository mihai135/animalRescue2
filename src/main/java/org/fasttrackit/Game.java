package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Adopter adopter;
    private Vet vet;
    private Animal animal;
    private Food food;
    private Recreation recreation;
    private List<Food> foodList = new ArrayList<Food>();
    private Recreation[] availableRecreations = new Recreation[3];
    int counter = 0;


    private void initAnimal(){
        Animal dog = new Dog();
        animal = dog;
        dog.setAge(2);
        dog.setHealth(5);
        dog.setHunger(6);
        dog.setHappiness(3);
        dog.setFavFood("meat");
        dog.setPrefActivity("ball chasing");
        ((Dog) dog).setFurColor("black");
    }


    private void initRescuer(){
        Adopter rescuer = new Adopter();
        adopter = rescuer;
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
        Scanner input = new Scanner(System.in);
        System.out.println(animal.getName() + " is hungry. What do you give him to eat? ");
        System.out.println();
        contentList();
        String name = "default";
        boolean condition;
        do {
            System.out.println("Enter 1,2 or 3");
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if (choice == 1) {
                    name = "meat";
                    condition = true;
                }
                else if (choice == 2){
                    name = "bones";
                    condition = true;
                }
                else if (choice == 3) {
                    name = "milk";
                    condition = true;
                }
                else condition = false;
            }
            else {
                condition = false;
                input.next();
            }
        } while (!(condition));
                foodd.setName(name);
                System.out.println();
                System.out.println("You feed the animal with " + foodd.getName());
                adopter.feeding(animal, food);


    }

    private void requirePlaying(){
        Recreation play = new Recreation("hiding");
        recreation = play;
        initRecreation();
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println(animal.getName() + " wants to play. What game do you choose? ");
        System.out.println();
        contentArray();
        String name = "default";
        boolean condition;
        do {
            System.out.println("Enter 1,2 or 3 ");
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if (choice == 1) {
                    name = "running";
                    condition = true;
                }
                else if (choice == 2){
                    name = "ball chasing";
                    condition = true;
                }
                else if (choice == 3) {
                    name = "hide and seek";
                    condition = true;
                }
                else condition = false;
            }
            else {
                condition = false;
                input.next();
            }
        } while (!(condition));
        play.setName(name);
        System.out.println();
        System.out.println("You played " + play.getName());
        adopter.playing(animal, recreation);


    }

    private void initRecreation() {
        Recreation activity1 = new Recreation("1. running");
        Recreation activity2 = new Recreation("2. ball chasing");
        Recreation activity3 = new Recreation("3. hide and seek");
        availableRecreations[0] = activity1;
        availableRecreations[1] = activity2;
        availableRecreations[2] = activity3;
    }

    private void initFood() {
        Food food1 = new Food("1. meat");
        Food food2 = new Food("2. bones");
        Food food3 = new Food("3. milk");
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
        initFood();
        do{
            requireFeeding();
            requirePlaying();
            counter++;
        } while (counter <= 3 && animal.getHunger()<=9 && animal.getHappiness()>=0);
        if (animal.getHunger()>=9 || animal.getHappiness()<=0){
            System.out.println();
            System.out.println(animal.getName() + " is unhappy and it runs away!");
        }
        else {
            System.out.println();
            System.out.println(animal.getName() + " is happy and well fed! Congratulations!");
        }
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
