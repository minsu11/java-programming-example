package org.example.example.exam02;

import java.util.Objects;

/**
 * packageName    : org.example.exam.exam02
 * fileName       : OrderLinkedList
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class OrderedLinkedList implements List{
    class Node {
        int value;
        Node next;

        public Node(Node next,int value) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;
    public OrderedLinkedList() {
        size= 0;
    }
    @Override
    public void insert(int value) {
        Node newNode = new Node(null,value);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size+=1;
        sort();
    }

    public void sort() {
        if (Objects.isNull(head)) {
            throw new NullPointerException();
        }
        for (int i = 1; i < size; i++) {
            Node current = head;
            while (current.next != null) {
                if (current.value > current.next.value) {
                    int tmp = current.next.value;
                    current.next.value = current.value;
                    current.value = tmp;
                }
                current = current.next;
            }
        }


    }

    @Override
    public int getFirst() {
        if (Objects.isNull(head)) {
            throw new NullPointerException("value is null");
        }
        return head.value;
    }

    @Override
    public int removeFirst() {
        if(Objects.isNull(head)){
            throw new NullPointerException("Linked list is empty");
        }
        int resuslt = head.value;
        this.head = head.next;
        size-=1;
        return resuslt;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();

        System.out.println("isEmpty : " + list.isEmpty());
        list.insert(10);
        list.insert(5);
        System.out.println("getFirst : " + list.getFirst());
        list.insert(7);
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
        System.out.println("getFirst : " + list.getFirst());
        list.insert(12);
        list.insert(3);
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
    }
}
