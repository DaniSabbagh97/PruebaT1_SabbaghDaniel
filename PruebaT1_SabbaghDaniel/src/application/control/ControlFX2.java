package application.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * 
 * @author Daniel Sabbagh
 * @version Oxygen.2 Release (4.7.2)
 * 
 * Esta aplicacion iniciara una ventana donde dandole a get Me accederemos a un login donde podremos poner nuestros datos
 * En el proyecto existe una compenetracion de colores verdes y rojos
 *
 */
public class ControlFX2 {
	@FXML
	public Button closeButton;
	@FXML
	private void closeStage() {
		Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
}
