package com.study.drawfigure;

public class Rectangle implements Figure {

    private double baseLength;
    private double height;

    public Rectangle(double baseLength, double height) throws LengthException {
        if (baseLength < 0 || height < 0) {
            throw new LengthException("직사각형");
        }
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
