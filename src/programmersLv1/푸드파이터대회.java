package programmersLv1;

public class 푸드파이터대회 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/134240
    public String solution(int[] food) {

        int[] newFood = new int[food.length];
        for(int i = 0; i < newFood.length; i++){
            newFood[i] = food[i] / 2;
        }

        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < newFood.length; i++){
            answer.append(String.valueOf(i).repeat(newFood[i]));
        }
        String reversed = answer.toString();


        return reversed + "0" + answer.reverse();
    }
}
