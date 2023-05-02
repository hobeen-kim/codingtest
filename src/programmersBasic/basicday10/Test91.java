package programmersBasic.basicday10;

public class Test91 {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int constant = 0;
        int x = 0;
        String plus = "x + ";
        for(int i = 0; i < arr.length; i += 2){
            if(arr[i].contains("x")){
                if(arr[i].substring(0,1).equals("x")){
                    x += 1;
                }else{
                    x += Integer.parseInt(arr[i].substring(0,arr[i].indexOf("x")));
                }
            }
            else constant += Integer.parseInt(arr[i]);
        }
        if(x == 0 && constant == 0) return "0";
        if(x == 0) return constant + "";
        if(constant == 0){
            if(x == 1) return "x";
            return x + "x";
        }
        if(x == 1) return plus + constant;
        return x + plus + constant;
    }
}
