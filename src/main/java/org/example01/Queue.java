package org.example01;

public interface Queue<E> {
    void add(E data);

    E element();

    boolean isEmpty();

    E remove();

    int size();
    
} 
