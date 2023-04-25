package programmersBasic.basicday4;

public class Test33_2 {
    class Solution {
        public String solution(String my_string) {
            String[] stringArray = my_string.split("");
            String result = "";
            for(int i = 0; i < my_string.length(); i++){
                if(stringArray[i].equals("a") ||
                        stringArray[i].equals("e") ||
                        stringArray[i].equals("i") ||
                        stringArray[i].equals("o") ||
                        stringArray[i].equals("u")){
                    continue;
                }
                result += stringArray[i];

            }
            return result;
        }
    }

    class Solution2 {
        public String solution(String my_string) {
            String answer = "";

            answer = my_string.replaceAll("[aeiou]", "");

            return answer;
        }
    }
}
