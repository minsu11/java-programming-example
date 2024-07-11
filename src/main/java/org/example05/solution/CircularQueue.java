package org.example05.solution;

import org.example05.solution.Queue;
import java.util.NoSuchElementException;
public class CircularQueue<E> implements Queue<E> {
    private static int CAPACITY_INIT;
    private int front;
    private int rear ;
    private int count;
    private E[] elements;

    @SuppressWarnings("unchecked")
    public CircularQueue(){
        CAPACITY_INIT = 10;
        elements = (E[]) new Object[CAPACITY_INIT];
    }

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacityInit){
        CAPACITY_INIT = capacityInit;
        elements = (E[]) new Object[CAPACITY_INIT];
    }

    @Override
    public void add(E data) {
        if(front == rear %  CAPACITY_INIT && elements[front] != null ){
            resize();
        }
        elements[rear % CAPACITY_INIT ] = data;
        rear++;
        count++;
    }

    @Override
    public E element() {
        checkElement();
        return elements[front];
    }

    @Override
    public boolean isEmpty() {
        return isCheckElement();
    }

    @Override
    public E pop() {
        checkElement();
        return removeElement();
    }


    @Override
    public int size() {
        return elements.length;
    }

    private void checkElement(){
        if(isCheckElement()){
            throw new NoSuchElementException();
        }
    }

    private boolean isCheckElement(){
        return count == 0;
    }

    private E removeElement(){
        E data = element();
        elements[front] = null;
        front++;
        count--;
        return data;
    }

    @SuppressWarnings("unchecked")
    private void resize(){
        CAPACITY_INIT *=2;
        E[] copyElements = (E[]) new Object[CAPACITY_INIT]; 
        arrayCopy(elements, front, copyElements, size());
        elements = copyElements;
        this.front = 0;
        this.rear = count;
    }


    private void arrayCopy(E[] src, int srcPos, E[] dest, int length ){
        int f = srcPos;
        for(int i = 0; i < length; i++ ){
            if(f == size()){
                f = 0;
            }
            
            dest[i] = src[f];
            f++;    
        }
    }

    
    
}
