package com.workintech.S18D2.model;

public class Wardrobe {
    private double width;
    private double height;
    private double weight;

    public Wardrobe(double width, double height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Width " +width+ "\n");
        builder.append("Height: " +height+ "\n");
        builder.append("Weight: "+ weight + "\n");
        return builder.toString();
    }
}
