package programmersBasic.basicday6;

import java.util.stream.IntStream;

public class Test56 {
    public int[] solution(int n) {

        return IntStream.rangeClosed(1, n).filter(value ->  n % value == 0).toArray();
    }
}
