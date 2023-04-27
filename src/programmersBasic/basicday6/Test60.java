package programmersBasic.basicday6;

public class Test60 {
    public String solution(String my_string) {
        String result = "";
        String[] arr = my_string.split("");
        for(String str : arr){
            if(!result.contains(str)) result += str;
        }
        return result;
    }
}
