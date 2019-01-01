package org.fasttrackit;



public class App
{
    public static void main( String[] args )
    {

        Food food = new Food();
        food.name = "meat";
        food.price = 50;
        food.quantity = 3;
        food.stock = true;

        Recreation activity = new Recreation("running");


        Animal pet = new Animal();
        pet.name = "Dog";
        pet.age = 2;
        pet.health = 7;
        pet.hunger = 6;
        pet.happiness = 9;
        pet.foodName = food;
        pet.prefActivity = activity;

        Adopter adopter = new Adopter("Mike");
        adopter.money = 200;

        Vet doctor = new Vet("Harry");
        doctor.specialization = "surgeon";





    }
}
