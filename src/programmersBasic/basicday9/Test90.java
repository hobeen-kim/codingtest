package programmersBasic.basicday9;

public class Test90 {
    public int solution(String A, String B) {
        int answer = 0;

        while(answer < A.length()){
            if(A.equals(B)) break;
            String lastB = B.substring(0, 1);
            String remainB = B.substring(1, B.length());
            B = remainB + lastB;
            answer++;
        }
        if(answer == A.length()) return -1;
        return answer;
    }
}
