package programmersLv1;

public class 나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        //https://school.programmers.co.kr/learn/courses/30/lessons/87389
        double sqrt = Math.sqrt(n - 1);

        int answer = 1;

        for(int i = 2; i <= sqrt; i++){
            if((n-1) % i == 0){
                answer = i;
                break;
            }
        }

        return answer == 1 ? n - 1 : answer;
    }
}
