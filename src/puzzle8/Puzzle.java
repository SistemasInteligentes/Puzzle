package puzzle8;

import Grafos.*;

public class Puzzle {

    private static final Move move = new Move();
    private static ListEdgesGraph graphs = new ListEdgesGraph();
    private static Board nodos;
    private static final int[][] f = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private static final Board last = new Board(f);
    private static int locateX;
    private static int locateY;

    private static void addVertex(Board father) {
        Board _father = father;
        locateX = move.locateX(_father);
        locateY = move.locateY(_father);
        Board Up = new Board();
        Board Down = new Board();
        Board Right = new Board();
        Board Left = new Board();

        if (locateX == 0 && locateY == 0) {
            Right = move.Right(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
        }
        
        if (locateX == 0 && locateY == 1) {
            Left = move.Left(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
            Right = move.Right(_father, locateX, locateY);
        }
        
        if (locateX == 0 && locateY == 2) {
            Left = move.Left(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
        }
        
        if (locateX == 1 && locateY == 0) {
            Up = move.Up(_father, locateX, locateY);
            Right = move.Right(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
        }
        
        if (locateX == 1 && locateY == 1) {
            Up = move.Up(_father, locateX, locateY);
            Right = move.Right(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
            Left = move.Left(_father, locateX, locateY);
        }
        
        if (locateX == 1 && locateY == 2) {
            Up = move.Up(_father, locateX, locateY);
            Left = move.Left(_father, locateX, locateY);
            Down = move.Down(_father, locateX, locateY);
        }
        
        if (locateX == 2 && locateY == 0) {
            Up = move.Up(_father, locateX, locateY);
            Right = move.Right(_father, locateX, locateY);
        }
        
        if (locateX == 2 && locateY == 1) {
            Left = move.Left(_father, locateX, locateY);
            Up = move.Up(_father, locateX, locateY);
            Right = move.Right(_father, locateX, locateY);
        }
        
        if (locateX == 2 && locateY == 2) {
            Left = move.Left(_father, locateX, locateY);
            Up = move.Up(_father, locateX, locateY);
        }
        
        System.out.println(Up.toString());
        System.out.println(Down.toString());
        System.out.println(Left.toString());
        System.out.println(Right.toString());

    }

    public static void main(String[] args) {
        int[][] tablero = {{0, 1, 3}, {4, 2, 5}, {7, 8, 9}};
        nodos = new Board(tablero);
        System.out.println(nodos.toString());
        System.out.println("------------------------");
        addVertex(nodos);
        System.out.println("------------------------");
        System.out.println(nodos.toString());
    }
}
