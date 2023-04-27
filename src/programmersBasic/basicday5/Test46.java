package programmersBasic.basicday5;

import java.util.Arrays;

public class Test46 {

    class Solution {
        public int[] solution(String my_string) {
            return Arrays.stream(my_string.split("")).filter(value ->
                    value.matches("[0-9]")
            ).mapToInt(value -> Integer.parseInt(value)).sorted().toArray();

        }
    }
}
