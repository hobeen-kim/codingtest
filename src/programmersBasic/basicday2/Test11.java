package programmersBasic.basicday2;

import java.util.Arrays;

public class Test11 {
    public double solution(int[] numbers) {

        double sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
