package programmersLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {

        //중복제거
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> reportedCount = new HashMap<>();
        HashMap<String, Integer> mailCount = new HashMap<>();

        for(String id : id_list){
            reportedCount.put(id, 0);
            mailCount.put(id, 0);
        }

        for(String r : report) reportedCount.merge(r.split(" ")[1], 1, Integer::sum);

        for(String r : report) if(reportedCount.get(r.split(" ")[1]) >= k) mailCount.merge(r.split(" ")[0], 1, Integer::sum);

        int[] mail = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++) mail[i] = mailCount.get(id_list[i]);

        return mail;
    }
}
