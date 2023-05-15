package programmersLv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42889
    public int[] solution(int N, int[] stages) {
        int totalPlayer = stages.length;
        int[] stagePlayer = new int[N+1];
        HashMap<Integer, Double> rate = new HashMap<>();
        int prevPlayer = 0;

        for(int stage : stages){
            stagePlayer[stage - 1]++;
        }

        for(int i = 0; i < N; i++){
            if(totalPlayer - prevPlayer == 0) rate.put(i + 1, 1.0);
            else {
                rate.put(i + 1, 1 - ((double) stagePlayer[i]) / (totalPlayer - prevPlayer));
                prevPlayer += stagePlayer[i];
            }
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(rate.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
