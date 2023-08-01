package com.workintech.S18D2.model;

import com.workintech.S18D2.enums.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public  void create(){
        System.out.println("Walls direction is "+ getDirection());
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Direction " +direction);
        return builder.toString();
    }
}
