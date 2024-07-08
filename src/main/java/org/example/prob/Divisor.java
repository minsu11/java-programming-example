package org.example.prob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 *
 * 문제
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 홀수인 수는 빼기
 *
 * 조건
 * 1 ≤ left ≤ right ≤ 1,000
 * Math.sqrt() 사용 금지
 *
 */
public class Divisor {

    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        for(int num = left; num<= right; num++){
            cnt = 0;
            for(int i = 1; i*i <= num; i++){
                if(num%i ==0){
                    cnt++;
                    if(i != num / i){
                        cnt++;
                    }
                }
            }
            if(cnt%2== 0){
                answer += num;
            }
            else{
                answer -= num;
            }
        }
        return answer;
    }
}
