package org.example05;

import org.example05.solution.CircularQueue;
import org.example05.solution.Queue;

import java.util.ArrayList;
import java.util.List;

public class Exam05 {
    public static List<?> test(List<?> list){
        return list;
    }
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        Queue<Integer> intQue = new CircularQueue<>();
        System.out.println("IntQueue Empty: "+ intQue.isEmpty());
        intQue.add(10);  
        System.out.println("IntQueue Empty: "+ intQue.isEmpty());
        System.out.println("Remove data: "+intQue.pop());
        System.out.println("IntQueue Empty: "+ intQue.isEmpty());
        
        intQue.add(10);
        intQue.add(20);  
        intQue.add(30);  
        intQue.add(40);
        intQue.add(50);  
        intQue.add(60);  
        intQue.add(70);  
        intQue.add(80);
        intQue.add(90);  
        System.out.println("IntQueue count: "+ intQue.size());
        intQue.add(100);
        intQue.add(110);
        System.out.println("IntQueue count: "+ intQue.size());
        System.out.println("IntQueue remove");
         
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue pop: "+intQue.pop());
        System.out.println("IntQueue Empty: "+intQue.isEmpty());

    }
}
