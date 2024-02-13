package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label lblNewCuenta;

    @FXML
    private ImageView logoPagina;

	private Stage stage;
    
    public void setStage(Stage stage) {
		this.stage = stage;
	}

}
