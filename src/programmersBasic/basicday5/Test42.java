package programmersBasic.basicday5;

public class Test42 {

    public String solution(String cipher, int code) {
        String result = "";
        for(int i = code - 1; i < cipher.length(); i += code){
            result += cipher.charAt(i);
        }
        return result;
    }
}
