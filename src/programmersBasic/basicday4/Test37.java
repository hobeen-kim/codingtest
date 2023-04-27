package programmersBasic.basicday4;

import java.util.Arrays;

public class Test37 {

    class Solution {
        public int solution(String my_string) {

            return Arrays.stream(my_string.split("")).filter(value -> value.matches("[0-9]")).mapToInt(Integer::parseInt).sum();
        }
    }
}
