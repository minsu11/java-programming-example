package org.example.prob.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 문제
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 */
public class TwoNumberAdd {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
