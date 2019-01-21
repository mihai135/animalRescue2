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
        pet.hunger = 8;
        pet.setName("Rex");
        pet.setAge(3);
        pet.setHealth(8);
        pet.setHappiness(9);
        pet.setFoodName(food);
        pet.setPrefActivity(activity);

        Animal dog = new Dog();
        ((Dog) dog).dogHunger = 9;
        dog.setName("Azor");
        dog.setAge(3);
        dog.setHealth(8);
        dog.setHappiness(9);
        dog.setFoodName(food);
        dog.setPrefActivity(activity);
        ((Dog) dog).setFurColor("white");

        Animal cat = new Cat();
        ((Cat) cat).catHunger = 5;
        cat.setName("Tom");
        cat.setAge(3);
        cat.setHealth(8);
        cat.setHappiness(9);
        cat.setFoodName(food);
        cat.setPrefActivity(activity);
        ((Cat) cat).setFurPatern("stripes");


        Adopter adopter = new Adopter("Michael", 200);

        Vet doctor = new Vet("Harry", "surgeon");

        Game game = new Game();
        game.setAdopter(adopter);
        game.setAnimal(pet);
        game.setVet(doctor);

        adopter.feeding (pet, food);
        adopter.feedingDog ((Dog) dog, food);
        adopter.feedingCat((Cat) cat,food );

        adopter.playing(pet, activity);

        pet.happiness();
        dog.happiness();
        cat.happiness();



    }
}
