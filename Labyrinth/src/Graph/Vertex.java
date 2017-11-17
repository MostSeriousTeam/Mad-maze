package Graph;


public class Vertex implements Comparable<Vertex> {

	private int x,y;
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

}

/*public class Vertex implements Comparable<Vertex>{
	private Point position;
	public Vertex(){
		position = new Point(0,0);
	}
	public Vertex(Point p){
		position = p;
	}
	public Point getPosition(){
		return position;
	}
	public int compareTo(Vertex o) {
		return this.position.compareTo(o.position);
	}
}
*/