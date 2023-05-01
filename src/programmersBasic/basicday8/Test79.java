package programmersBasic.basicday8;

public class Test79 {
    public int solution(int[] sides) {

        int max = sides[0] + sides[1];
        int min = Math.abs(sides[0] - sides[1]);

        return max - min - 1;
    }
}
