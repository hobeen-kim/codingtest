package programmersLv1;

import java.util.ArrayList;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        Long pLong = Long.parseLong(p);
        long[] arr = new long[t.length() - p.length() + 1];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(t.substring(i, i + p.length()));
        }

        int count = 0;
        for(long a : arr){
            if(a <= pLong) count++;
        }

        return count;
    }
}
