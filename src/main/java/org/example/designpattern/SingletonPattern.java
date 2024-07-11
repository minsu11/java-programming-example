package org.example.designpattern;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;
    int i = 0;
    private SingletonPattern() {

    }
    public int getI(){
        return this.i;
    }

    public void setI(int i){
        this.i = i;
    }

    public static SingletonPattern getInstance() {
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }


}
