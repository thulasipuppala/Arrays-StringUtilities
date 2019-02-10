package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String board[][];

    public TicTacToe(String[][] board) {
       this.board = board;
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] output = new String[3];
        for(int i=0;i<3;i++){
            output[i] = board[i][value];
        }

        return output;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        boolean check = false;
        for(int j = 1; j < board[rowIndex].length; j++){
            if(j+1 != board[rowIndex].length)
                if(board[rowIndex][j].equals(board[rowIndex][j+1])){
                    check = true;
                }
        }
        return check;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        boolean check = false;
        for(int i=0;i<board.length;i++) {
            if (i + 1 != board.length)
                if (board[i][columnIndex].equals(board[i + 1][columnIndex])) {
                    check = true;
                }
                else
                    return false;
        }
        return check;
    }

    public String getWinner() {
        String result = null;
        for(int i=0;i<board.length;i++){
            if(isRowHomogenous(i))
                result = board[i][0];
            if(isColumnHomogeneous(i))
                result = board[0][i];

        }
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            result = board[2][2];
        if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
            result = board[0][2];

        return result;
    }
}
