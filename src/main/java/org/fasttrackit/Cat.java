package org.fasttrackit;

public class Cat extends Animal {

    public static int catHunger;
    private String furPatern;

    @Override
    public void happiness() {
        System.out.println("The cat purrs");
    }

    public String getFurPatern() {
        return furPatern;
    }

    public void setFurPatern(String furPatern) {
        this.furPatern = furPatern;
    }
}
