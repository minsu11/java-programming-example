package org.example.prob.baekjoon;

import java.util.Scanner;

/**
 * 시계방향으로 출력
 */
public class ClockwisePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            throw new IllegalArgumentException("num < 0");
        }
        int[][] numbers = new int[num][num];
        int n = 1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                numbers[i][j] = n;
                n++;
            }
        }

    }


}
