package puzzle8;

public class Move {

    public Move() {
    }

    public Board Up(Board nodo, int posX, int posY) {
        int[][] newBoard = nodo.getBoard();
        int a = newBoard[posY][posX];
        newBoard[posY][posX] = newBoard[posY - 1][posX];
        newBoard[posY - 1][posX] = a;
        nodo.setBoard(newBoard);
        return nodo;
    }

    public Board Down(Board nodo, int posX, int posY) {
        int[][] newBoard = nodo.getBoard();
        int a = newBoard[posY][posX];
        newBoard[posY][posX] = newBoard[posY + 1][posX];
        newBoard[posY + 1][posX] = a;
        Board m = new Board(newBoard);
        //nodo.setBoard(newBoard);
        return m;
    }

    public Board Left(Board nodo, int posX, int posY) {
        int[][] newBoard = nodo.getBoard();
        int a = newBoard[posY][posX];
        newBoard[posY][posX] = newBoard[posY][posX - 1];
        newBoard[posY][posX - 1] = a;
        nodo.setBoard(newBoard);
        return nodo;
    }

    public Board Right(Board nodo, int posX, int posY) {
        int[][] newBoard = nodo.getBoard();
        int a = newBoard[posY][posX];
        newBoard[posY][posX] = newBoard[posY][posX + 1];
        newBoard[posY][posX + 1] = a;
        Board m = new Board(newBoard);
        //nodo.setBoard(newBoard);
        return m;
    }

    public int locateX(Board nodo) {
        int[][] BoardX = nodo.getBoard();
        for (int[] BoardX1 : BoardX) {
            for (int j = 0; j < BoardX1.length; j++) {
                if (BoardX1[j] == 0) {
                    return j;
                }
            }
        }
        return -1;
    }

    public int locateY(Board nodo) {
        int[][] BoardY = nodo.getBoard();
        for (int i = 0; i < BoardY.length; i++) {
            for (int j = 0; j < BoardY[i].length; j++) {
                if (BoardY[i][j] == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
