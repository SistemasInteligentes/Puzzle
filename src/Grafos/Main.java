package Grafos;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String r = "";
        ListEdgesGraph g = new ListEdgesGraph();
        Vertex v1 = g.insertVertex("A");
        Vertex v2 = g.insertVertex("B");
        g.insertEdge(v1, v2, 1, false);
        Vertex v3 = g.insertVertex("C");
        g.insertEdge(v2, v3, 1, false);
        Vertex v4 = g.insertVertex("D");
        g.insertEdge(v3, v4, 1, false);
        Vertex v5 = g.insertVertex("E");
        g.insertEdge(v1, v5, 1, false);
        g.insertEdge(v2, v5, 1, false);
        g.insertEdge(v3, v5, 1, false);
        Vertex v6 = g.insertVertex("F");
        g.insertEdge(v3, v6, 1, false);
        Vertex v7 = g.insertVertex("G");
        g.insertEdge(v5, v7, 1, false);
        Vertex v8 = g.insertVertex("H");
        g.insertEdge(v1, v8, 1, false);
        g.insertEdge(v5, v8, 1, false);
        Vertex v9 = g.insertVertex("I");
        g.insertEdge(v8, v9, 1, false);
        Vertex v10 = g.insertVertex("J");
        g.insertEdge(v6, v10, 1, false);
        g.insertEdge(v8, v10, 1, false);
        g.insertEdge(v7, v10, 1, false);
        System.out.println("Numero de vertices: " + g.numVertices());
        System.out.println("Numero de aristas: " + g.numEdges());
        System.out.println("Grado del vertice A: " + g.degree(v1));
        System.out.println("Grado del vertice H: " + g.degree(v8));
        r = g.dfs();
        System.out.println("Recorrido bfs del grafo " + r);

        System.out.println("Este codigo lo agrege yo");
        Vertex v11 = g.insertVertex("K");
        Vertex v12 = g.insertVertex("L");
        Vertex v13 = g.insertVertex("M");
        Vertex v14 = g.insertVertex("N");
        //salen de m
        g.insertEdge(v11, v12, 1, true);
        g.insertEdge(v11, v13, 1, true);
        g.insertEdge(v11, v14, 1, true);
        //salen de l
        g.insertEdge(v12, v11, 1, true);
        //SALEN DE M
        g.insertEdge(v13, v12, 1, true);
        //salen de n
        g.insertEdge(v14, v13, 1, true);
        System.out.println("Aristas que entran a K " + g.degreeInput(v11));
        System.out.println("Aristas que entran a L " + g.degreeInput(v12));
        System.out.println("Aristas que entran a M " + g.degreeInput(v13));
        System.out.println("Aristas que entran a N " + g.degreeInput(v14));
        System.out.println("Aristas que salen de K " + g.degreeOutput(v11));
        System.out.println("Aristas que salen de L " + g.degreeOutput(v12));
        System.out.println("Aristas que salen de M " + g.degreeOutput(v13));
        System.out.println("Aristas que salen de N " + g.degreeOutput(v14));
    }
}
