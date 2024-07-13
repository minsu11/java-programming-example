package org.example.designpattern.singleton.factory;

@CreationBean()
public class Apple {
    private String name;
    private static String value;
    public Apple(){
    }
    public String getValue(){
        return value;
    }
}
