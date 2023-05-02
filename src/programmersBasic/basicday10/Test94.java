package programmersBasic.basicday10;

public class Test94 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int denom = denom1 * denom2;
        int numer = numer1 * denom / denom1 + numer2 * denom / denom2;

        int max = 1;
        for(int i = 1; i <= denom && i <= numer; i++){
            if(denom % i == 0 && numer % i == 0) max = i;
        }


        return new int[]{numer/max, denom/max};
    }
}
