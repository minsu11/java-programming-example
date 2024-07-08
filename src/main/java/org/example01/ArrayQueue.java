package org.example01;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
    
    private int front;
    
    private int back;

    private E[] elements;

    private static int INIT_CAPACITY  = 4;
    
    public ArrayQueue(){
        elements = ((E[]) new Object[INIT_CAPACITY]);
    }

    public ArrayQueue(int capacity){
        elements = ((E[]) new Object[capacity]);
    }

    @Override
    public void add(E data) {
        // TODO Auto-generated method stub
        // 가득 찬 경우
        if(back == elements.length-1){
            resize();
        }
        
        // 데이터를 그냥 넣은 경우
        elements[back] = data;
        if(back < elements.length-1){
            back +=1;
        }
        else{
            back = 0;
        }
    }

    @Override
    public E element() {
        // TODO Auto-generated method stub
        if(size() ==0){
            throw new NoSuchElementException();
        }
        return elements[front];
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size() == 0;
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }

        E data = elements[front];
        elements[front] = null;
        front +=1;

        if(front == back){
            front = back = 0;
        }

        if(front == elements.length){
            front = 0;
        
        }


        return data;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        if(front > back){
            return back - front + elements.length;
        }
        
        return back - front;
    }

    public void resize(){
        int size = size(); // 현재 size
        int len = this.elements.length; // 배열의 크기

        Object[] copyObjects = new Object[2* len];
        System.arraycopy(elements, front, copyObjects, 0, len-front);
        System.arraycopy(elements, 0, copyObjects, len-front, back); // 두 번하는 이유?
        // arrayCopy를 사용하지 않고 resize 하는 문제
        
        elements = (E[]) copyObjects;
        this.front = 0;
        this.back = size; 

    }
    

    @Override
    public String toString() {
        return "ArrayQueue [front=" + front + ", back=" + back + ", elements=" + Arrays.toString(elements) + "]";
    }

    public static void main(String[] args){
        Queue<Integer> queue = new ArrayQueue<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.remove();
        queue.add(2);
        queue.add(1);
                
        

    }
    
    
}
