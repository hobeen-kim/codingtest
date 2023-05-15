package programmersLv1;

public class 햄버거만들기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/133502
    public int solution(int[] ingredient) {
        StringBuilder stringBuilder = new StringBuilder();
        int result = 0;
        String hamburger = "1231";
        int pointer = -4;

        for(int i = 0; i < ingredient.length; i++){
            stringBuilder.append(ingredient[i]);
            int index = stringBuilder.indexOf(hamburger, pointer);
            pointer++;
            if(index != -1){
                stringBuilder.delete(index, index + 4);
                result++;
                pointer -= 4;
            }
        }
        return result;

        //빵 야채 고기 빵이 생기면 지우고 result ++
    }
}
