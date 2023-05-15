package programmersLv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K번째수 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42748
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());

        int[] result = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            result[i] = collect.subList(command[0] - 1, command[1]).stream().sorted().collect(Collectors.toList()).get(command[2] - 1);

        }

        return result;
    }
}
