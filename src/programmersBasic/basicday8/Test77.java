package programmersBasic.basicday8;

public class Test77 {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int result = Integer.parseInt(arr[0]);

        for(int i = 1; i < arr.length; i += 2){
            result = add(result, arr[i+1], arr[i]);
        }

        return result;
    }

    int add(int a, String b, String c){
        switch (c){
            case "+" :
                return a + Integer.parseInt(b);
            case "-" :
                return a - Integer.parseInt(b);
        }
        return 0;
    }
}
