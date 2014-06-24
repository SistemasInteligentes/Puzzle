package Grafos;

public class Vertex {

    Object element;
    private int ei;//CUANDO EL GRAFO ES NO DIRIGIDO
    private int eo;//Cuando el grafo es dirigido
    private int ein;//cuando el grafo es dirigido
    int pos;
    private int state;
    static int ce = 0;

    /**
     * Creates a new instance of Vertex
     */
    public Vertex() {
        ei = 0;
        eo = 0;
        ein = 0;
        element = null;
        pos = ce++;
    }

    public Vertex(Object O) {
        element = O;
        pos = ce++;
    }

    public void setElement(Object O) {

    }

    public Object getElement() {
        return element;
    }

    public int getEi() {
        return ei;
    }

    public int getEo() {
        return eo;
    }

    public int getEin() {
        return ein;
    }

    public void setEi(int x) {
        ei = x;
    }

    public void setEo(int x) {
        eo = x;
    }

    public void setEin(int x) {
        ein = x;
    }

    public void setState(int x) {
        state = x;
    }

    public int getState() {
        return state;
    }
}
