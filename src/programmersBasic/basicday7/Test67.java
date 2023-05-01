package programmersBasic.basicday7;

import java.util.Arrays;

public class Test67 {
    class Solution {
        public int solution(int[] array, int n) {
            Arrays.sort(array);
            int left = 0;
            int count = 0;
            for(int i : array){
                if(i <= n){
                    left = i;
                    count++;
                }
            }
            if(left == 0) return array[0];
            if(count == array.length) return array[array.length - 1];
            return n - array[count-1] <= array[count] - n ? array[count-1] : array[count];
        }
    }

}
