package com.study.drawfigure.exception;

import java.io.IOException;

public class NegativeLengthException extends IOException {
    public NegativeLengthException(String message) {
        super(message + " 도형의 길이는 음수가 될 수 없습니다.");
    }
}
