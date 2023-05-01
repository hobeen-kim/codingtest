package programmersBasic.basicday8;

public class Test71 {
    public int solution(String s) {

        int result = 0;
        String[] strarray = s.split(" ");
        for(int i = 0; i < strarray.length; i++){
            if(strarray[i].equals("Z")) result -= Integer.parseInt(strarray[i-1]);
            else result += Integer.parseInt(strarray[i]);
        }
        return result;
    }
}
