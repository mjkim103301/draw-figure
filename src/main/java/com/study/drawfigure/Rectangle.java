package com.study.drawfigure;

public class Rectangle implements Figure {

    private double baseLength;
    private double height;

    public Rectangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * baseLength;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseLength() {
        return baseLength;
    }
}
