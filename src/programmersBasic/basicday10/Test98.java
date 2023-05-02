package programmersBasic.basicday10;

public class Test98 {
    public int solution(int[][] lines) {
        int[] answerArr = new int[201];

        for(int[] line : lines){
            for(int i = line[0] + 1; i <= line[line.length - 1]; i++){
                answerArr[i+100]++;
            }
        }
        int answer = 0;
        for(int i : answerArr){
            if(i > 1) answer++;
        }
        return answer;
    }
}
