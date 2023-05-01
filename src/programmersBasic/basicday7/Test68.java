package programmersBasic.basicday7;

public class Test68 {
    class Solution {
        public int solution(String my_string) {
            char[] charArray = my_string.toCharArray();
            int result = 0;
            String resultChar = "0";
            for(char chr : charArray){
                if(chr >= 48 && chr < 58) {
                    resultChar += String.valueOf(chr);
                }else{
                    result += Integer.parseInt(resultChar);
                    resultChar = "0";
                }
            }
            result += Integer.parseInt(resultChar);

            return result;
        }
    }
}
