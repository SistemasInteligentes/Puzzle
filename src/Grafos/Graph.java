package Grafos;

import java.util.*;//le faltaba esta libreria

public interface Graph {

    //Regresa la cantidad de v�rtices en G
    public int numVertices();

    //Regresa la cantidad de aristas en G
    public int numEdges();

    //Regresa una lista de los v�rtices de G
    public LinkedList vertices();

    //Regresa una lista de las aristas de G
    public LinkedList edges();

    //Regresa el grado de V
    public int degree(Vertex V);

    public int degreeInput(Vertex V);

    public int degreeOutput(Vertex V);

    //Regresa un iterador de los v�rtices adyacentes a V
    public LinkedList adjacentVertices(Vertex V);

    //Regresa un iterador de las aristas que inciden en V
    public LinkedList incidentEdges(Vertex V);

    //Inserta una nueva arista
    public Edge insertEdge(Vertex v, Vertex w, Object O, boolean d);

    //Inserta y regresa un nuevo v�rtice
    public Vertex insertVertex(Object O);

    //public Vertice search(int x);
    public String dfs();
}
