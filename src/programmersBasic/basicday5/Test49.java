package programmersBasic.basicday5;

import java.util.Arrays;

public class Test49 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();

        }
    }
}
