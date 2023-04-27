package programmersBasic.basicday4;

import java.util.Arrays;

public class Test36 {
    class Solution {
        public int solution(int n) {
            String answerString = String.valueOf(n);

            return Arrays.stream(answerString.split("")).mapToInt(Integer::parseInt).sum();
        }

    }
}
