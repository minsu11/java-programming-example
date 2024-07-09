package org.example02.solution;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<BigInteger, BigInteger> fibonacciMap = new HashMap<BigInteger, BigInteger>();
    
    public static BigInteger fibonacci(BigInteger num) {
        if(num.compareTo(BigInteger.ZERO)<0){
            throw new NegativeNumberException("음수입니다.");
        }

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

        fibonacciMap.put(num, fibonacci(num.subtract(BigInteger.ONE))
                .add(fibonacci(num.subtract(BigInteger.TWO))));
        return fibonacciMap.get(num);
    }

    public static BigInteger fibonacci(Number num) {
        return fibonacci(new BigInteger(String.valueOf(num)));
    }

    public static BigInteger fibonacci(String str){
        return fibonacci(new BigInteger(str));
    }
    
    public static Number gcd(Number a,Number b){
        
        return gcdCalc(a, b);
    }


    private static Number gcdCalc(Number a,Number b){
        if(b.equals(0)){
            return a;
        }
        return gcd(b, Calc.mod(a,b));
    }

    public static void main(String[] args) {
        BigInteger a = new BigInteger("6");
        BigInteger b = new BigInteger("3");
    

        System.out.println("fibonacci(100): "+fibonacci("100"));
        System.out.println("fibonacci(8): "+fibonacci(8));
        System.out.println("fibonacci(8): "+fibonacci("1000"));
        System.out.println("fibonacci(0): "+fibonacci(0L));
        System.out.println("---------------------");
        // System.out.println( gcd(fibonacci(a), fibonacci(b)));
        // System.out.println(gcd(2,10));
        try{
            fibonacci(-1);
        }catch(NegativeNumberException e){
            e.printStackTrace();;
        }
    }

}