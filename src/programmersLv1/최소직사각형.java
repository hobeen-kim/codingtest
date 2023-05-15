package programmersLv1;

public class 최소직사각형 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public int solution(int[][] sizes) {

        int resultWidth = 0;
        int resultHeight = 0;

        for(int[] size : sizes){
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);

            if(resultWidth < width) resultWidth = width;
            if(resultHeight < height) resultHeight = height;
        }

        return resultWidth * resultHeight;
    }
}
