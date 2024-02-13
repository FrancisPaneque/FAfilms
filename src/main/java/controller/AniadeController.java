package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AniadeController {

    @FXML
    private ScrollPane TxtAActores;

    @FXML
    private ScrollPane TxtAActores1;

    @FXML
    private TextArea TxtADirectores;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField buscador;

    @FXML
    private Button buscar;

    @FXML
    private TextArea txtAArea;

    @FXML
    private TextArea txtADescripcion;

    @FXML
    private TextArea txtAGeneros;

    @FXML
    private TextArea txtAPlataforma;

    @FXML
    private TextField txtAnio;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtTitulo1;

	private Stage stage;

    @FXML
    void Buscar(ActionEvent event) {

    }

    @FXML
    void filmAdd(ActionEvent event) {

    }
    
	// Establece el stage
	public void setStage(Stage Stage) {
		this.stage = Stage;
	}

}
