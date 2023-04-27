package programmersBasic.basicday6;

public class Test58 {
    public int solution(int n) {
        if(n == 1) return 0;

        int count = n/2 - 1;
        for(int i = 3; i <= n; i+=2){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
