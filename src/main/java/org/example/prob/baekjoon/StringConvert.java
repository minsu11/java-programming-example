package org.example.prob.baekjoon;

import java.util.Scanner;

/**
 * 문자열 변환 문제
 * 대문자 -> 소문자
 *
 * 소문자 -> 대문자
 *
 * toLowerCase(), toUpperCase() 금지
 */

public class StringConvert {
    private static final String[][] TEST_CASE = {
            {"mango", "MANGO"},
            {"eXamPle","ExAMplE"},
            {"Apple","APPLE"},
            {"bAnAnA", "BaNaNa"},
            {"GOOD","good"}
    };
    public static void main(String[] args) {
        // 테스트 케이스 다 통과 되는지
        for(String[] testCase : TEST_CASE) {
            System.out.println("test case ");
        }
    }

    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for(char c : charArray) {
            if(c >='A' && c<='Z') {
                sb.append(Character.toString(c+32));
            }else if(c >='a' && c<='z') {
                sb.append(Character.toString(c-32));
            }
        }
        return sb.toString();
    }
}
