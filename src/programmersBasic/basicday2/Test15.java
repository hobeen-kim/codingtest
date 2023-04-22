package programmersBasic.basicday2;

import java.util.Arrays;

public class Test15 {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] result = new int[num2 - num1 + 1];
        for(int i = num1; i <= num2; i++) result[i - num1] = numbers[i];
        return result;
    }
}
