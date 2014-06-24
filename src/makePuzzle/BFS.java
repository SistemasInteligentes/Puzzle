package makePuzzle;

import java.util.*;

public class BFS {

    private static LinkedList<String> listaPuzzle = new LinkedList<>();
    private static Map<String, String> registroPadre = new HashMap<>();

    private static String solucion;

    public static void BFS_Resolver(String solucion) {
        BFS.solucion = solucion;
        agregar(solucion, null);
        while (!listaPuzzle.isEmpty()) {
            Puzzle lista = new Puzzle(listaPuzzle.removeFirst());
            if (lista.solucion()) {
                System.out.println(lista.datos);
                break;
            }
            lista.setPosicionCero();

            String siguientePuzzle;

            if (lista.posicionCero != 0 && lista.posicionCero != 1 && lista.posicionCero != 2) {
                siguientePuzzle = lista.arriba();
                agregar(siguientePuzzle, lista.datos);
            }
            if (lista.posicionCero != 2 && lista.posicionCero != 5 && lista.posicionCero != 8) {
                siguientePuzzle = lista.derecha();
                agregar(siguientePuzzle, lista.datos);
            }
            if (lista.posicionCero != 6 && lista.posicionCero != 7 && lista.posicionCero != 8) {
                siguientePuzzle = lista.abajo();
                agregar(siguientePuzzle, lista.datos);
            }
            if (lista.posicionCero != 0 && lista.posicionCero != 1 && lista.posicionCero != 2) {
                siguientePuzzle = lista.izquierda();
                agregar(siguientePuzzle, lista.datos);
            }
            //System.out.println(lista.datos);
        }

    }

    private static void agregar(String siguientePuzzle, String padre) {
        if (!registroPadre.containsKey(siguientePuzzle)) {
            listaPuzzle.add(siguientePuzzle);
            registroPadre.put(siguientePuzzle, padre);
        }
    }
}
