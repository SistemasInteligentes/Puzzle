package makePuzzle;

import java.util.*;

public class CrearPuzzle {

    private static Puzzle listaPuzzle = new Puzzle("123456780");

    public static String GenerarPuzzle() {
        Random random = new Random();
        int level = 100;

        for (int i = 0; i < level; i++) {
            int a = random.nextInt(4);
            listaPuzzle.setPosicionCero();

            if (a == 0 && listaPuzzle.posicionCero != 0 && listaPuzzle.posicionCero != 1 && listaPuzzle.posicionCero != 2) {
                listaPuzzle.datos = listaPuzzle.arriba();
            } else if (a == 1 && listaPuzzle.posicionCero != 2 && listaPuzzle.posicionCero != 5 && listaPuzzle.posicionCero != 8) {
                listaPuzzle.datos = listaPuzzle.derecha();
            } else if (a == 2 && listaPuzzle.posicionCero != 6 && listaPuzzle.posicionCero != 7 && listaPuzzle.posicionCero != 8) {
                listaPuzzle.datos = listaPuzzle.abajo();
            } else if (a == 3 && listaPuzzle.posicionCero != 0 && listaPuzzle.posicionCero != 3 && listaPuzzle.posicionCero != 6) {
                listaPuzzle.datos = listaPuzzle.izquierda();
            }
        }

        return listaPuzzle.datos;
    }
}
