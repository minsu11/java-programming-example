package org.example.example.exam04;

import org.example.example.exam02.List;

import java.util.Objects;

/**
 * packageName    : org.example.exam.exam04
 * fileName       : OrderedArrayList
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
class OrderedArrayList implements List {
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
            throw new IndexOutOfBoundsException("index over");
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
        if(size == 0) {
            throw new NullPointerException("array null");
        }
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
        OrderedArrayList list = new OrderedArrayList(5);

        list.insert(1);
        System.out.println("1을 넣었습니다.");
        list.insert(2);
        System.out.println("2를 넣었습니다.");
        list.insert(3);
        System.out.println("3을 넣었습니다.");
        list.insert(4);
        System.out.println("4를 넣었습니다.");
        list.insert(5);
        System.out.println("5를 넣었습니다.");

        try {
            list.insert(6);
        } catch(RuntimeException ignore) {
            System.out.println("공간이 부족해 6을 추가할 수 없습니다.");
        }

        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        try {
            System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        } catch(RuntimeException ignore) {
            System.out.println("list에 제거할 요소가 없습니다.");
        }
    }
}