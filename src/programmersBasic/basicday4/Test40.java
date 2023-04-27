package programmersBasic.basicday4;

public class Test40 {

    public int solution(int n) {

        int sqrt = (int) Math.sqrt(n);

        return sqrt * sqrt == n ? 1 : 2;
    }
}
