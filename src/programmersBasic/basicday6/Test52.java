package programmersBasic.basicday6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test52 {
    class Solution {
        public String solution(int age) {

            String answer = "";
            char[] chararr = String.valueOf(age).toCharArray();
            for (char c : chararr) {
                c += '1';
                answer += String.valueOf(c);
            }
            return answer;
        }
    }

    class Solution2 {
        public String solution(int age) {

            return String.valueOf(age).chars().mapToObj(value -> String.valueOf((char) (49 + value))).collect(Collectors.joining());
        }
    }

}
