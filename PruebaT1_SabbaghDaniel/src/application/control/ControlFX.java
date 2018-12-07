package application.control;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 * 
 * @author Daniel Sabbagh
 * @version Oxygen.2 Release (4.7.2)
 * 
 * Esta aplicacion iniciara una ventana donde dandole a get Me accederemos a un login donde podremos poner nuestros datos
 * En el proyecto existe una compenetracion de colores verdes y rojos
 *
 */
public class ControlFX {
	@FXML
	ImageView logoLabel;
	@FXML
	public Button openButton;

	public void initialize() {
		openButton.setTooltip(new Tooltip("Tooltips"));
		FadeTransition fadeTransition = new FadeTransition(
			Duration.seconds(2), logoLabel);
			logoLabel.setVisible(true);
			fadeTransition.setFromValue(0);
			fadeTransition.setToValue(1);
			fadeTransition.play();
					
	}
	
	private Stage stage;
	@FXML
	private void sendStage() {
		try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("GetMe.fxml"));
	        AnchorPane mypane = (AnchorPane) loader.load();
	        Scene scene= new Scene(mypane);
	        stage = new Stage();
	        
	        stage.setScene(scene);
	        stage.show();
	        stage.setTitle("Daniel Sabbagh");
	          
	    } catch (IOException e) {
	        
	    }
	}
	
	
}
