package programmersLv1;

import java.util.*;

public class 완주하지못한선수 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String p : participant){
            if(map.containsKey(p)) map.merge(p, 1, Integer::sum);
            else map.put(p, 1);
        }

        for(String c : completion){
            map.merge(c, -1, Integer::sum);
        }

        String result = "";
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) result += entry.getKey();
        }

        return result;
    }
}

