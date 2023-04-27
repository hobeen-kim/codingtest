package programmersBasic.basicday5;

public class Test48 {
    class Solution {
        public int solution(int[] numbers) {

            int answer = Integer.MIN_VALUE;
            for(int i = 0; i < numbers.length; i++){
                for(int j = 0; j < numbers.length; j++){
                    if(i == j) continue;
                    answer = answer < numbers[i] * numbers[j] ? numbers[i] * numbers[j] : answer;
                }
            }
            return answer;
        }
    }
}
