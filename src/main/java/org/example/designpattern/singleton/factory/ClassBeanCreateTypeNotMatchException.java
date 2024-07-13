package org.example.designpattern.singleton.factory;

public class ClassBeanCreateTypeNotMatchException extends RuntimeException{
    public ClassBeanCreateTypeNotMatchException() {
        super("빈 등록 타입이 맞지 않습니다.");
    }
}
