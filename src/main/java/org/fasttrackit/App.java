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
        pet.setHunger(7);
        pet.setHappiness(5);
        pet.setFoodName(food);
        pet.setPrefActivity(activity);

        Animal dog = new Dog();
        dog.setName("Azor");
        dog.setAge(3);
        dog.setHealth(8);
        dog.setHunger(9);
        dog.setHappiness(2);
        dog.setFoodName(food);
        dog.setPrefActivity(activity);
        ((Dog) dog).setFurColor("white");

        Animal cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setHealth(8);
        cat.setHunger(5);
        cat.setHappiness(4);
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
        adopter.feeding(dog, food);
        adopter.feeding(cat, food);

        adopter.playing(pet, activity);
        adopter.playing(dog, activity);
        adopter.playing(cat, activity);

        pet.happiness();
        dog.happiness();
        cat.happiness();

    }
}
