package com.workintech.S18D2.model;

import com.workintech.S18D2.enums.LampType;

public class Lamp {

    private LampType style;
    private boolean battery;
    private int globalRating;

    public Lamp(LampType style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public LampType getStyle() {
        return style;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Style " +style+ "\n");
        builder.append("Battery: " +battery+ "\n");
        builder.append("GlobalRating: "+ globalRating + "\n");
        return builder.toString();
    }
}
