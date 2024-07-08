package org.example.example.exam05;

/**
 * packageName    : org.example.exam.exam05
 * fileName       : List
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public interface List<T>{
     void insert(T value);
     T getFirst();
     T removeFirst();
     boolean isEmpty();
}
