package org.fasttrackit;

public class Cat extends Animal {

    private String furPatern;

    @Override
    public void happiness() {
        System.out.println(getName() + " is happy and purrs");
    }

    public String getFurPatern() {
        return furPatern;
    }

    public void setFurPatern(String furPatern) {
        this.furPatern = furPatern;
    }
}
