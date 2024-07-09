package org.example03;

import org.example03.solution.DoubleListStack;
import org.example03.solution.Stack;

public class Exam03 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new DoubleListStack<>();
        System.out.println("IntStack Count: "+intStack.count());
        System.out.println("Stack Empty: "+intStack.isEmpty());
        intStack.push(5);
        System.out.println("Stack Peek: "+intStack.count());

        System.out.println("Stack Peek: "+intStack.peek());
        intStack.pop();
        System.out.println("Stack Empty: "+ intStack.isEmpty());
        intStack.push(2);
        intStack.push(10);
        intStack.push(3);
        intStack.push(4);
        intStack.push(1);
        System.out.println("Stack Peek: "+intStack.peek());
        intStack.sort();
        System.out.println("Stack Empty: "+intStack.isEmpty());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println("Stack Empty: "+intStack.isEmpty());

    }
}
