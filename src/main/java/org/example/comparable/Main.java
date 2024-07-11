package org.example.comparable;

import javax.annotation.processing.Generated;
import javax.annotation.processing.SupportedAnnotationTypes;
import java.beans.JavaBean;
import java.beans.Transient;

public class Main {
    public static void main(String[] args) {
        Test t = new Test(1,"test4");
        Test t2 = new Test(4,"test2");
        TestCl<Test>  t23 = new TestCl<Test>(3);
        TestComparator testComparator = new TestComparator();
        t23.add(t);
        t23.add(t2);
        t23.add(new Test(3,"test1"));

        System.out.println(t23.toString());
        t23.sort();
        System.out.println("==============");
        System.out.println("data sort");
        System.out.println(t23.toString());
        System.out.println("==============");
        System.out.println("name sort");
        t23.sort((x,y)-> x.getName().compareTo(y.getName()));
        System.out.println(t23.toString());
    }
}
