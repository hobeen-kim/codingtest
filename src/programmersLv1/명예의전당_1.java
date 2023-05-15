package programmersLv1;

import java.util.*;

public class 명예의전당_1 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/138477
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rankArr = new ArrayList<>();
        int lowest = 2001;

        for(int i = 0; i < Math.min(k, answer.length); i++){
            rankArr.add(score[i]);
            lowest = rankArr.stream().mapToInt(Integer::intValue).min().getAsInt();
            answer[i] = lowest;
        }
        for(int i = k; i < score.length; i++){
            if(lowest < score[i]){
                rankArr.remove(Integer.valueOf(lowest));
                rankArr.add(score[i]);
                lowest = rankArr.stream().mapToInt(Integer::intValue).min().getAsInt();
            }
            answer[i] = lowest;
        }

        return answer;
    }
}
