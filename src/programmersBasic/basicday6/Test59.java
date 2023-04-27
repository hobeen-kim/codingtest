package programmersBasic.basicday6;

import java.util.Arrays;

public class Test59 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] arr = Arrays.stream(answer.split("")).sorted().toArray(String[]::new);
        return String.join("", arr);
    }
}
