package Model;


public class Model {
	
	private Labyrinth labyrinth;

	public Model() {
		labyrinth =  Labyrinth.getInstance();
	}

	public Labyrinth getLabyrinth() {
		return labyrinth;
	}

	public void setLabyrinth(Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
	}

}