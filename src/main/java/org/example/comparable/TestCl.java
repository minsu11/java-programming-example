package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCl<T extends Comparable<T>> {
    List<T> list;

    public TestCl(List<T> list) {
       this.list = list;
    }
    public TestCl(int size) {
        list = new ArrayList<>(size);
    }

    public TestCl() {

    }

    public String toString(){
        return list.toString();
    }

    public void add(T data){
        list.add(data);
    }
    public void sort(){
        Collections.sort(list);
    }
   public void sort(Comparator<T> comparator){
        Collections.sort(list, comparator);
   }
}
