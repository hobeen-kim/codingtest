package programmersLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> result = new ArrayList<>();
        int[] todayArr = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();

        HashMap<String, Integer> map = new HashMap<>();
        for(String term : terms){
            String[] termArr = term.split(" ");
            map.put(termArr[0], Integer.parseInt(termArr[1]));
        }

        for(int i = 0; i < privacies.length; i++){
            String privacy = privacies[i];
            String[] privacyArr = privacy.split(" ");
            int term = map.get(privacyArr[1]);
            int[] termArr = new int[]{term / 12, term % 12};
            int[] privacyDay = Arrays.stream(privacyArr[0].split("\\.")).mapToInt(Integer::parseInt).toArray();

            int subYear = privacyDay[0] + termArr[0] - todayArr[0];
            int subMonth = privacyDay[1] + termArr[1] - todayArr[1];
            int subDay = privacyDay[2]  - todayArr[2];

            int date = subYear * 12 * 28 + subMonth * 28 + subDay;
            if(date > 0) continue;
            result.add(i + 1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
