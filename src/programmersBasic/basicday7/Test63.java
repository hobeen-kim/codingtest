package programmersBasic.basicday7;

public class Test63 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0; i < num_list.length/n; i++){
            for(int j = 0; j < n; j++){
                int order = n * i + j;
                answer[i][j] = num_list[order];
            }
        }
        return answer;
    }
}
