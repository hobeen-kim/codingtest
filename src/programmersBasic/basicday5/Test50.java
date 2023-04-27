package programmersBasic.basicday5;

import java.util.Arrays;

public class Test50 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String num1String = String.valueOf(my_string.charAt(num1));
            String num2String = String.valueOf(my_string.charAt(num2));

            String[] arr =my_string.split("");

            arr[num1] = num2String;
            arr[num2] = num1String;

            return String.join("", arr);
        }
    }
}
