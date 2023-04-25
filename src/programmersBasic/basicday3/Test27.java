package programmersBasic.basicday3;

import java.util.Arrays;

public class Test27 {
        public int solution(int[] array) {
            Arrays.sort(array);
            return array[array.length / 2];
        }
}
