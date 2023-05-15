package programmersLv1;

public class 체육복 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public int solution(int n, int[] lost, int[] reserve) {

        int[] clothes = new int[n+2];
        for(int l : lost){
            clothes[l]--;
        }
        for(int r : reserve){
            clothes[r]++;
        }

        for(int i = 0; i < n; i++){
            //앞 사람이 체육복이 있으면 빌린다.
            if(clothes[i+1] == -1 && clothes[i] == 1){
                clothes[i]--;
                clothes[i+1]++;
                //아니면 뒷사람 껄 빌린다.
            }else if(clothes[i+1] == -1 && clothes[i+2] == 1){
                clothes[i+1]++;
                clothes[i+2]--;
            }
        }

        int result = -2;
        for(int cloth : clothes) if(cloth != -1) result++;
        return result;
    }
}
