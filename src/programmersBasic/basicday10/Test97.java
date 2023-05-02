package programmersBasic.basicday10;

public class Test97 {
    public int solution(int[][] board) {

        int n = board.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    board = warning(board, i, j, n);
                }
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    result++;
                }
            }
        }
        return result;
    }
    int[][] warning(int[][] board, int i, int j, int n){
        int plusi = i == n-1 ? i : i + 1;
        int minusi = i == 0 ? i : i - 1;
        int plusj = j == n-1 ? j : j + 1;
        int minusj = j == 0 ? j : j - 1;

        board[i][plusj] = board[i][plusj] == 0 ? 2 : board[i][plusj];
        board[i][minusj] = board[i][minusj] == 0 ? 2 : board[i][minusj];
        board[plusi][plusj] = board[plusi][plusj] == 0 ? 2 : board[plusi][plusj];
        board[plusi][minusj] = board[plusi][minusj] == 0 ? 2 : board[plusi][minusj];
        board[plusi][j] = board[plusi][j] == 0 ? 2 : board[plusi][j];
        board[minusi][plusj] = board[minusi][plusj] == 0 ? 2 : board[minusi][plusj];
        board[minusi][minusj] = board[minusi][minusj] == 0 ? 2 : board[minusi][minusj];
        board[minusi][j] = board[minusi][j] == 0 ? 2 : board[minusi][j];

        return board;
    }
}
