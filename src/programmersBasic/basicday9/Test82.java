package programmersBasic.basicday9;

public class Test82 {
    public int solution(int[][] dots) {
        int[] max = dots[0];
        int[] min = dots[0];

        for(int[] dot : dots){
            if(max[0] >= dot[0] && max[1] >= dot[1]){
                max = dot;
            }else if(min[0] <= dot[0] && min[1] <= dot[1]){
                min = dot;
            }
        }
        int area = (max[0] - min[0]) * (max[1] - min[1]);
        return area;
    }
}
