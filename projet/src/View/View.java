package View;

import org.pacman.view.View;
import org.pacman.view.Viewframe;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View  {

	private static View instance;
	private Group group;
	private Scene scene;
	private GridPane grid = new GridPane();

	public View() {		
	}
	public static View getInstance() {
		if (instance == null) {
			instance = new View();
		}
		return instance;
	}



	public void start(Stage primaryStage) {
		primaryStage.setTitle("Jeu Labyrinth");
		group = new Group();
		
		scene = Viewframe.drawFrame(primaryStage,group,10,10);
		//Viewframe.drawCharacter(primaryStage, group);
		
		primaryStage.show();
	}
	
	
	/*public void setOnAction(Controller controller) {
		// TODO Auto-generated method stub
		scene.setOnKeyPressed(controller);
	}*/
	
	/*public void setOnAction(Controller controller) {
		scene.setOnKeyPressed(controller);
	}*/
	
}
	