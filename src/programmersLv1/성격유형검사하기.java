package programmersLv1;

import java.util.HashMap;

public class 성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {
        //haspmap 으로 타입:점수 선언, 0 할당
        HashMap<String, Integer> hashmap = new HashMap<>(){
            {
                put("R", 0);
                put("T", 0);
                put("C", 0);
                put("F", 0);
                put("J", 0);
                put("M", 0);
                put("A", 0);
                put("N", 0);
            }
        };


        //survey 와 choices 를 순회
        for(int i = 0; i < survey.length; i++){
            String[] surveyArr = survey[i].split("");
            if(choices[i] < 4){
                hashmap.merge(surveyArr[0], 4 - choices[i],Integer::sum);
            }else if(choices[i] > 4){
                hashmap.merge(surveyArr[1], choices[i] - 4, Integer::sum);
            }
        }

        String answer = "";
        //두개씩 비교해서 큰 값으로 (동일할 시 오름차순) answer++;
        answer += hashmap.get("R") >= hashmap.get("T") ? "R" : "T";
        answer += hashmap.get("C") >= hashmap.get("F") ? "C" : "F";
        answer += hashmap.get("J") >= hashmap.get("M") ? "J" : "M";
        answer += hashmap.get("A") >= hashmap.get("N") ? "A" : "N";

        return answer;
    }
}
