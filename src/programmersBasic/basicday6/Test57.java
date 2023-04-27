package programmersBasic.basicday6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test57 {
    public int solution(int num, int k) {

        int[] numArr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

        return IntStream.range(0, numArr.length).filter(i -> numArr[i] == k).findFirst().orElse(-2) + 1;
    }
}