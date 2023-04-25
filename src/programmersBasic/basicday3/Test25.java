package programmersBasic.basicday3;

import java.util.Arrays;

public class Test25 {

    class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);

            return numbers[numbers.length - 1] *  numbers[numbers.length - 2];
        }
    }
}
