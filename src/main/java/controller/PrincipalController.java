package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrincipalController {

    @FXML
    private Button busca;

    @FXML
    private TextField buscador;

	private Stage stage;

    @FXML
    void buscar(ActionEvent event) {

    }
    
 // Establece el stage
 	public void setStage(Stage Stage) {
 		this.stage = Stage;
 	}
}
