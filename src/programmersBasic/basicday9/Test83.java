package programmersBasic.basicday9;

public class Test83 {
    public int solution(int M, int N) {
        int answer = 0;

        answer += M - 1;
        answer += M * (N - 1);

        return answer;
    }
}
