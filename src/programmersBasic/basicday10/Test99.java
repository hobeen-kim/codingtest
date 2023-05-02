package programmersBasic.basicday10;

public class Test99 {
    public int solution(int[][] dots) {

        for(int i = 1; i <= 3; i++){
            int dx1 = dots[0][0] - dots[i][0];
            int dy1 = dots[0][1] - dots[i][1];

            int dx2 = dots[over(i+2)][0] - dots[over(i+1)][0];
            int dy2 = dots[over(i+2)][1] - dots[over(i+1)][1];


            if(dx1 * dy2 == dx2 * dy1) return 1;
        }
        return 0;
    }

    int over(int i){
        if(i > 3) return i - 3;
        return i;
    }
}
