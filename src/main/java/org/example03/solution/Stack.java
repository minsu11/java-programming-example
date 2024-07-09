package org.example03.solution;

public interface Stack<E> {
    void push(E data);

    E pop();
    
    E peek();

    int count();

    boolean isEmpty();

    void sort();
}
