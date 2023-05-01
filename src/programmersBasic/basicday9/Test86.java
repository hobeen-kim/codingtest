package programmersBasic.basicday9;

import java.util.Arrays;

public class Test86 {
    public int[] solution(int[][] score) {
        double[] averages = Arrays.stream(score).mapToDouble(value -> (value[0] + value[1])).map(value -> value/2).toArray();

        int[] answer = new int[averages.length];

        int rank = 1;
        for(int i = 0; i < averages.length; i++){
            for(double average : averages){
                if(averages[i] < average) rank++;
            }
            answer[i] = rank;
            rank = 1;
        }

        return answer;
    }
}
