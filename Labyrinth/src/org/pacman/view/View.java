package org.pacman.view;

import org.pacman.controller.Controller;

import javafx.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.*;
import javafx.stage.Stage;
import javafx.stage.Window;

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
			primaryStage.setTitle("Labyrinth");
			group = new Group();
			
			scene = Viewframe.drawFrame(primaryStage,group,10,10);
			Viewframe.drawCharacter(primaryStage, group);
			
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
		
	
		
	

	
	

	
	
    

