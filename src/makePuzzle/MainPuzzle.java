package makePuzzle;

import Grafos.*;
import java.util.LinkedList;

public class MainPuzzle {

    public static void main(String[] args) {
        //for (int i = 0; i < 100; i++) {
            String puzzle = CrearPuzzle.GenerarPuzzle();
            System.out.println(puzzle);
            BFS.BFS_Resolver(puzzle);
            System.out.println("");
            DFS.DFS_Resolver(puzzle);

        //}

        /*
         ListEdgesGraph dfsPuzzle = new ListEdgesGraph();
         System.out.println(dfsPuzzle.toString());
         LinkedList<String> prueba = dfsPuzzle.adjacentVertices(null);*/
    }
}
