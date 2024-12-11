package figures.impl;

import figures.Area;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTheArea() {
        return Math.PI * radius * radius;
    }
}
