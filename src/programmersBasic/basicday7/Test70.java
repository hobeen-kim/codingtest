package programmersBasic.basicday7;

public class Test70 {
    public String solution(String bin1, String bin2) {
        int result = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2);
        String[] arr = (result + "").split("");
        boolean isUp = false;

            for(int i = arr.length - 1; i >= 0; i--){
            if(Integer.parseInt(arr[i]) > 1) {
                arr[i] = Integer.parseInt(arr[i]) - 2 + "";
                if(i > 0) arr[i-1] = Integer.parseInt(arr[i-1]) + 1 + "";
                else isUp = true;
            }

        }
        String stringResult = String.join("", arr);
            if(isUp) stringResult = "1" + stringResult;
            return stringResult;
    }


    public String solution2(String bin1, String bin2) {
        int result = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(result);
    }
}
