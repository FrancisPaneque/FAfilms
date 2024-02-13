package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UsuarioController {

    @FXML
    private Button busca;

    @FXML
    private TextField buscador;

	private Stage stage;

    @FXML
    private static ImageView imagen;

    @FXML
    void buscar(ActionEvent event) {
    	setRadius();
    }
    

    @FXML
    void initialize() {
        assert busca != null : "fx:id=\"busca\" was not injected: check your FXML file 'PantallaUsuario.fxml'.";
        assert buscador != null : "fx:id=\"buscador\" was not injected: check your FXML file 'PantallaUsuario.fxml'.";
        assert imagen != null : "fx:id=\"imagen\" was not injected: check your FXML file 'PantallaUsuario.fxml'.";

    }
    
    public static void setRadius() {
    	 imagen.setEffect(new DropShadow(20, Color.BLACK));
    }
    
    public void setStage(Stage stage) {
		this.stage = stage;
	}

}
