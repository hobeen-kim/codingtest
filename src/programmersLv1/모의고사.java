package programmersLv1;

import java.util.ArrayList;

public class 모의고사 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i < answers.length; i++){
            int answer = answers[i];

            if(answer == one[i % 5]) count1++;
            if(answer == two[i % 8]) count2++;
            if(answer == three[i % 10]) count3++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int max = Math.max(Math.max(count1, count2), count3);
        if(max == count1) result.add(1);
        if(max == count2) result.add(2);
        if(max == count3) result.add(3);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
