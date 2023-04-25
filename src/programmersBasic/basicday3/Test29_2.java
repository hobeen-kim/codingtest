package programmersBasic.basicday3;

public class Test29_2 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                answer += my_string.charAt(i);
            }

        }

        return answer;
    }

    public String solution2(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}
