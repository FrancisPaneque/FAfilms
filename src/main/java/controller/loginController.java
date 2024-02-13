package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import models.Usuarios;
import Utils.GestorUsuarioSQL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView logoPagina;
    
    private Stage stage;

    @FXML
    private Label lblNewCuenta;

    @FXML
    private static TextField txtEmail;

    @FXML
    private static TextField txtPassword;

    @FXML
    private static TextField txtUser;
    
    /**
     * Este metodo comprueba si los datos son correctos
     * @param event
     * @throws IOException
     */
    @FXML
    void loging(ActionEvent event) throws IOException {
    	if (txtUser == null) {
    		
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
      	    alert.setTitle("Error");
      	    alert.setHeaderText("Error: ");
      	    alert.setContentText("Password o user incorrecto");
      	    alert.showAndWait();
    		
    	} else if (compruebaUsuario() || compruebaPassword()) {
    		showNext();
    	} else {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
      	    alert.setTitle("Error");
      	    alert.setHeaderText("Error: ");
      	    alert.setContentText("Password o user incorrecto");
      	    alert.showAndWait();
    	}
    	
    }

	/**
	 * Este metodo abre la pagina de register
	 * @throws IOException
	 */
	@FXML
    void showRegister(MouseEvent event) throws IOException {
    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/PantallaRegister.fxml"));
    	 Pane vent = (Pane) loader.load();
    	 Scene scene = new Scene(vent);
    	 Stage stage = new Stage();
    	 registerController controller = loader.getController();
    	 controller.setStage(stage);
    	 stage.setTitle("CjFilms");
	     stage.setScene(scene);
	     stage.show();
	     this.stage.close();
    }

	@FXML
    void initialize() {
        assert lblNewCuenta != null : "fx:id=\"lblNewCuenta\" was not injected: check your FXML file 'PantallaLoging.fxml'.";
        assert logoPagina != null : "fx:id=\"logoPagina\" was not injected: check your FXML file 'PantallaLoging.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'PantallaLoging.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'PantallaLoging.fxml'.";
        assert txtUser != null : "fx:id=\"txtUser\" was not injected: check your FXML file 'PantallaLoging.fxml'.";

    }
	
	// Establece el stage
	public void setStage(Stage Stage) {
		this.stage = Stage;
	}
	
	/**
	 * Este metodo abre otra pagina
	 * @throws IOException
	 */
	private void showNext() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/PantallaEnCreacion.fxml"));
   	 	Pane vent = (Pane) loader.load();
   	 	Scene scene = new Scene(vent);
   	 	Stage stage = new Stage();
   	 	Controller controller = loader.getController();
   	 	controller.setStage(stage);
   	 	stage.setTitle("CjFilms");
	    stage.setScene(scene);
	    stage.show();
	    this.stage.close();
	}
	
	@FXML
    void pruebasalida(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/PantallaUsuario.fxml"));
   	 	Pane vent = (Pane) loader.load();
   	 	Scene scene = new Scene(vent);
   	 	Stage stage = new Stage();
   	 	UsuarioController controller = loader.getController();
   	 	controller.setStage(stage);
   	 	stage.setTitle("CjFilms");
	    stage.setScene(scene);
	    stage.show();
	    this.stage.close();
    }
	
	/**
	 * Este metodo comprueba que el usuario exista en la base de datos
	 * @return true si existe, false si no existe;
	 */
	public static boolean compruebaUsuario() {
		String usuario = txtUser.getText();
		String password = txtPassword.getText();
		Usuarios user = GestorUsuarioSQL.searchUsuario(usuario);
		if (usuario.compareTo(user.getUsuario()) == 0) {
			if (password.compareTo(user.getPassword()) == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static boolean compruebaPassword() {
		if (txtPassword.getText().compareTo(GestorUsuarioSQL.searchUsuario(txtUser.getText()).getPassword()) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
