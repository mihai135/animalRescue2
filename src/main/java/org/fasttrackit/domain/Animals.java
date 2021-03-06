package org.fasttrackit.domain;

public abstract class Animals {

    private int id;
    private String name;
    private int age;
    private int health;
    private int hunger;
    private int happiness;
    private String favFood;
    private String prefActivity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getPrefActivity() {
        return prefActivity;
    }

    public void setPrefActivity(String prefActivity) {
        this.prefActivity = prefActivity;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", hunger=" + hunger +
                ", happiness=" + happiness +
                ", favFood='" + favFood + '\'' +
                ", prefActivity='" + prefActivity + '\'' +
                '}';
    }

    public abstract void happiness();
}
