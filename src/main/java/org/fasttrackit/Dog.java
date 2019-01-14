package org.fasttrackit;

public class Dog extends Animal {

   private String furColor;

    @Override
    public void happiness() {
        String happy = "The dog moves the tail";
        System.out.println(happy);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
