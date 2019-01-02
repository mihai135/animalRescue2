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

        Play1 play = new Play1("chasing ball");
        play.place = "yard";

        Play2 play2 = new Play2("playing");
        play2.object = "stick";


        Animal pet = new Animal();
        pet.setName("dog");
        pet.setAge(3);
        pet.setHealth(8);
        pet.setHunger(6);
        pet.setHappiness(9);
        pet.setFoodName(food);
        pet.setPrefActivity(activity);

        Adopter adopter = new Adopter("Mike", 200);

        Vet doctor = new Vet("Harry", "surgeon");

        Game game = new Game();
        game.adopter = adopter;
        game.animal = pet;
        game.vet = doctor;

        adopter.feeding (pet.getName(), food.getName());
        adopter.playing(pet.getName(), play.name);


    }
}
