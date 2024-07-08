package org.example.example.exam05;

import java.util.Objects;

/**
 * packageName    : org.example.exam.exam05
 * fileName       : OrderedLinkedList
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class OrderedLinkedList<T extends Comparable<T>> implements List<T> {
    class Node<E> {
        T value;
        Node<E> next;

        public Node(Node<E> next, T value) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<T> head;
    private int size;
    public OrderedLinkedList() {
        size= 0;
    }

    @Override
    public void insert(T value) {
        final Node<T> newNode = new Node<>(null, value);
        if(head == null) {
            head = newNode;
        }
        else{
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size+=1;
        sort();

    }

    @Override
    public T getFirst() {
        return head.value;
    }

    @Override
    public T removeFirst() {
        T result = head.value;
        head = head.next;
        size-=1;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    public void sort(){
        if (Objects.isNull(head)) {
            throw new NullPointerException();
        }
        for (int i = 1; i < size; i++) {
            Node<T> current = head;
            while (current.next != null) {
                if (current.value.compareTo(current.next.value) > 0) {
                    T tmp = current.next.value;
                    current.next.value = current.value;
                    current.value = tmp;
                }
                current = current.next;
            }
        }
    }



    public static void main(String[] args) {
        OrderedLinkedList<Student> students = new OrderedLinkedList<>();

        students.insert(new Student("s2", 2));
        students.insert(new Student("s3", 3));
        students.insert(new Student("s1", 1));
        System.out.println(students.toString());
        System.out.println(students.removeFirst().getId());
        System.out.println(students.removeFirst().getId());
        System.out.println(students.removeFirst().getId());
    }
}