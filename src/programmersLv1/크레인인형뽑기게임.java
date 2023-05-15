package programmersLv1;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/64061
    public int solution(int[][] board, int[] moves) {

        Stack<Integer>[] boardStack = new Stack[board[0].length];
        Stack<Integer> pickStack = new Stack<>();
        int result = 0;

        for(int i = 0; i < board[0].length; i++){
            boardStack[i] = new Stack<Integer>();
        }

        for(int i = board.length - 1; i >= 0; i--){
            int[] b = board[i];
            for(int j = 0; j < b.length; j++){
                if(b[j] != 0) boardStack[j].push(b[j]);
            }
        }

        for(int move : moves){

            if(boardStack[move - 1].empty()) continue;

            int picked = boardStack[move - 1].pop();

            if(!pickStack.empty()) {
                if(pickStack.peek() == picked){
                    pickStack.pop();
                    result++;
                }else pickStack.push(picked);
            }
            else pickStack.push(picked);
        }

        return result * 2;
    }
}
