package programmersLv1;

import java.util.HashMap;

public class 숫자짝꿍 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/131128
    public String solution(String X, String Y) {
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        for(int i = 0; i < 10; i++){
            mapX.put(i, 0);
            mapY.put(i, 0);
        }
        for(int i = 0; i < X.length(); i++){
            int number = (int) (X.charAt(i) - '0');
            mapX.merge(number, 1, Integer::sum);
        }
        for(int i = 0; i < Y.length(); i++){
            int number = (int) (Y.charAt(i) - '0');
            mapY.merge(number, 1, Integer::sum);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 9; i >= 0; i--){
            int min = Math.min(mapX.get(i), mapY.get(i));
            if(min == 0) continue;
            stringBuilder.append(String.valueOf(i).repeat(min));
        }
        String result = stringBuilder.toString();
        if(result.equals("")) return "-1";
        if(result.replace("0", "").equals("")) return "0";
        return result;
    }
}
