package org.example.prob.baekjoon;

import java.util.Scanner;

/**
 * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
 *
 * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
 *
 * 출력
 * 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 */
public class 최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase =  sc.nextInt();

        if(testCase < 0 && testCase > 1000){
            throw new IllegalArgumentException("test case는 0초과 1000이하 여야한다");
        }
        int aNum = 0;
        int bNum = 0;
        int[] result = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            aNum = sc.nextInt();
            bNum = sc.nextInt();
            result[i] = aNum * bNum / gcd(aNum,bNum);
        }
        print(result);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public static void print(int[] results){
        for (int result : results) {
            System.out.println(result);
        }
    }

    public static void checkRange(int num, int num1, int num2) {
        if (num1 < num2 && num< num1 || num > num2) {
            throw new IllegalArgumentException("올바른 범위가 아님");
        }
    }

}
