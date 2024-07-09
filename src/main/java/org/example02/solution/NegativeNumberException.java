package org.example02.solution;


public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(){
        super("음수 예외");
    }

    public NegativeNumberException(String msg){
        super(msg);
    }    
    
}
