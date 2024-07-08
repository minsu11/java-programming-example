package org.example.prob.baekjoon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.prob.baekjoon.최소공배수.checkRange;

/**
 * packageName    : org.example.prob.baekjoon
 * fileName       : 최소공배수Test
 * author         : parkminsu
 * date           : 2024. 6. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 19.        parkminsu       최초 생성
 */
class 최소공배수Test {

    @Test
    void main() {
        int testCase = -1;
        int minRange = 1;
        int maxRange = 1000;

        Assertions.assertThrows(IllegalArgumentException.class,()-> checkRange(testCase,minRange,maxRange));



    }
}