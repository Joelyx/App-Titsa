package com.example.tresvistas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    public void manejarIniciarSesion(){

    }

    @FXML
    public void manejarRegistro(ActionEvent event){
        try {
            // Carga el archivo FXML para la vista de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tresvistas/Register.fxml"));
            Parent root = loader.load();

            // Obtiene el escenario (Stage) actual a través del evento
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Crea una nueva escena con esta vista
            Scene scene = new Scene(root);

            // Establece la nueva escena en el escenario actual
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            // Maneja la excepción aquí
        }
    }
}
