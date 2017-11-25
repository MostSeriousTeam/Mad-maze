package org.pacman.view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Viewframe {
	
	static final int SPAN = 4; //pixels for a unit
	static final int WALL = 2; //thickness of the walls (in units)
	static final int CELL = 9; //size of the cells (in units)
	public static final Paint WALLCOLOR = Color.BLUE;
	public static final Paint SCENECOLOR = Color.BLACK;
	public static ImageView imageView;
	
	//Create the basic game frame with exterior wall and anchor for interior wall
	//@return the scene it uses to create the frame
	public static Scene drawFrame(Stage stage, Group root,int nbrX, int nbrY) {
		//create scene
		Scene scene = new Scene(root,
				((WALL + CELL) * nbrX + WALL) * SPAN,
				((WALL + CELL) * nbrY + WALL) * SPAN);
		scene.setFill(SCENECOLOR);
		
		Rectangle square;
		stage.setScene(scene);
		
		//Top arena wall
		square = new Rectangle(0, 0,
				SPAN * (nbrX * (CELL+WALL) + WALL), WALL * SPAN);
		square.setFill(WALLCOLOR);
		root.getChildren().add(square);
		
		//Bottom arena wall
		square = new Rectangle(0,SPAN * (nbrY * (CELL+WALL)),
				SPAN * (nbrX * (CELL+WALL) + WALL), WALL * SPAN);
		square.setFill(WALLCOLOR);
		root.getChildren().add(square);
		
		//Right arena wall
		square = new Rectangle(SPAN * (nbrX * (CELL+WALL)), 0,
				WALL * SPAN,SPAN * (nbrY * (CELL + WALL) + WALL));
		square.setFill(WALLCOLOR);
		root.getChildren().add(square);
		
		//Left arena wall
		square = new Rectangle(0, 0,
				WALL * SPAN,SPAN * (nbrY * (CELL + WALL) + WALL));
		square.setFill(WALLCOLOR);
		root.getChildren().add(square);
		
		//Anchor for labyrinth wall
		for (int x=0; x < nbrX-1;++x) {
			int offsetX = ((WALL+CELL) + (WALL+CELL) * x) * SPAN;
			for (int y=0; y < nbrY-1;++y) {
				int offsetY = ((WALL+CELL) + (WALL+CELL) * y) * SPAN;
				square = new Rectangle(offsetX,offsetY,WALL*SPAN,WALL*SPAN);
				square.setFill(WALLCOLOR);
				root.getChildren().add(square);
			}
		}
		
		return scene;
	}
	
	public static void drawCharacter(Stage stage, Group root) {
		Image image = new Image(Viewframe.class.getResource("ressource/cat.png").toExternalForm());
		imageView = new ImageView(image);
		root.getChildren().add(imageView);
		imageView.setPreserveRatio(true);
		imageView.setFitHeight(CELL * SPAN * 2);
		imageView.setX(10);
		imageView.setY(10);
	}
	
	public static void mooveCharacter(double x,double y) {
		imageView.setX(x);
		imageView.setY(y);
	}

}
