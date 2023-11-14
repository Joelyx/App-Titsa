package com.example.tresvistas.controller;

import com.example.tresvistas.model.Linea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController implements Initializable {


    public ListView lstLineas;
    public Button btnHome;
    public Button btnQr;
    public Button btnCuenta;
    public ImageView titsaPng;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Linea> lineas = new ArrayList<Linea>();
        titsaPng.setVisible(true);
        titsaPng.autosize();
        lineas.add(new Linea(10,"Santa Cruz", "Aereopuerto Sur"));
        lineas.add(new Linea(11,"La Laguna", "El Sauzal"));
        lineas.add(new Linea(12,"La Laguna", "Ofra"));
        lineas.add(new Linea(13,"Santa Cruz", "La Laguna"));
        lineas.add(new Linea(14,"Los silos", "La Orotava"));
        lineas.add(new Linea(15,"Santa Cruz", "Los Cristianos"));
        lineas.add(new Linea(16,"Icod", "Ofra"));
        lstLineas.getItems().addAll(lineas);

    }


    public void irHome(ActionEvent actionEvent) {
    }

    public void abrirQr(ActionEvent actionEvent) {
    }

    public void irCuenta(ActionEvent actionEvent) {
    }


}
