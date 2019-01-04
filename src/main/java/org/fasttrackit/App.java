package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {

        Food food = new Food();
        food.setName("bones");
        food.setPrice(5);
        food.setQuantity(3);
        food.setStock(true);

        Recreation activity = new Recreation("running");


        Animal pet = new Animal();
        pet.setName("Rex");
        pet.setAge(3);
        pet.setHealth(8);
        pet.setHunger(6);
        pet.setHappiness(9);
        pet.setFoodName(food);
        pet.setPrefActivity(activity);

        Adopter adopter = new Adopter("Michael", 200);

        Vet doctor = new Vet("Harry", "surgeon");

        Game game = new Game();
        game.adopter = adopter;
        game.animal = pet;
        game.vet = doctor;

        adopter.feeding (pet, food);
        adopter.playing(pet, activity);



    }
}
