package programmersBasic.basicday4;

import java.util.Arrays;

public class Test35 {
    class Solution {
        public int solution(String[] s1, String[] s2) {
            return (int) Arrays.stream(s1).filter(s1Value -> Arrays.stream(s2).anyMatch(s2Value -> s2Value.equals(s1Value))).count();        }
    }
}
