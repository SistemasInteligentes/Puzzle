package Grafos;
import java.util.*;
	public class ListEdgesGraph implements Graph{
		
	public LinkedList lv=new LinkedList();
	public LinkedList le=new LinkedList();
	//Contadores para adicionar elementos en las listas
	int cv=0;
	int ce=0;
	public ListEdgesGraph()
	{
	}
	public int numVertices()
	{
		return lv.size();
	}
	//Regresa la cantidad de aristas en G
	public int numEdges()
	{
		return le.size();
	}
	//Regresa una lista con los v�rtices de G
	public LinkedList vertices()
	{
		return lv;
	}
	//Regresa una lista con las aristas de G
	public LinkedList edges()
	{
		return le;
	}
	//Inserta y regresa un nuevo v�rtice
	public Vertex insertVertex(Object O)
	{
		Vertex v=new Vertex(O);
		lv.add(cv++,v);
		return v;
	}
	//Inserta y regresa una nueva arista
	public Edge insertEdge(Vertex v, Vertex w,Object O,boolean d)
	{
		int x,y;
		Edge e=new Edge(v,w,O);
		le.add(ce++,e);
		if (d==true)
		{
			System.out.println("Entre por true");
			x=v.getEo();//LAS QUE SALEN
			x++;
			v.setEo(x);
			y=w.getEin();//LAS QUE ENTRAN
			y++;
			w.setEin(y);//profe tenia un error tenia v, en vez de w
		}
		else
		{
			x=v.getEi();
			x++;
			v.setEi(x);
			y=w.getEi();
			y++;
			w.setEi(y);
		}
		return e;
	}
	//Regresa el grado de V
	public int degree(Vertex V)
	{
		for (int i=0;i<lv.size(); i++)
		{
			Vertex V2=(Vertex)lv.get(i);
			if (V==V2)
			{
				return V.getEi();
			}
		}
		return 0;
		
	}
	//Regresa el numero de aristas que entran a V
	public int degreeInput(Vertex V)
	{
		return V.getEin();	
	}
	//regresa el numero de Aristas que salen de V
	public int degreeOutput(Vertex V)
	{
		return V.getEo();	
	}
	//Regresa una lista de los v�rtices adyacentes a V
	public LinkedList adjacentVertices(Vertex V)
	{
		LinkedList L=new LinkedList();
		int c=0;
		for (int i=0;i<le.size(); i++)
		{ 
			Edge e=(Edge)le.get(i);
			Vertex V1=e.getV1();
			Vertex V2=e.getV2();
			if (V1==V)
			{
				L.add (c++,V2);
			}
			if (V2==V)
			{
				L.add (c++,V1);
			}
		}
		return L;
	}
	//Regresa un iterador de las aristas que inciden en V
	public LinkedList incidentEdges(Vertex V)
	{
		LinkedList L=new LinkedList();
		int c=0;
		for (int i=0;i<le.size(); i++)
		{ 
			Edge e=(Edge)le.get(i);
			Vertex V1=e.getV1();
			Vertex V2=e.getV2();
			if (V1==V)
			{ 
				L.add (c++,e);
			}
			if (V2==V)
			{ 
				L.add (c++,e);
			}
		}
		return L;
	}
	//Regresa el recorrido dfs de G
	public String dfs()
	{
		for (int i=0;i<lv.size(); i++)
		{ 
			Vertex w=(Vertex)lv.get(i);
			w.setState(0);
		}
		LinkedList L=new LinkedList();
		LinkedList L2=new LinkedList();
		int c=0;
		Vertex w=(Vertex)lv.get(0);
		L.add(c++,w);
		w.setState(1);
		String r="";
		while (L.size() !=0)
		{
			w=(Vertex)L.getFirst();
			//System.out.println(w.getElement());
			r=r+w.getElement();
			w.setState(3);
			c--;
			L.removeFirst();
			L2=adjacentVertices(w);
			for (int i=0;i<L2.size(); i++)
			{ 
				Vertex y=(Vertex)L2.get(i);
				if (y.getState()==0) 
				{
					L.add(c++,y);
					y.setState(2);
				}
			}
		}
	return r;
	}
}