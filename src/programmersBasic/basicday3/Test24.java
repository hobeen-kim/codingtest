package programmersBasic.basicday3;

public class Test24 {
    public int solution(int n) {
        return n % 7 == 0 ? n/7 : n/7 + 1;
    }

    public int solution2(int n) {
        return (n + 6) / 7;
    }
}
