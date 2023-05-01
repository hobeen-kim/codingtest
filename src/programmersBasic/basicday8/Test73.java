package programmersBasic.basicday8;

public class Test73 {
    public int solution(int[] numbers, int k) {
        int count = (2*k - 1) % numbers.length - 1;
        if(count < 0) count = numbers.length -1;
        return numbers[count];
    }
}
