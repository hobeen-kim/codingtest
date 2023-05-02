package programmersBasic.basicClue;

import java.util.HashMap;

public class Test추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            hashmap.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];

        for(int i = 0; i < result.length; i++){
            int score = 0;
            for(String key : photo[i]){
                score += hashmap.get(key) != null ?  hashmap.get(key) : 0;
            }
            result[i] = score;
        }
        return result;
    }
}
