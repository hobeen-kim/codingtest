package programmersBasic.basicday7;

import java.util.Arrays;

public class Test66 {
    public int[] solution(int[] emergency) {

        int arrLength = emergency.length;

        int[] newArray = new int[arrLength];
        System.arraycopy(emergency, 0, newArray, 0, arrLength);
        Arrays.sort(newArray);

        int[] result = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            for(int j = 0; j < arrLength; j++){
                if(newArray[i] == emergency[j]) result[i] = arrLength - j;
            }
        }

        return result;
    }
}
