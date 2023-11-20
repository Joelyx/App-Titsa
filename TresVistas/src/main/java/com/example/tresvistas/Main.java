package com.example.tresvistas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/tresvistas/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Titsa");
        stage.setScene(scene);
        stage.show();


    }

    //funcion que cuente hasta 10
    public static void contar(){
        for (int i = 0; i <10; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}