package programmersBasic.basicday2;

import java.util.Arrays;

public class Test18 {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
