package org.example01.solution;

import java.util.Objects;

public class DoubleLinkedList<E extends Comparable<E>> implements List<E>{
    private int size;
    private Node<E> head;
    private Node<E> tail;

    @Override
    public boolean add(E data) {
        linkLast(data);    
        return true;
    }
    
    private void linkLast(E data){
        final Node<E> newNode = new Node<>(data, this.tail, null);
        final Node<E> last = this.tail;
        this.tail = newNode;
        
        if(Objects.isNull(last)){
            head = newNode;
        }else{
            last.next = newNode;
        }
        size++;

    }

    private void linkFirst(E data){
        final Node<E> newNode = new Node<>(data, null, head);
        final Node<E> first = this.head;
        this.head = newNode;

        if(Objects.isNull(first)){
            this.tail = newNode;
        }else{
            first.prev = newNode;
        }
        size++;
    }

    private void insertNode(E data, Node<E> node){
        Node<E> prevNode = node.prev;
        Node<E> newNode = new Node<>(data, prevNode, node);

        node.prev = newNode;

        if(Objects.isNull(prevNode)){
            this.head = newNode;
        }else{
            prevNode.next = newNode;
        }
        size++;

    }

    @Override
    public void addFirst(E data) {
        linkFirst(data);
    }

    @Override
    public void add(E data, int index){
        checkIndex(index);
        if(size == index){
            linkLast(data);
        }else{
            insertNode(data, node(index));
        }

    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).data;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        
        return removeNode(node(index));
    }

    private E removeNode(Node<E> node){
        E result = node.data;
        Node<E> prevNode = node.prev;
        Node<E> nextNode = node.next;
        if(Objects.isNull(prevNode)){
            this.head = nextNode;
        }else{
            prevNode.next = node.next;
            node.next = null;
        }

        if(Objects.isNull(nextNode)){
            this.tail = prevNode;
        }
        else{
            nextNode.prev = prevNode;
            node.prev = null;     
        }
        node.data= null;
        size--;
        return result;
    }


    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> node = node(index);
        E beforeData = node.data;
        node.data = element;
        return beforeData;
    }

    @Override
    public int size() {
        return this.size;
    }

    private Node<E> node(int index){
        if(index < size / 2 ){
            Node<E> result = head;
            for(int i = 0; i < index; i++){
                result = result.next;
            }
            return result;
        }else{
            Node<E> result = tail;
            for(int i = size -1; i>index; i--){
                result = result.prev;
            }
            return result;
        }
        
    }

    @Override
    public void sort(){
        checkNull();
        sortElement();
    }

    private void sortElement(){
        for(int i = 0; i < size(); i++){
            Node<E> node = node(i);
            for(int j = i+1; j < size(); j++){
                Node<E> n = node(j);
                if(node.data.compareTo(n.data) < 0){
                    E data = n.data;
                    n.data = node.data;
                    node.data = data;
                }
            }    
        }

    }

    private void checkIndex(int index){
        if(!isCheckElementIndex(index)){
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isCheckElementIndex(int index){
        return index >= 0 && index < size;
    }

    private void checkNull(){
        if(isCheckNull()){
            throw new NullPointerException("Head Or Tail is Null");
        }
    }

    private boolean isCheckNull(){
        return Objects.isNull(this.head) || Objects.isNull(this.tail);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> node = this.head;
        while(node != null){
            if(node.next == null){
                sb.append(node.data);
            }else{
            sb.append(node.data).append(" ");
            }
            node = node.next;
        }
        return sb.toString();
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
