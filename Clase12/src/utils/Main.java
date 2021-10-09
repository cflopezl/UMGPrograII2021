package utils;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = (Pane) FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
        primaryStage.setTitle("Videojuegos ya!");
        Scene scene = new Scene(root, 250,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
