package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
/**
 * 
 * @author Daniel Sabbagh
 * @version Oxygen.2 Release (4.7.2)
 * 
 * Esta aplicacion iniciara una ventana donde dandole a get Me accederemos a un login donde podremos poner nuestros datos
 * En el proyecto existe una compenetracion de colores verdes y rojos
 *
 */


public class MainFX extends Application {
private AnchorPane mypane;


	
	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
	
		mypane = (AnchorPane) loader.load();
		
		stage.setTitle("Daniel Sabbagh");
		stage.setScene(new Scene(mypane));
		
		stage.show();
		
		Font.loadFont(getClass().getResourceAsStream("assets/PoiretOne-Regular.ttf"), 20);
		
		
		
	}

	
	public static void main(String[] args) {
		launch(args);
		
	}
}
