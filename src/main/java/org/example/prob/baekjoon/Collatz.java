package org.example.prob.baekjoon;

/**
 * Collatz 추측
 *
 * 콜라츠 추측은 임의의 자연수가 다음 조작을 거쳐 항상 1이 된다는 추측이다.
 *
 * 1. 짝수라면 2로 나눈다.
 * 2. 홀수라면 3을 곱하고 1을 더한다.
 * 3. 1이면 조작을 멈추고, 1이 아니면 첫 번째 단계로 돌아간다.
 *
 * 1이 될 때까지의 횟수를 구하여라
 *
 * [조건]
 * 1미만의 숫자인 경우 -1
 * for, while, do-while문 사용 금지
 * 재귀 함수로 문제 풀이
 *
 */
public class Collatz {
    private static int[] TEST_CASE = {
            16,
            4,
            1,
            10000,
            -10
    };

    private static int[] RESULT_CASE = {
            8,
            2,
            0,
            29,
            -1
    };
    public static void main(String[] args) {
        for(int num : TEST_CASE) {
            System.out.println("Test case: ");
        }
        System.out.println(collatz(1000000,0));
    }



    public static int collatz(int n, int i) {

        if(n == 1) return i;
        else if (n % 2 == 0) {
            return collatz(n / 2,i+1);
        }else {
            return collatz(Math.addExact(Math.multiplyExact(3,n),1),i+1); // overflow 방지
        }
    }



}
