package programmersBasic.basicday8;

public class Test76 {
    public String[] solution(String my_str, int n) {
        int answerlength = my_str.length() / n;
        if(my_str.length() % n != 0) answerlength++;

        String[] answer = new String[answerlength];

        for(int i = 0; i < answerlength; i++){
            answer[i] = my_str.substring(i * n, Math.min(n * (i+1), my_str.length()));
        }

        return answer;
    }
}
