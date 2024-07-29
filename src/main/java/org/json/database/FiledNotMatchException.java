package org.json.database;

public class FiledNotMatchException extends RuntimeException{
    public FiledNotMatchException(){
        super("필드 명을 잘못 입력하셨습니다.");
    }
    public FiledNotMatchException(String message){
        super(message);
    }
}
