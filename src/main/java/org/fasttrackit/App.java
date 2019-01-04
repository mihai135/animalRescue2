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

        Dog dog = new Dog();
        dog.setName("Azor");
        dog.setAge(3);
        dog.setHealth(8);
        dog.setHunger(6);
        dog.setHappiness(9);
        dog.setFoodName(food);
        dog.setPrefActivity(activity);
        dog.furColor = "white";

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setHealth(8);
        cat.setHunger(6);
        cat.setHappiness(9);
        cat.setFoodName(food);
        cat.setPrefActivity(activity);
        cat.furPatern = "black white";


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
