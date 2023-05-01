package programmersBasic.basicday8;

public class Test74 {
    public int solution(int[] array) {
        int answer = 0;

        for(int i : array){
            while(i > 1){
                if(i % 10 == 7) answer++;
                i /= 10;
            }
        }
        return answer;
    }
}
