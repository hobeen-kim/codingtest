package programmersLv1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long pay = (long) price * count * (count + 1) / 2;
        long answer = pay - money;

        return answer >= 0 ? answer : 0;
    }
}
