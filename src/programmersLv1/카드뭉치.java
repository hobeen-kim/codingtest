package programmersLv1;

import java.util.*;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        LinkedList<String> cards1List = new LinkedList<>(Arrays.asList(cards1));
        LinkedList<String> cards2List = new LinkedList<>(Arrays.asList(cards2));
        boolean isOrdered = true;

        for(int i = 0; i < goal.length; i++){
            String word = goal[i];
            if(cards1List.contains(word)){
                if(cards1List.remove(0).equals(word)) continue;
                isOrdered = false;
            }
            if(cards2List.contains(word)){
                if(cards2List.remove(0).equals(word)) continue;
                isOrdered = false;
            }
        }

        return isOrdered ? "Yes" : "No";
    }
}

