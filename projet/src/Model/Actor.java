package Model;

public abstract class Actor {
	private int x;
	private int y;
	
	public Actor(int _x, int _y) {
		this.x=_x;
		this.y=_y;
	}
	
	public void afficher(int x, int y) {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}