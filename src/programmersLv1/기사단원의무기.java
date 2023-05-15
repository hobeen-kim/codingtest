package programmersLv1;

import java.util.Arrays;

public class 기사단원의무기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/136798
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] measuresCountArr = new int[number];

        for(int i = 1; i <= number; i++){
            int measureCount = 0;
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0) measureCount++;
            }
            measuresCountArr[i-1] = measureCount * 2;
            if(Math.sqrt(i) == (int) Math.sqrt(i)){
                measuresCountArr[i-1]--;
            }
        }

        answer = Arrays.stream(measuresCountArr).map(value -> value > limit ? power : value).sum();

        return answer;
    }
}
