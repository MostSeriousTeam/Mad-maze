package Model;

import java.util.concurrent.ThreadLocalRandom;

import Graph.Graph;
import Graph.Vertex;

public class Labyrinth {

	private final static int NORTH = 0;
	private final static int EAST = 1;
	private final static int SOUTH = 2;
	private final static int WEST = 3;

	private final static int NORTH_BORDER = 0;
	private final static int EAST_BORDER = 13;
	private final static int SOUTH_BORDER = 13;
	private final static int WEST_BORDER = 0;
	
	private static Labyrinth instance = null;

	private Graph graph;

	// Labyrithn doit implementer en tant que singleton
	public static Labyrinth getInstance () {
		if (instance==null)
			instance=new Labyrinth();
		return (instance);
	}
	
	private Labyrinth() {
		
		// TODO Auto-generated constructor stub
		graph = new Graph();

		Vertex firstVertex = new Vertex(0, 0);
		graph.addVertex(firstVertex);
		buildLabyrinth(firstVertex);
	}

	
	private void buildLabyrinth(Vertex firstVertex) {
		// TODO Auto-generated method stub
		int x = firstVertex.getX();
		int y = firstVertex.getY();

		int[] tab_ind = new int[4];

		tab_ind[0] = ThreadLocalRandom.current().nextInt(0, 4);

		do {
			tab_ind[1] = ThreadLocalRandom.current().nextInt(0, 4);			
		} while (tab_ind[1] == tab_ind[0]);

		do {
			tab_ind[2] = ThreadLocalRandom.current().nextInt(0, 4);			
		} while (tab_ind[2] == tab_ind[0] || tab_ind[2] == tab_ind[1]);

		do {

			tab_ind[3] = ThreadLocalRandom.current().nextInt(0, 4);			
		} while (tab_ind[3] == tab_ind[0] || tab_ind[3] == tab_ind[1] || tab_ind[3] == tab_ind[2]);


		for (int i=0; i<4; i++) {
			Vertex nextVertex = null;

			switch (tab_ind[i]) {
			case NORTH:
				if (!(graph.containsVertex(new Vertex(x, y-1))) && y > NORTH_BORDER)
					nextVertex = new Vertex(x, y-1);
				break;

			case EAST:
				if (!(graph.containsVertex(new Vertex(x+1, y))) && x < EAST_BORDER)
					nextVertex = new Vertex(x+1, y);
				break;

			case SOUTH:
				if (!(graph.containsVertex(new Vertex(x, y+1))) && y < SOUTH_BORDER)
					nextVertex = new Vertex(x, y+1);
				break;


			case WEST:
				if (!(graph.containsVertex(new Vertex(x-1, y))) && x > WEST_BORDER)
					nextVertex = new Vertex(x-1, y);
				break;

			default:
				System.out.println("Error in model.Labyrinth.buildLabyrinth in switch.");
				break;
			}

			if (nextVertex != null) {
				graph.addVertex(nextVertex);
				graph.addEdge(firstVertex, nextVertex);						
				buildLabyrinth(nextVertex);
			}
		}

	}
	public String toSring() {
		return graph.toString();
	}

	public Graph getGraph() {
		return graph;
	}




}

