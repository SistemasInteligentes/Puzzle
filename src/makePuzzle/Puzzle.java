package makePuzzle;

public class Puzzle {

    String datos;
    int posicionCero;

    public Puzzle(String datos) {
        this.datos = datos;
    }

    public void setPosicionCero() {
        posicionCero = this.datos.indexOf("0");
    }

    public String abajo() {
        return this.datos.substring(0, posicionCero)
                + this.datos.substring(posicionCero + 3, posicionCero + 4)
                + this.datos.substring(posicionCero + 1, posicionCero + 3) + "0"
                + this.datos.substring(posicionCero + 4);
    }

    public String arriba() {
        return this.datos.substring(0, posicionCero - 3) + "0"
                + this.datos.substring(posicionCero - 2, posicionCero)
                + this.datos.charAt(posicionCero - 3)
                + this.datos.substring(posicionCero + 1);
    }

    public String izquierda() {
        return this.datos.substring(0, posicionCero - 1) + "0"
                + this.datos.charAt(posicionCero - 1)
                + this.datos.substring(posicionCero + 1);
    }

    public String derecha() {
        return this.datos.substring(0, posicionCero)
                + this.datos.charAt(posicionCero + 1) + "0"
                + this.datos.substring(posicionCero + 2);
    }

    public boolean solucion() {
        return this.datos.equals("123456780");
    }
}
