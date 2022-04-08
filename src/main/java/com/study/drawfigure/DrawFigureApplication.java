package com.study.drawfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
public class DrawFigureApplication {

    public static void main(String[] args) {
        DrawFigure rectangle = new DrawFigure(new Rectangle(5, 5.5));
        DrawFigure rightTriangle = new DrawFigure(new RightTriangle(5, 5.5));

        log.info("=== 직사각형 정보 (cm, cm^2) ===");
        log.info("밑변의 길이: {}", rectangle.getBaseLength());
        log.info("높이: {}", rectangle.getHeight());
        log.info("넓이: {}", rectangle.getArea());

        log.info("=== 직각삼각형 정보 (cm, cm^2) ===");
        log.info("밑변의 길이: {}", rightTriangle.getBaseLength());
        log.info("높이: {}", rightTriangle.getHeight());
        log.info("넓이: {}", rightTriangle.getArea());

    }

}
