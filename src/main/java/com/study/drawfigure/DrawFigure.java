package com.study.drawfigure;

public class DrawFigure {
    private Figure figure;

    public DrawFigure(Figure figure) {
        this.figure = figure;
    }

    public double getArea() {
        return figure.getArea();
    }

    public double getHeight() {
        return figure.getHeight();
    }

    public double getBaseLength() {
        return figure.getBaseLength();
    }
}
