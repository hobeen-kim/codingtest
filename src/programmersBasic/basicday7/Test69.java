package programmersBasic.basicday7;

import java.util.Arrays;

public class Test69 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        for(String s1 : arr){
            int count = 0;
            for(String s2 : arr){
                if(s1.equals(s2)) count ++;
            }
            if(count == 1) answer += s1;
        }
        String[] stringArray = answer.split("");
        Arrays.sort(stringArray);
        answer = String.join("", stringArray);
        return answer;
    }
}
