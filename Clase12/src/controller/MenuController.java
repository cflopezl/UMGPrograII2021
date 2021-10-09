package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuController {

    public Button btnSalir;

    public void menuAgregarVideojuego(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AgregarVideojuego.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Agregar video Juego");
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }


    public void menuVerInventario(ActionEvent actionEvent)  throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/VerInventario.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Invenario de Videojuegos");
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }

    public void menuSalir(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
