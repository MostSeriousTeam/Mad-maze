package Graph;

import java.io.BufferedWriter;

import org.jgrapht.graph.DefaultEdge;

public class Edge extends DefaultEdge implements Comparable<Edge> {
	public int compareTo(Edge o) {
		int sourceDiff = ((Vertex)this.getSource()).compareTo((Vertex)o.getSource());
		if(sourceDiff!=0)
			return sourceDiff;
		else
			return ((Vertex)this.getTarget()).compareTo((Vertex)o.getTarget());
	}
	public String toString() {
	
		return  "(" + this.getSource() + "," + this.getTarget()+")";
	}

	public Vertex getSource() {
		return (Vertex)super.getSource();
	}
	
	public Vertex getTarget() {
		return (Vertex)super.getTarget();
	}
	public void toDot(BufferedWriter out) {
		out.write(this.getSource().toDot() + "--" + this.getTarget().toDot() + ";");
	}
}
