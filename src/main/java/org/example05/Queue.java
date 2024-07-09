package org.example05;

public interface Queue<E> {
    void add(E data);

    E element();

    boolean isEmpty();

    E pop();

    int size();
    
} 
