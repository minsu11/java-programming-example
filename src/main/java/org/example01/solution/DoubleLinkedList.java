package org.example01.solution;

import java.util.LinkedList;
import java.util.Objects;

public class DoubleLinkedList<E> implements List<E>{
    private int size;
    private Node<E> head;
    private Node<E> tail;

    @Override
    public boolean add(E data) {
        // TODO Auto-generated method stub
        linkLast(data);    
        return true;
    }
    
    private void linkLast(E data){
        final Node<E> newNode = new Node<E>(data, this.tail, null);
        final Node<E> last = this.tail;
        this.tail = newNode;
        
        if(Objects.isNull(last)){
            head = newNode;
        }else{
            last.next = newNode;
        }
        size++;

    }

    @Override
    public void addFirst(E data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(E data, int index){

    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size() == 0;
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return this.size;
    }
    private static class Node<E>{
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
