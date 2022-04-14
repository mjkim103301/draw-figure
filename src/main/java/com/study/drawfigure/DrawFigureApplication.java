package com.study.drawfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@Slf4j
public class DrawFigureApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DrawFigure rectangle;
        DrawFigure rightTriangle;

        try {
            log.info("직사각형 밑변의 길이와 높이를 입력해주세요. 구분자: 띄어쓰기");
            rectangle = new DrawFigure(new Rectangle(scan.nextDouble(), scan.nextDouble()));

            log.info("=== 직사각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rectangle.getBaseLength());
            log.info("높이: {}", rectangle.getHeight());
            log.info("넓이: {}", rectangle.getArea());
        } catch (LengthException e) {
            log.error(e.getMessage());
        }

        try {
            log.info("직각삼각형 밑변의 길이와 높이를 입력해주세요. 구분자: 띄어쓰기");
            rightTriangle = new DrawFigure(new RightTriangle(scan.nextDouble(), scan.nextDouble()));

            log.info("=== 직각삼각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rightTriangle.getBaseLength());
            log.info("높이: {}", rightTriangle.getHeight());
            log.info("넓이: {}", rightTriangle.getArea());
        } catch (LengthException e) {
            log.error(e.getMessage());
        }
    }
}
