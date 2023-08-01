package com.workintech.S18D2.model;

import com.workintech.S18D2.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("Ceiling's Height: "+getHeight()+" Color: "+getPaintedColor()+ "has been created");
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Height " +height+ "\n");
        builder.append("PaintedColor: " +paintedColor+ "\n");
        return builder.toString();
    }
}
