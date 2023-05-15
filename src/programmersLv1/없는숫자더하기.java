package programmersLv1;

import java.util.Arrays;

public class 없는숫자더하기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/86051
    public int solution(int[] numbers) {

        return 45 - Arrays.stream(numbers).sum();
    }
}
