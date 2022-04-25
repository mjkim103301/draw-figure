package com.study.drawfigure.figure;

import com.study.drawfigure.Figure;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RightTriangle implements Figure {
    private double baseLength;
    private double height;

    public RightTriangle(double baseLength, double height) {
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
