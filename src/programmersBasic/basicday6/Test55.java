package programmersBasic.basicday6;

import java.util.Arrays;

public class Test55 {

    public int solution(int order) {
        String[] arr = String.valueOf(order).split("");
        return (int) Arrays.stream(arr).filter(value -> "369".indexOf(value) != -1).count();


    }
}
