package programmersLv1;
import java.util.*;

public class 가장가까운같은글자 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/142086
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charS = s.toCharArray();

        for(int i = 0; i < charS.length; i++){
            char c = charS[i];
            if(map.containsKey(c)) answer[i] = i - map.get(c);
            else answer[i] = -1;
            map.put(c, i);
        }

        return answer;
    }
}
