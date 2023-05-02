package programmersBasic.basicday10;

public class Test93 {
    public String[] solution(String[] quiz) {

        String[] result = new String[quiz.length];

        for(int i = 0; i < result.length; ++i){
            result[i] = validation(quiz[i]);
        }

        return result;

    }

    String validation(String x){
        String[] arr = x.split(" = ");
        int leftSide = calculate(arr[0]);
        int rightSide = Integer.parseInt(arr[1]);
        return leftSide == rightSide ? "O" : "X" ;
    }

    int calculate(String leftSide){
        String[] arr = leftSide.split(" ");
        switch(arr[1]){
            case "+":
                return Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            case "-":
                return Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        }
        return 0;
    }
}
