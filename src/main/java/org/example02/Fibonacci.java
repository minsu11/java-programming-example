package org.example02;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    private static Map<BigInteger, BigInteger> fibonacciMap = new HashMap<BigInteger, BigInteger>();
    public static BigInteger fibonacci(BigInteger num) {
        //
        if (num.equals(BigInteger.ZERO)) {
            fibonacciMap.put(BigInteger.ZERO, BigInteger.ZERO);
            return BigInteger.ZERO;
        }
        if (num.equals(BigInteger.ONE)) {
            fibonacciMap.put(BigInteger.ONE, BigInteger.ONE);
            return BigInteger.ONE;
        }

        if(fibonacciMap.containsKey(num)) {
            return fibonacciMap.get(num);
        }
        // fibonacci(n -1) + fibonacci(n-2)
        fibonacciMap.put(num, fibonacci(num.subtract(BigInteger.ONE))
                .add(fibonacci(num.subtract(BigInteger.TWO))));
        return fibonacciMap.get(num);
    }

    public static BigInteger fibonacci(Integer num) {
        return fibonacci(new BigInteger(String.valueOf(num)));
    }

    public static BigInteger fibonacci(String str){
        return fibonacci(new BigInteger(str));
    }
    public static BigInteger fibonacci(Long num){
        return fibonacci(new BigInteger(String.valueOf(num)));
    }

    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        // 메모이제이션

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // visitor pattern
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        long num = gcd(fibonacci(a).longValue(),fibonacci(b).longValue());
        System.out.println(num % 1000000007);
        sc.close();
    }

}