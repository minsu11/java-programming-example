package org.example.designpattern;

import org.example.designpattern.singleton.factory.Apple;
import org.example.designpattern.singleton.factory.ClassFramework;

public class Test {
    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        Apple apple2 = (Apple) ClassFramework.createInstance(Apple.class);

        System.out.println(apple);
//        System.out.println(apple2);
    }
}

