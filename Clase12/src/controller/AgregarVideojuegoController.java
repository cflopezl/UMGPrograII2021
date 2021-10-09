package controller;

import DAO.VideoJuegoDAO;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Videojuego;
import utils.BaseDatos;

public class AgregarVideojuegoController {

    public TextField txtId;
    public TextField txtNombre;

    public void grabarVideoJuego(ActionEvent actionEvent) {
        //1. obtener datos del GUI
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        //2. instancia del modelo de datos
        Videojuego game = new Videojuego(Integer.parseInt(id), nombre);
        //3. guardarlo
        VideoJuegoDAO videoJuegoDAO = new VideoJuegoDAO();
        videoJuegoDAO.save(game);
        //4. limpiar los campos
        txtId.setText("");
        txtNombre.setText("");
    }
}
