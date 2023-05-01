package programmersBasic.basicday9;

public class Test88 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i < n; i++){
            answer++;
            while(answer % 3 == 0 || hasThree(answer)){
                answer++;
            }

        }

        return answer;
    }

    boolean hasThree(int a){
        while(a > 1){
            if(a % 10 == 3) return true;
            a /= 10;
        }
        return false;
    }
}
