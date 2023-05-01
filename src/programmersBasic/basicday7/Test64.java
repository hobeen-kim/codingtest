package programmersBasic.basicday7;

public class Test64 {
    public int solution(int n) {
        int answer = 1;
        for(;;){
            if(n <= answer) break;
            n /= ++answer;
        }
        return answer;
    }
}
