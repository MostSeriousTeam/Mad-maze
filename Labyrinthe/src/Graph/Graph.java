package Graph;

import org.jgrapht.graph.SimpleGraph;

public class Graph extends SimpleGraph<Vertex,Edge>{
	
	public Graph() {
		super(Edge.class);
		// TODO Auto-generated constructor stub
	}
	public String toDot() {
		String g = "{";
		for (Vertex v : this.vertexSet())
			g += v.toDot() + ";";
		for (Edge e : this.edgeSet())
			g += e.toDot() + ";";
		return g + "}";
	}
	
	
}


/*public class Graph implements Comparable<Graph>{
	private Vertex[] voisin;
	private int taille;
	public Graph(){
		taille = 6;
		voisin = new Vertex[1];
		voisin[0] = new Vertex();
	}
	public Graph(Vertex v){
		taille = 0;
		voisin = new Vertex[1];
		voisin[0] = v;
	}
	public void setVoisin(Vertex v){
		++taille;
		Vertex[] tmp = new Vertex[taille];
		System.arraycopy(voisin, 0, tmp, 0, taille-1);
		voisin = tmp;
		voisin[taille-1] = v;
	}
	public boolean isLeaf(){
		return taille == 0;
	}
	public Vertex getPosition(){
		return voisin[0];
	}
	public int compareTo(Graph o) {
		return this.voisin[0].compareTo(o.voisin[0]);
	}
	//public String toString(){
	
		//return "" + taille;
	public String toString ()
	{
		return ("("++")");
	}
		
	}
*/


