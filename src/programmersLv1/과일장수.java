package programmersLv1;

import java.util.Arrays;

public class 과일장수 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/135808
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int[] scoreArr = new int[k+1];

        Arrays.stream(score).forEach(value -> scoreArr[value]++);

        answer += (scoreArr[k] / m) * k * m;
        scoreArr[k] = scoreArr[k] % m;

        for(int i = k-1; i >= 0; i--){
            int count = scoreArr[i] + scoreArr[i+1];
            answer += (count / m) * i * m;
            scoreArr[i] = count % m;
        }

        return answer;
    }
}
