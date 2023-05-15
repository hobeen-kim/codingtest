package programmersLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 로또의_최고순위와_최저순위 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/77484
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;
        int zero = 0;
        List<Integer> win_nums_list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        for(int lotto : lottos){
            if(win_nums_list.contains(lotto)) count++;
            else if(lotto == 0) zero++;
        }

        answer[0] = Math.min(7 - count - zero, 6);
        answer[1] = Math.min(7 - count, 6);

        return answer;
    }
}
