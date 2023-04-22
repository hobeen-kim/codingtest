package programmersBasic.basicday1;

public class Test10 {
    public int solution(int n) {
        int countEven = (n/2);
        int lastEven =  countEven * 2;
        return (2 + lastEven) * countEven / 2;
    }
}
