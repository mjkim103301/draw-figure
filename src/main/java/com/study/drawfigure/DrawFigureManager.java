package com.study.drawfigure;

import com.study.drawfigure.exception.NegativeLengthException;
import com.study.drawfigure.exception.NonNumericCharacterException;
import com.study.drawfigure.figure.Rectangle;
import com.study.drawfigure.figure.RightTriangle;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class DrawFigureManager {
    private Scanner scan = new Scanner(System.in);
    private DrawFigure rectangle;
    private DrawFigure rightTriangle;
    private boolean isContinue = true;

    public void run() {
        while (isContinue) {
            try {
                drawRectangle();
                if (!isContinue) {
                    break;
                }
                drawRightTriangle();
            } catch (NonNumericCharacterException e) {
                log.error(e.getMessage());
                log.error(String.valueOf(e.getCause()));
                e.printStackTrace();
            } finally {
                log.info("입력을 종료하려면 '-1'을 계속 진행하려면 다른 정수를 입력하세요.");
                if (scan.nextLine().equals("-1")) {
                    isContinue = false;
                }
            }
        }
        log.info("도형 그리기가 종료됐습니다.");
    }


    public void drawRectangle() throws NonNumericCharacterException {
        log.info("직사각형 밑변의 길이와 높이를 입력해주세요. 구분자: enter");
        try {
            double baseLength = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            if (baseLength < 0 || height < 0) {
                throw new NegativeLengthException("직사각형");
            }
            rectangle = new DrawFigure(new Rectangle(baseLength, height));

            log.info("=== 직사각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rectangle.getBaseLength());
            log.info("높이: {}", rectangle.getHeight());
            log.info("넓이: {}", rectangle.getArea());
        } catch (NumberFormatException e) {
            throw new NonNumericCharacterException(e);
        } catch (NegativeLengthException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public void drawRightTriangle() {
        log.info("직각삼각형 밑변의 길이와 높이를 입력해주세요. 구분자: enter");
        try {
            double baseLength = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            if (baseLength < 0 || height < 0) {
                throw new NegativeLengthException("직각삼각형");
            }
            rightTriangle = new DrawFigure(new RightTriangle(baseLength, height));

            log.info("=== 직각삼각형 정보 (cm, cm^2) ===");
            log.info("밑변의 길이: {}", rightTriangle.getBaseLength());
            log.info("높이: {}", rightTriangle.getHeight());
            log.info("넓이: {}", rightTriangle.getArea());
        } catch (NumberFormatException e) {
            throw new NonNumericCharacterException(e);
        } catch (NegativeLengthException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
