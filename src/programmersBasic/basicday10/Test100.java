package programmersBasic.basicday10;

public class Test100 {

    public int solution(String[] babbling) {

        int result = 0;
        String[] words = new String[]{"aya", "ye", "woo", "ma"};

        for(String s : babbling){
            for(String word : words){
                s = s.replace(word, " ");
            }
            if(s.trim().equals("")) result++;
        }
        return result;
    }
}
