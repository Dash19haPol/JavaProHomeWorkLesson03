package figures.impl;

import figures.Area;

public class Square implements Area {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateTheArea() {
        return side * side;
    }
}
