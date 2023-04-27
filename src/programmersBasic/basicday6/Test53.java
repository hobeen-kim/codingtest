package programmersBasic.basicday6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test53 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0] = Arrays.stream(array).max().getAsInt();
        answer[1] = IntStream.range(0, array.length)
                .filter(value -> array[value] == answer[0])
                .findFirst().orElse(-1);

        return answer;
    }
}


