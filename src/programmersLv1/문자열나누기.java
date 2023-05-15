package programmersLv1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;

        char firstChar = 0;
        int firstCharCount = 0;
        int othersCount = 0;

        for(char c : s.toCharArray()){

            if(firstChar == 0) firstChar = c;

            if(c == firstChar) firstCharCount++;
            else othersCount++;

            if(firstCharCount == othersCount){
                answer++;
                firstChar = 0;
            }
        }
        if(firstChar != 0) answer++;

        return answer;
    }
}
