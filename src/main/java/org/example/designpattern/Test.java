package org.example.designpattern;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Apple apple = new Apple();
        Apple apple2 = (Apple) ClassFramework.createInstance("org.example.designpattern.Apple.java");

        System.out.println(apple);
//        System.out.println(apple2);
    }
}

