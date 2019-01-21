package org.fasttrackit;

public class Dog extends Animal {

    public static int dogHunger;
    private String furColor;



    @Override
    public void happiness() {
        System.out.println("The dog moves the tail");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
