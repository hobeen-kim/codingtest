package programmersBasic.basicday9;

public class Test87 {
    public int solution(int a, int b) {

        int remain = b;
        for(;;){
            if(remain % 2 == 0){
                remain /= 2;
            }else if(remain % 5 == 0){
                remain /= 5;
            }else{
                break;
            }
        }
        return a % remain == 0 ? 1 : 2;
    }
}
