package programmersLv1;

import java.util.Arrays;
import java.util.Comparator;

public class LinesOverlap {
    public static void main(String[] args) {
        // 겹치는 선분의 길이
        // 교집합...
        int[][] lines = {{0, 8}, {0, 2}, {6, 8}};
        int answer = 0;

        Arrays.sort(lines, Comparator.comparingInt(a -> a[0]));
        for(int[] l :lines) {
            System.out.println(l[0]+","+l[1]);
        }

        int[] lx = new int[lines.length];
        int[] ly = new int[lines.length];

        for(int i = 0; i < lines.length; i++) {
            lx[i] = lines[i][0]; // 0 1 3
            ly[i] = lines[i][1]; // 5 10 9
        }
        if(lx[1] >= lx[0] && lx[1] < ly[0]) {
            for(int start = lx[1]; start < ly[1]; start++) {
                if(start + 1 <= ly[0]) {
                    answer++;
                }
            }
        }
        if(lx[2] >= lx[1] && lx[2] < ly[1]) {
            for(int start = lx[2]; start < ly[2]; start++) {
                if(start + 1 <= ly[0]) {
                    answer--;
                }
                if (start + 1 <= ly[1]){
                    answer++;
                }
            }
        } else if(lx[2] >= lx[0] && lx[2] < ly[0]) {
            for(int start = lx[2]; start < ly[2]; start++) {
                if (start + 1 <= ly[0]){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
