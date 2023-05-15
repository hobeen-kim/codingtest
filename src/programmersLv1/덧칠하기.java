package programmersLv1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int[] walls = new int[n];
        int count = 0;

        for(int blank : section){
            walls[blank - 1] = 1;
        }

        for(int i = 0; i < walls.length - m; i++ ){
            if(walls[i] == 1){
                for(int j = 0; j < m; j++){
                    walls[i+j] = 0;
                }
                count++;
            }
        }

        for(int wall : walls){
            if(wall == 1){
                count++;
                break;
            }
        }
        int keyLocation = Integer.MAX_VALUE;
        return count;
    }
}
