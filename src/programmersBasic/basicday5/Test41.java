package programmersBasic.basicday5;

import java.util.Arrays;

public class Test41 {
    public String solution(String my_string) {
        String[] arrs = my_string.split("");
        String value = "";
        for(String arr : arrs) {
            value += arr.matches("[a-z]") ? arr.toUpperCase() : arr.toLowerCase();
        }
        return value;
    }

    public static void main(String[] args) {
        Test41 t = new Test41();
        System.out.println(t.solution("StuDY"));
    }
}


