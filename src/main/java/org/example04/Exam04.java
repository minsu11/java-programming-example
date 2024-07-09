package org.example04;

import org.example03.solution.DoubleListStack;
import org.example03.solution.Stack;

public class Exam04 {
    public static String validPS(Stack<String> strStack){
        int vpsCount = 0;
        if(strStack.count() % 2 != 0){
            return "No";
        }
        int len = strStack.count();
        for(int i = 0; i < len; i++){
            String str =strStack.pop();
            if("(".equals(str)){
                vpsCount+=1;
                
            }else if(")".equals(str)){
                vpsCount-=1;
            }
        }
        
        if(vpsCount == 0){
            return "Yes";
        }
        return "No";
    }

    public static Stack<String> inputVPS(String str, Stack<String> strStack){
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            strStack.push(Character.toString(c));
        }
        return strStack;
    }

    public static Stack<String> inputVPS(String str){
        return inputVPS(str, new DoubleListStack<>());
    }

    public static void main(String[] args) {
        Stack<String> strStack1 = inputVPS("(())"); 
        Stack<String> strStack2 = inputVPS("(((())"); 

        System.out.println("(()) result: "+"Yes".equals(validPS(strStack1)));
        System.out.println("((()) result: "+"Yes".equals(validPS(strStack2)));

    }
    
}
