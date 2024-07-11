package org.example04.solution;

import java.util.NoSuchElementException;

import org.example03.solution.DoubleListStack;
import org.example03.solution.Stack;

public class Exam04 {
    public static String validPS(Stack<String> strStack){
        checkElement(strStack);
        int vpsCount = 0;
        if(strStack.count() % 2 != 0){
            return "No";
        }
        int len = strStack.count();
        for(int i = 0; i < len; i++){
            String str = strStack.pop();
            if("(".equals(str)){
                vpsCount+=1;
                
            }else if(")".equals(str)){
                vpsCount-=1;
            }
            
            if(vpsCount > 0){
                return "No";
            }
        }
        
        if(vpsCount == 0){
            return "Yes";
        }
        return "No";
    }

    private static<E> void checkElement(Stack<E> elementStack){
        if(elementStack.isEmpty()){
            throw new NoSuchElementException("Empty Stack");
        }
        
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
        Stack<String> strStack = new DoubleListStack<>();
        Stack<String> strStack1 = inputVPS("(()())"); 
        Stack<String> strStack2 = inputVPS("(((())");
        Stack<String> strStack3 = inputVPS(")()");
        Stack<String> strStack4 = inputVPS("((()()))"); 

        System.out.println("(()) result: "+validPS(strStack1));
        System.out.println("((()) result: "+validPS(strStack2));
        System.out.println(")() result: "+ validPS(strStack3));
        System.out.println("((()())) result: "+ validPS(strStack4));

        try{
            validPS(strStack);
        }catch(NoSuchElementException e){
            System.err.println(e.getMessage());
        }
    }
    
}
