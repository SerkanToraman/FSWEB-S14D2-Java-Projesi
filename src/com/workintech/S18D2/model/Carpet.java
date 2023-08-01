package com.workintech.S18D2.model;

import com.workintech.S18D2.enums.PaintColor;

public class Carpet {
    private double width;
    private double height;
    private PaintColor color;

    public Carpet(double width, double height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor");
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Width " +width+ "\n");
        builder.append("Height: " +height+ "\n");
        builder.append("Color: "+ color + "\n");
        return builder.toString();
    }

}
