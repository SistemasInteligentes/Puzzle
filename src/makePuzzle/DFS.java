package makePuzzle;

import Grafos.*;
import java.util.*;

public class DFS {

    private static LinkedList<String> listaPuzzle = new LinkedList<>();
    private static Map<String, String> registroPadre = new HashMap<>();

    private static String solucion;

    public static void DFS_Resolver(String solucion) {
        DFS.solucion = solucion;
        agregar(solucion, null);
        while (!listaPuzzle.isEmpty()) {
            Puzzle lista = new Puzzle(listaPuzzle.removeFirst());
            System.out.println(lista.datos);
            if (lista.solucion()) {
                System.out.println(registroPadre.toString());
                //System.out.println(lista.datos);
                break;
            }
            lista.setPosicionCero();

            String siguienteArriba = null;
            String siguienteDerecha = null;
            String siguienteAbajo = null;
            String siguienteIzquierda = null;

            if (lista.posicionCero != 0 && lista.posicionCero != 1 && lista.posicionCero != 2) {
                siguienteArriba = lista.arriba();
            }
            if (lista.posicionCero != 2 && lista.posicionCero != 5 && lista.posicionCero != 8) {
                siguienteDerecha = lista.derecha();
            }
            if (lista.posicionCero != 6 && lista.posicionCero != 7 && lista.posicionCero != 8) {
                siguienteAbajo = lista.abajo();
            }
            if (lista.posicionCero != 0 && lista.posicionCero != 1 && lista.posicionCero != 2) {
                siguienteIzquierda = lista.izquierda();
            }
            agregar(siguienteArriba, siguienteDerecha, siguienteAbajo, siguienteIzquierda, lista.datos);
        }

    }

    private static void agregar(String siguientePuzzle, String padre) {
        if (!registroPadre.containsKey(siguientePuzzle)) {
            listaPuzzle.add(siguientePuzzle);
            registroPadre.put(siguientePuzzle, padre);
        }
    }

    private static void agregar(String siguienteArriba, String siguienteDerecha, String siguienteAbajo, String siguienteIzquierda, String padre) {
        if (!registroPadre.containsKey(siguienteArriba) && siguienteArriba != null) {
            listaPuzzle.add(siguienteArriba);
            registroPadre.put(siguienteArriba, padre);
            return;
        } 
        if (!registroPadre.containsKey(siguienteDerecha) && siguienteDerecha != null) {
            listaPuzzle.add(siguienteDerecha);
            registroPadre.put(siguienteDerecha, padre);
            return;
        }
        if (!registroPadre.containsKey(siguienteAbajo) && siguienteAbajo != null) {
            listaPuzzle.add(siguienteAbajo);
            registroPadre.put(siguienteAbajo, padre);
            return;
        }
        if (!registroPadre.containsKey(siguienteIzquierda) && siguienteIzquierda != null) {
            listaPuzzle.add(siguienteIzquierda);
            registroPadre.put(siguienteIzquierda, padre);
            return;
        }
    }
}
