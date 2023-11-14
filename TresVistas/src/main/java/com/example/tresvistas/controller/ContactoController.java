package com.example.tresvistas.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class ContactoController {
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextArea txtComentario;

    @FXML
    private Text txtMensaje;

    @FXML
    private void onEnviar() {
        txtNombre.clear();
        txtApellidos.clear();
        txtCorreo.clear();
        txtComentario.clear();
        txtMensaje.setText("Datos enviados correctamente");
    }
}















