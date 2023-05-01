package programmersBasic.basicday7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test65 {
    public int solution(int i, int j, int k) {
        String arr = IntStream.rangeClosed(i, j).mapToObj(String::valueOf).collect(Collectors.joining());

        int result = (int) Arrays.stream(arr.split("")).filter(value -> value.equals(String.valueOf(k))).count();

        return result;
    }
}
