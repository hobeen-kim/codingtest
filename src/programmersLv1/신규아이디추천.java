package programmersLv1;
import java.util.*;

public class 신규아이디추천 {
    public String solution(String new_id) {
        //https://school.programmers.co.kr/learn/courses/30/lessons/72410#
        //1
        new_id = new_id.toLowerCase();
        //2
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        //3
        String[] arr = new_id.split("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i].equals(".") && arr[i-1].equals(".")) continue;
            stringBuilder.append(arr[i]);
        }
        new_id = stringBuilder.toString();
        //4
        if(new_id.indexOf('.') == 0) new_id = new_id.substring(1, new_id.length());
        if(new_id.lastIndexOf('.') == new_id.length() - 1 && new_id.lastIndexOf('.') != -1) new_id = new_id.substring(0, new_id.length() - 1);
        //5
        if(new_id.equals("")) new_id += "a";
        //6
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if(new_id.lastIndexOf('.') == new_id.length() - 1 && new_id.lastIndexOf('.') != -1) new_id = new_id.substring(0, new_id.length() - 1);
        }
        //7
        while(new_id.length() <= 2){
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}
