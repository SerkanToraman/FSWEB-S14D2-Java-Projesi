package com.workintech.S18D2.parent;

import com.workintech.S18D2.model.*;

public class Bedroom extends Room{
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Wardrobe wardrobe, Carpet carpet, Bed bed) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp);
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.bed = bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name " +getName()+ "\n"+"\n");
        builder.append("Wall1: " +getWall1()+ "\n");
        builder.append("Wall2: "+ getWall2() + "\n");
        builder.append("Wall3 " +getWall3()+ "\n");
        builder.append("Wall4: " +getWall4()+ "\n"+"\n");
        builder.append("Ceiling: "+ getCeiling() + "\n");
        builder.append("Lamp: "+ getLamp() + "\n");
        builder.append("Wardrobe: "+ wardrobe + "\n");
        builder.append("Carpet: "+ carpet + "\n");
        builder.append("Bed: "+ bed + "\n");
        return builder.toString();
    }
}
