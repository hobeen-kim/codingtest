package programmersLv1;

import java.util.*;

public class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        for(String call : callings){
            int callIdx = map.get(call);
            players[callIdx] = players[callIdx - 1];
            map.merge(players[callIdx], 1, Integer::sum);
            players[callIdx - 1] = call;
            map.merge(call, -1, Integer::sum);
        }

        return players;
    }

}
