package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Videojuego;
import utils.BaseDatos;

public class VerInventarioController {
    public TableView tblVideojuegos;
    public TableColumn tcId;
    public TableColumn tcNombre;

    public VerInventarioController(){

    }

    public void initialize() {
        tcId.setCellValueFactory(new PropertyValueFactory<Videojuego, Integer>("id"));
        tcNombre.setCellValueFactory(new PropertyValueFactory<Videojuego, String>("nombre"));
        ObservableList<Videojuego> data =
                FXCollections.observableArrayList(BaseDatos.videoJuegos);
        tblVideojuegos.setItems(data);
    }






}
