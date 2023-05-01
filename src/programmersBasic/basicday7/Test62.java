package programmersBasic.basicday7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test62 {
    public int solution(String before, String after) {
        String sortedBefore = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String sortedAfter = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        return sortedBefore.equals(sortedAfter) ? 1 : 0;
    }
}
