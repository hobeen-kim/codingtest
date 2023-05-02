package programmersBasic.basicClue;

public class Test둘만의암호 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int count = 0;
            char c = s.charAt(i);
            while(count < index){
                c++;
                if(c > 'z') c = 'a';
                if(skip.contains(String.valueOf(c))) continue;
                count++;
            }
            answer.append(c);
        }

        return answer.toString();
    }
}
