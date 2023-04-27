package programmersBasic.basicday6;

import java.util.Arrays;

public class Test51 {
    class Solution {
        public int[] solution(int[] numbers, String direction) {

            int[] arr = new int[numbers.length];
            if(direction.equals("right")){
                arr[0] = numbers[numbers.length - 1];
                System.arraycopy(numbers, 0, arr, 1, numbers.length - 1);

                return arr;
            }
            arr[numbers.length - 1] = numbers[0];
            System.arraycopy(numbers, 1, arr, 0, numbers.length - 1);
            return arr;
        }
    }
}
