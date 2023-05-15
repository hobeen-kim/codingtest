package programmersLv1;

import java.util.HashMap;

public class 옹알이_2 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};

        int result = 0;
        //발음할 수 있는 단어를 " " 로 변경
        for(int i = 0; i < babbling.length; i++){
            for(String word : words){
                babbling[i] = babbling[i].replace(word+word, "1").replace(word, " ");
            }
            //bab == "" 이면 result ++
            if(babbling[i].trim().equals("")) result++;
        }

        return result;
    }

    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        //arr 의 첫번째 요소를 key, 마지막 요소를 value 로 하는 HashMap 을 만들어 반환
        HashMap<String, String> map = new HashMap<>(){
            {
                put(arr[0], arr[arr.length-1]);
            }
        };
        map.put(arr[0], arr[arr.length-1]);
        return map;
    }
}


