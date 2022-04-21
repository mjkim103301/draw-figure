package com.study.drawfigure;

import com.study.drawfigure.exception.InputException;
import com.study.drawfigure.exception.LengthException;
import com.study.drawfigure.figure.Rectangle;
import com.study.drawfigure.figure.RightTriangle;
import lombok.extern.slf4j.Slf4j;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Slf4j
public class DrawFigureManager {
    private Scanner scan = new Scanner(System.in);
    private DrawFigure rectangle;
    private DrawFigure rightTriangle;
    private boolean isContinue = true;

    public void run() {
        while (isContinue) {
            drawRectangle();
            if (!isContinue) {
                break;
            }
            drawRightTriangle();
        }
        log.info("도형 그리기가 종료됐습니다.");
    }

    public void drawRectangle() {
        log.info("직사각형 밑변의 길이와 높이를 입력해주세요. 구분자: 띄어쓰기");
        try {
            double baseLength = scan.nextDouble();
            double height = scan.nextDouble();

            rectangle = new DrawFigure(new Rectangle(baseLength, height));

            log.info("=== 직사각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rectangle.getBaseLength());
            log.info("높이: {}", rectangle.getHeight());
            log.info("넓이: {}", rectangle.getArea());
        } catch (LengthException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            throw new InputException();
        } finally {
            log.info("입력을 종료하려면 '-1'을 계속 진행하려면 다른 정수를 입력하세요.");
            if (scan.nextInt() == -1) {
                isContinue = false;
            }
        }
    }

    public void drawRightTriangle() {
        log.info("직각삼각형 밑변의 길이와 높이를 입력해주세요. 구분자: 띄어쓰기");
        try {
            double baseLength = scan.nextDouble();
            double height = scan.nextDouble();

            rightTriangle = new DrawFigure(new RightTriangle(baseLength, height));

            log.info("=== 직각삼각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rightTriangle.getBaseLength());
            log.info("높이: {}", rightTriangle.getHeight());
            log.info("넓이: {}", rightTriangle.getArea());
        } catch (LengthException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            throw new InputException();
        } finally {
            log.info("입력을 종료하려면 '-1'을 계속 진행하려면 다른 정수를 입력하세요.");
            if (scan.nextInt() == -1) {
                isContinue = false;
            }
        }
    }
}
