package puzzle8;

public class Board {

    public int[][] board = new int[3][3];

    public Board() {
    }

    public Board(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        String stringBoard = "";
        for (int[] board1 : board) {
            for (int i = 0; i < board1.length; i++) {
                stringBoard = stringBoard + " " + board1[i];
            }
            stringBoard = stringBoard + " \n";
        }
        return stringBoard;
    }

}
