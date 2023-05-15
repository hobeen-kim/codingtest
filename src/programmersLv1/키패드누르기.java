package programmersLv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 키패드누르기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/67256
    public String solution(int[] numbers, String hand) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,5,8,0));

        int placeLeft = -1;
        int placeRight = 1;

        StringBuilder stringBuilder = new StringBuilder();
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                stringBuilder.append("L");
                placeLeft = number;
            }else if(number == 3 || number == 6 || number == 9){
                stringBuilder.append("R");
                placeRight = number;
            }else{
                int distanceLeft = 0;
                int distanceRight = 0;
                int numberLocation = arrayList.indexOf(number);

                if(!arrayList.contains(placeLeft)) distanceLeft++;
                distanceLeft += Math.abs(arrayList.indexOf(placeLeft + distanceLeft) - numberLocation);

                if(!arrayList.contains(placeRight)) distanceRight++;
                distanceRight += Math.abs(arrayList.indexOf(placeRight - distanceRight) - numberLocation);

                if(distanceLeft < distanceRight){
                    placeLeft = number;
                    stringBuilder.append("L");
                }else if(distanceLeft > distanceRight){
                    placeRight = number;
                    stringBuilder.append("R");
                }else{
                    if(hand.equals("left")){
                        placeLeft = number;
                        stringBuilder.append("L");
                    }
                    else {
                        placeRight = number;
                        stringBuilder.append("R");
                    }
                }
            }
        }

        return stringBuilder.toString();
    }
}
