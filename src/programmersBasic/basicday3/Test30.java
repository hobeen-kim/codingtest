package programmersBasic.basicday3;

import java.util.Arrays;

public class Test30 {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();
        return sum - max > max ? 1 : 2;
    }
}
