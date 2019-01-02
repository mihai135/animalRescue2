package org.fasttrackit;



public class App
{
    public static void main( String[] args )
    {

        Food food = new Food();
        food.setName("meat");
        food.setPrice(5);
        food.setQuantity(3);
        food.setStock(true);

        Recreation activity = new Recreation("running");


        Animal pet = new Animal();
        pet.setName("dog");
        pet.setAge(3);
        pet.setHealth(8);
        pet.setHunger(6);
        pet.setHappiness(9);
        pet.setFoodName(food);
        pet.setPrefActivity(activity);

        Adopter adopter = new Adopter("Mike");
        adopter.money = 200;

        Vet doctor = new Vet("Harry");
        doctor.specialization = "surgeon";





    }
}
