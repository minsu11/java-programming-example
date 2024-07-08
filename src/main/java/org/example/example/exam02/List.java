package org.example.example.exam02;

/**
 * packageName    : org.example.exam.exam02
 * fileName       : List
 * author         : parkminsu
 * date           : 2024. 6. 13.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 13.        parkminsu       최초 생성
 */
public interface List {
    void insert(int value);
    int getFirst();
    int removeFirst();
    boolean isEmpty();
}
