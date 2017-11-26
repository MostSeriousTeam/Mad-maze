
import javafx.*;
import Controller.Controller;
import Controller.Controller.*;
import Graph.Graph;
import Graph.Vertex;
import View.*;
import Model.*;
/*import java.io.File;
class Main{
public static void createDotGraph(String dotFormat,String fileName)
{
    GraphViz gv=new GraphViz();
    gv.addln(gv.start_graph());
    gv.add(dotFormat);
    gv.addln(gv.end_graph());
   // String type = "gif";
    String type = "pdf";
  // gv.increaseDpi();
    gv.decreaseDpi();
    gv.decreaseDpi();
    File out = new File(fileName+"."+ type); 
    gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
}

    public static void main(String[] args) throws Exception {
        String dotFormat="1->2;1->3;1->4;4->5;4->6;6->7;5->7;3->8;3->6;8->7;2->8;2->5;";
        createDotGraph(dotFormat, "DotGraph");
 }
}
*/
import javafx.application.Application;
import javafx.stage.Stage;

import org.jgrapht.graph.DefaultEdge;
public class Main extends Application {
	public static void main(String[] args){
		int size=4;
		Vertex tab_Ver[][]=new Vertex[size][size];
		Graph g = new Graph();
		for (int i=0; i<size; i++ ) {
			for (int j=0; j<size; j++ ) 
			{
				tab_Ver[i][j] = new Vertex(i,j);	
				g.addVertex(tab_Ver[i][j]);
			}
		}
		//g.addEdge(tab_Ver[0][0],tab_Ver[0][1]);
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