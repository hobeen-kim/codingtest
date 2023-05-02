package programmersBasic.basicday10;

public class Test96 {
    public int[] solution(int num, int total) {
        int start = (total * 2 / num - num + 1) / 2;
        int[] result = new int[num];

        for(int i = 0; i < num; i++){
            result[i] = start + i;
        }
        return result;
    }
}
