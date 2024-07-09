package org.example03.solution;

import java.util.NoSuchElementException;

import org.example01.solution.DoubleLinkedList;

public class DoubleListStack<E extends Comparable<E>> implements Stack<E>{
    private final DoubleLinkedList<E> stackList;

    public DoubleListStack(){
        stackList = new DoubleLinkedList<>();
    }

    @Override
    public int count() {
        return stackList.size();
    }

    @Override
    public E peek() {
        checkElement();
       return stackList.get(stackList.size()-1);
    }

    @Override
    public E pop() {
        checkElement();
        return stackList.remove(stackList.size()-1);
    }

    @Override
    public void push(E data) {
        stackList.add(data);
    }
    
    @Override
    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    @Override
    public void sort(){
        checkElement();
        stackList.sort();
    }

    private void checkElement(){
        if(!isSuchElement()){
            throw new NoSuchElementException("Stack element not such");
        }
    }
    
    private boolean isSuchElement(){
        return stackList.size() != 0;
    }
    @Override
    public String toString(){
        return stackList.toString();
    }
}
