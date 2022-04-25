package com.study.drawfigure.exception;

public class NonNumericCharacterException extends RuntimeException {
    public NonNumericCharacterException(Throwable cause) {
        super("숫자가 아닌 문자가 입력값으로 올 수 없습니다.", cause);
    }
}
