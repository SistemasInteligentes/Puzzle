package makePuzzle;

import Grafos.*;
import java.util.LinkedList;

public class MainPuzzle {

    public static void main(String[] args) {
        String puzzle = CrearPuzzle.GenerarPuzzle();
        System.out.println(puzzle);
        BFS.BFS_Resolver(puzzle);
        
        /*
        ListEdgesGraph dfsPuzzle = new ListEdgesGraph();
        System.out.println(dfsPuzzle.toString());
        LinkedList<String> prueba = dfsPuzzle.adjacentVertices(null);*/

    }
}
