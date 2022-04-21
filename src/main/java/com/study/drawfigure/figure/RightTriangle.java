package com.study.drawfigure.figure;

import com.study.drawfigure.Figure;
import com.study.drawfigure.exception.LengthException;

public class RightTriangle implements Figure {
    private double baseLength;
    private double height;

    public RightTriangle(double baseLength, double height) throws LengthException {
        if (baseLength < 0 || height < 0) {
            throw new LengthException("직각삼각형");
        }
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseLength * height / 2.0;
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
