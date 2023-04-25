package programmersBasic.basicday4;

import java.util.stream.IntStream;

public class Test31_2 {
    public int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count ++;
            }
        }
        return count;
    }

    public int solution2(int n){

        long count = IntStream.rangeClosed(1, n).filter(value -> n % value == 0).count();
        return (int) count;

    }
}
