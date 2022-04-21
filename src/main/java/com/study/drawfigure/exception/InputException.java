package com.study.drawfigure.exception;

import java.io.IOException;
import java.util.NoSuchElementException;

public class InputException extends NoSuchElementException {
    public InputException(){
        super("입력에는 숫자가 아닌 문자가 들어갈 수 없습니다.");
    }
}
