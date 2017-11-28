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




