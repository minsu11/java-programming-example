package org.example01.solution;

public class Exam01{
    public static void main(String[] args) {
        List<Integer> intList = new DoubleLinkedList<>();

        System.out.println("Int List Empty:"+intList.isEmpty());
        System.out.println("Int List Size:"+intList.size());
        System.out.println("------------------------------");
        intList.add(1);
        System.out.println(intList.size());
        System.out.println("Int List Empty:"+intList.isEmpty());
        System.out.println("Int List Size:"+intList.size());
        System.out.println("------------------------------");
        intList.remove(0);
        System.out.println("Int List Empty:"+intList.isEmpty());
        System.out.println("Int List Size:"+intList.size());
        System.out.println("------------------------------");

        intList.add(20);
        intList.add(1);
        intList.add(100);
        intList.add(220);
        intList.add(24);

        System.out.println(intList.toString());
        intList.sort();
        System.out.println(intList.toString());
        


        
        
    }
}