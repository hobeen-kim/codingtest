package programmersLv1;

import java.util.HashSet;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j) hashSet.add(numbers[i] + numbers[j]);
            }
        }

        return hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
