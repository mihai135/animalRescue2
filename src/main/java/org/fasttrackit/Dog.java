package org.fasttrackit;

import org.fasttrackit.domain.Animals;

public class Dog extends Animals {

    private String furColor;

    @Override
    public void happiness() {
        System.out.println(getName() + " is happy and moves the tail");
    }


    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
