package org.example01.solution;

import java.util.NoSuchElementException;

public interface List<E> {
    // 원소 추가
    boolean add(E data);

    void addFirst(E data);

    void add(E data, int index);

    // 원소 삭제(원하는 위치)
    E remove(int index);

    boolean isEmpty();
    
    int size();

    default E removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("List is Empty");
        }
        return remove(0);
    }

    default E removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return remove(size());
    }
    
    void sort();
    
    E get(int index);
    
    E set(int index, E element);
    
    

}
