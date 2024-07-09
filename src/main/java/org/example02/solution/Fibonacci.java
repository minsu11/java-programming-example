package org.example02.solution;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<BigInteger, BigInteger> fibonacciMap = new HashMap<BigInteger, BigInteger>();
    
    private static BigInteger fibonacci(BigInteger num) {
        
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
        Calc.checkNegativeNum(num);
        return fibonacci(new BigInteger(String.valueOf(num)));
    }

    public static BigInteger fibonacci(String str){
        BigInteger num = new BigInteger(str);
        Calc.checkNegativeNum(num);
        return fibonacci(num);
    }
}