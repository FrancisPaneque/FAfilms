package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import models.Usuarios;
import application.Main;

public class registerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegister;

    @FXML
    private ImageView logoPagina;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword1;

    @FXML
    private TextField txtPassword2;

    @FXML
    private TextField txtUser;

	private Stage stage;
	
	/**
	 * Este metodo comprueba que las contraseñas sean iguales, crea el objeto usuario lo guarda y muestra el loging
	 * @param event
	 * @throws IOException
	 */
    @FXML
    void userRegister(ActionEvent event) throws IOException {
    	if (Usuarios.compruebaPassword(txtPassword1.getText(), txtPassword2.getText())) {
   		 Usuarios user = new Usuarios ();
   		 showloging();
   	 } else {
   		 Alert alert = new Alert(Alert.AlertType.INFORMATION);
   	     alert.setTitle("Error");
   	     alert.setHeaderText("Error: Creacion de usuario");
   	     alert.setContentText("Las contraseñas deben ser iguales");
   	     alert.showAndWait();
   	 }
    }

    @FXML
    void initialize() {
        assert btnRegister != null : "fx:id=\"btnRegister\" was not injected: check your FXML file 'PantallaRegister.fxml'.";
        assert logoPagina != null : "fx:id=\"logoPagina\" was not injected: check your FXML file 'PantallaRegister.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'PantallaRegister.fxml'.";
        assert txtPassword1 != null : "fx:id=\"txtPassword1\" was not injected: check your FXML file 'PantallaRegister.fxml'.";
        assert txtPassword2 != null : "fx:id=\"txtPassword2\" was not injected: check your FXML file 'PantallaRegister.fxml'.";
        assert txtUser != null : "fx:id=\"txtUser\" was not injected: check your FXML file 'PantallaRegister.fxml'.";

    }
    
    // Este metodo muestra el loging
    private void showloging() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/PantallaLoging.fxml"));
   	 	Pane vent = (Pane) loader.load();
   	 	Scene scene = new Scene(vent);
   	 	Stage stage = new Stage();
   	 	loginController controller = loader.getController();
   	 	controller.setStage(stage);
   	 	stage.setTitle("CjFilms");
	    stage.setScene(scene);
	    stage.show();
	    this.stage.close();
    	
    }

	public void setStage(Stage stage) {
		this.stage = stage;
	}

}