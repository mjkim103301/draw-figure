package com.study.drawfigure;

public class LengthException extends Exception {
    public LengthException(String message) {
        super(message + " 도형의 길이는 음수가 될 수 없습니다.");
    }
}
