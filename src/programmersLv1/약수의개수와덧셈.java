package programmersLv1;

public class 약수의개수와덧셈 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/77884
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            int sqrt = (int) Math.sqrt(i);

            if(sqrt * sqrt == i) answer -= i;
            else answer += i;
        }
        return answer;
    }
}
