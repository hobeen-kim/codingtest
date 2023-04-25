package programmersBasic.basicday2;

import java.util.Arrays;

public class Test17 {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}

