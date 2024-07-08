package org.example.example.exam03;

import org.example.example.exam02.List;

import java.util.Objects;

/**
 * packageName    : org.example.exam.exam03
 * fileName       : OrderedArrayList
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class OrderedArrayList implements List {
    int[] values;
    int[] nexts;
    private int size;
    public OrderedArrayList(int size) {
        this.size = 0;
        this.values = new int[size];
        this.nexts = new int[size];

    }

    public void sort() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        for(int j = 0; j < size; j++) {
            for (int i = 0; i < this.size - 1; i++) {
                if (this.values[i] > this.values[i + 1]) {
                    int tmp = this.values[i];
                    this.values[i] = values[i + 1];
                    values[i + 1] = tmp;
                }
            }
        }
    }


    @Override
    public void insert(int value) {
        if(size == values.length) {
            throw new ArrayIndexOutOfBoundsException("index over");
        }
        this.values[size] = value;
        size+=1;
        sort();
    }

    @Override
    public int getFirst() {
        if(size == 0) {
            throw new NullPointerException("array null");
        }
        return this.values[0];
    }

    @Override
    public int removeFirst() {
        int result = values[0];
        for(int i=1; i<size; i++) {
            values[i-1] = this.values[i];
        }
        values[size-1] = 0;
        size -=1;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(this.values);
    }

    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList(10);

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
