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

    private static boolean isNegativeNum(Number num){
        if(num instanceof BigInteger bigInteger){
            return  bigInteger.compareTo(BigInteger.ZERO)<0;
        } else if(num instanceof Integer integer){
            return integer < 0;
        }
        else{
            return (Long) num < 0;
        }
    }

    public static void checkNegativeNum(Number num){
        if(isNegativeNum(num)){
            throw new NegativeNumberException();
        }
    }

    public static Number abs(Number num){
        if(isNegativeNum(num)){
            if(num instanceof Integer){
                return Math.abs((Integer) num);
            }else if(num instanceof Long){
                return Math.abs((Long) num);
            }else if(num instanceof BigInteger){
                return ((BigInteger) num).abs();
            }
        }
        return num;
        
    }

    public static boolean checkZero(Number number){
        if(number instanceof BigInteger){
            return ((BigInteger) number).compareTo(BigInteger.ZERO) ==0;
        }else{
            return number.equals(0);
        }

    }

    
}
