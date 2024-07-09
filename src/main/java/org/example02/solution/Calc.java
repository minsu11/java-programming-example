package org.example02.solution;

import java.math.BigInteger;

public class Calc {
    public static Number mod(Number num1, Number num2){
        
        if(num1 instanceof BigInteger && num2 instanceof BigInteger){
            return ((BigInteger) num1).mod((BigInteger) num2);
        }
        else if(num1 instanceof Integer && num2 instanceof Integer){
            return (Integer) num1 % (Integer) num2;
        }
        else{
            return (Long) num1 % (Long) num2 ;
        }
    }
    public static Number mod(String num1, String num2){
        return mod(new BigInteger(num1), new BigInteger(num2));
    }

    public static boolean checkNegativeNum(Number num){
        if(num instanceof BigInteger bigInteger){
            return  bigInteger.compareTo(BigInteger.ZERO)<0;
        } else if(num instanceof Integer integer){
            return integer < 0;
        }
        else{
            return (Long) num < 0;
        }
    }

    
}
