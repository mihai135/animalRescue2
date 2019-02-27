package org.fasttrackit;

import org.fasttrackit.domain.Animals;

public class Cat extends Animals {

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
