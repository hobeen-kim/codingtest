package programmersBasic.basicday3;

public class Test21 {
    public String solution(String my_string) {
        String newString = "";
        for(int i = my_string.length() - 1; i >= 0; i--){
            newString += my_string.charAt(i);
        }
        return newString;
    }

    //StringBuilder 풀이
    public String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
