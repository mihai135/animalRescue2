package org.fasttrackit;

public class Cat extends Animal {

    private String furPatern;

    @Override
    public void happiness() {
        String happy = "The cat purrs";
        System.out.println(happy);
    }

    public String getFurPatern() {
        return furPatern;
    }

    public void setFurPatern(String furPatern) {
        this.furPatern = furPatern;
    }
}
