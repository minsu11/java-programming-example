package org.example.prob.baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 피보나치 수열
 *
 * BigDecimal
 *
 * long
 *
 * 메모이제이션
 */
public class Fibonacci {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("fibonacci value: ");
            int num = scanner.nextInt();
            precondition(num);
            System.out.println(fibonacci(num));
            System.out.println(Math.sqrt(17));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static long fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void precondition(int n){
        if (n < 0) {
            throw new IllegalArgumentException("num < 0");
        }
    }

}
