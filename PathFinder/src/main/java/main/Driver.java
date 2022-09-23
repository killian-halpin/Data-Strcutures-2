package main;

import controller.GalleryAPI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {

    public static GalleryAPI galleryAPI;

    @Override
    public void start(Stage stage) throws IOException {
        galleryAPI = new GalleryAPI();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/gallery.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 610);
        Image icon = new Image(getClass().getResourceAsStream("/Images/MSPaint.png"));
        stage.resizableProperty().set(false);
        stage.getIcons().add(icon);
        stage.setTitle("National Gallery Route Finder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}