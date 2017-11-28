

import javafx.*;
import Controller.Controller;
import Controller.Controller.*;
import Graph.Graph;
import Graph.Vertex;
import View.*;
import Model.*;

import javafx.application.Application;
import javafx.stage.Stage;

import org.jgrapht.graph.DefaultEdge;
public class Main extends Application {
	public static void main(String[] args){
		int size=4;
		Vertex tab_Ver[][]=new Vertex[size][size];
		Labyrinth g = new Labyrinth();
		for (int i=0; i<size; i++ ) {
			for (int j=0; j<size; j++ ) 
			{
				tab_Ver[i][j] = new Vertex(i,j);	
				g.addVertex(tab_Ver[i][j]);
			}
		}
	
		System.out.println(g.toDot());
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//try{
			Controller controller = Controller.getInstance();
			controller.start(primaryStage);

		//}catch(Exception e) {
			//e.printStackTrace();
		//}
	}
}