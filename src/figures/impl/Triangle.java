package figures.impl;

import figures.Area;

public class Triangle implements Area {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateTheArea() {
        return 0.5 * base * height;
    }
}