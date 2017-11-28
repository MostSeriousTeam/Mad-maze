package Graph;

import java.io.BufferedWriter;
import java.io.IOException;

public class Vertex implements Comparable<Vertex> {

	private int x,y;
	
	public Vertex() {
		this(0, 0);
	}
	public Vertex(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int compareTo(Vertex o) {
		// TODO Auto-generated method stub
		if ((this.x>o.getX())&&(this.y>o.getY()))
				return 1;
		else
			if ((this.x<o.getX())&&(this.y<o.getY()))
					return -1;
					else 
						return 0;
	}
		public float Distance(Vertex v1,Vertex v2){
			return (float) (Math.pow(v1.getX()-v2.getX(),2)+Math.pow(v1.getY()-v2.getY(),2));
					
		}
        
		public String toString() {
			return "(" + x + "," + y+")";
		}

		public void toDot(BufferedWriter out) throws IOException {
			out.write(toDot() + "[label=\"(" + x + "," + y + ")];");
		}
		public String toDot() {
			return "N_" + x + "_" + y;
		}
}
		
