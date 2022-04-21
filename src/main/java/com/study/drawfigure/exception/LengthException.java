package com.study.drawfigure.exception;

import java.io.IOException;

public class LengthException extends RuntimeException {
    public LengthException(String message) {
        super(message + " 도형의 길이는 음수가 될 수 없습니다.");
    }
}
