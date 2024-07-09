package org.example02;

import java.math.BigInteger;

import org.example02.solution.*;

public class Exam02 {
    public static Number gcd(Number a,Number b){
        if(Calc.checkZero(b)){
            return Calc.abs(a);
        }
        return gcd(b, Calc.mod(a,b));
    }
    public static void main(String[] args) {
        BigInteger a = new BigInteger("6");
        BigInteger b = new BigInteger("3");
    

        System.out.println("fibonacci(100): "+Fibonacci.fibonacci("100"));
        System.out.println("fibonacci(8): "+Fibonacci.fibonacci(8));
        System.out.println("fibonacci(1000): "+Fibonacci.fibonacci("500"));
        System.out.println("fibonacci(0): "+Fibonacci.fibonacci(0L));
        System.out.println("---------------------");
        System.out.println("12 15 gcd value: "+gcd(12, 15));

        System.out.println("fibonacci(a) fibonacci(b) gcd value: "+
        gcd(Fibonacci.fibonacci(a), Fibonacci.fibonacci(b)));

        System.out.println("-2 10 gcd value: "+gcd(-2,10));

        try{
            Fibonacci.fibonacci(-1);
        }catch(NegativeNumberException e){
            System.err.println(e.getMessage());
        }
    }
}
