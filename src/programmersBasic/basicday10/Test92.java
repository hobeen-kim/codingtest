package programmersBasic.basicday10;

import java.util.*;

public class Test92 {
    public int solution(int[] array) {

        HashMap<Integer, Integer> result = new HashMap<>();

        for(int a : array){
            result.merge(a, 1, Integer::sum);
        }
        int answer = 0;
        int max = 0;
        int isDuplicate = 0;
        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            if(entry.getValue() > max){
                answer = entry.getKey();
                max = entry.getValue();
                isDuplicate = 1;
            }else if(entry.getValue() == max) isDuplicate++;
        }

        return isDuplicate > 1 ? -1 : answer;
    }
}
