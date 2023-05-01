package programmersBasic.basicday9;

import java.util.Arrays;

public class Test89 {
    public int[] solution(int[] numlist, int n) {
        numlist = Arrays.stream(numlist).map(value -> value - n).toArray();

        for(int i = 0; i < numlist.length; i++){
            for(int j = i+1; j < numlist.length; j++){
                if(Math.abs(numlist[i]) > Math.abs(numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }else if(Math.abs(numlist[i]) == Math.abs(numlist[j])){
                    if(numlist[j] > 0){
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
        }
        numlist = Arrays.stream(numlist).map(value -> value + n).toArray();

        return numlist;
    }
}
