package com.workintech.S18D2.main;

import com.workintech.S18D2.enums.Direction;
import com.workintech.S18D2.enums.LampType;
import com.workintech.S18D2.enums.PaintColor;
import com.workintech.S18D2.model.*;
import com.workintech.S18D2.parent.Bedroom;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom =new Bedroom(
                "Serkan",
                new Wall(Direction.NORTH),
                new Wall(Direction.WEST),
                new Wall(Direction.SOUTH),
                new Wall(Direction.EAST),
                new Ceiling(3, PaintColor.GRAY),
                new Lamp(LampType.LED,true,8),
                new Wardrobe(2,2.5,45),
                new Carpet(1.5,2,PaintColor.BLUE),
                new Bed("Double",2,1,1,1)
        );
        System.out.println(bedroom);
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom.getBed());

    }
}