package com.workintech.S18D2.enums;

public enum Direction {
    NORTH(90),
    SOUTH(270),
    EAST(180),
    WEST(0);

    private int degree;

    Direction(int degree) {
        this.degree = degree;
    }
}
