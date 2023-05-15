package programmersLv1;

public class 콜라문제 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/132267
    public int solution(int a, int b, int n) {
        int answer = 0;
        if(n < a) return 0;
        answer += n / a * b;
        answer += solution(a, b, answer + n % a);

        return answer;
    }
}
