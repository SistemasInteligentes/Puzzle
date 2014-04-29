package Grafos;
public class Edge 
{
	Object Element;
	boolean directed;
	Vertex v1;
	Vertex v2;
	int pos;
	static int cv=0;
	/** Creates a new instance of Edge */
	public Edge() {
		cv++;
	}
	public Edge(Vertex v,Vertex w,Object O) {
		cv++;
		v1=v;
		v2=w;
		Element=O;
		directed=false;
	}
	public Vertex getV1()
	{
		return v1;
	}
	public Vertex getV2()
	{ 
		return v2;
	}
}