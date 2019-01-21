package org.fasttrackit;

public class Animal {

    public static int hunger;
    private String name;
    private int age;
    private int health;
    private int happiness;
    private Food foodName;
    private Recreation prefActivity;

    public void happiness(){
        System.out.println("The animal is happy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public Food getFoodName() {
        return foodName;
    }

    public void setFoodName(Food foodName) {
        this.foodName = foodName;
    }

    public Recreation getPrefActivity() {
        return prefActivity;
    }

    public void setPrefActivity(Recreation prefActivity) {
        this.prefActivity = prefActivity;
    }
}
