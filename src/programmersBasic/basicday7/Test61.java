package programmersBasic.basicday7;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test61 {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        String answer = "";

        for(String l : letterArr){
            char chr = (char) (IntStream.range(0, morse.length).filter(i -> morse[i].equals(l)).findAny().getAsInt() + 97);
            answer += String.valueOf(chr);
        }
        return answer;
    }

}
