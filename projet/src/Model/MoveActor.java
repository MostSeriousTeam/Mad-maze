package Model;

public abstract class MoveActor extends Actor {

	public MoveActor(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
		
		public void seDeplacer(int dx, int dy) {
			this.setX(dx);
			this.setY(dy);
		}
	}


