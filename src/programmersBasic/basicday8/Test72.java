package programmersBasic.basicday8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test72 {

    class Solution {
        public int[] solution(int n) {
            int[] measure = IntStream.range(2, n).filter(i -> n % i == 0).toArray();
            if(measure.length == 0) return new int[]{n};

            String stringAnswer = "";

            for(int i = 0; i < measure.length; i++){
                boolean isPrime = true;
                for(int j = 0; j < i; j++){
                    if(measure[i] % measure[j] == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) stringAnswer += measure[i] +" ";
            }

            int[] answer = (int[]) Arrays.stream(stringAnswer.split(" ")).mapToInt(Integer::parseInt).toArray();

            return answer;
        }
    }
}
