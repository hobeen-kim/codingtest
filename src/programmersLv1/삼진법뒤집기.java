package programmersLv1;

public class 삼진법뒤집기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public int solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int max = 1;
        while(n / max >= 3){
            max *= 3;
        }

        while(max != 0){
            stringBuilder.append(n/max);
            n %= max;
            max /= 3;
        }

        String[] strArr = stringBuilder.reverse().toString().split("");

        int result = 0;

        for(int i = 0; i < strArr.length; i++){
            result += Integer.parseInt(strArr[i]) * Math.pow(3, strArr.length - 1 - i);
        }

        return result;
    }
}
