

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
		
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//try{
			Controller controller = Controller.getInstance();
			//controller.start(primaryStage);

		//}catch(Exception e) {
			//e.printStackTrace();
		//}
	}
}