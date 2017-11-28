package Graph;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jgrapht.graph.SimpleGraph;

@SuppressWarnings("serial")
public class Graph extends SimpleGraph<Vertex,Edge>{
	
	public Graph() {
		super(Edge.class);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		String g = "{";
		for (Vertex v : this.vertexSet())
			g += v.toString() + ";";
		for (Edge e : this.edgeSet())
			g += e.toString() + ";";
		return g + "}";
	}
	
	public void toDot ( String filename ) {
		
		try {
			
			FileWriter istream= new FileWriter (filename, false );
			BufferedWriter out=new BufferedWriter (istream);
			out.write("Graph G {");
			for (Vertex vertex: this.vertexSet()) {
				vertex.toDot(out);
			}
			for (Edge edge : this.edgeSet()) {
				edge.toDot(out);
			}
			out.write("}");
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}




