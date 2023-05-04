package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScene implements Initializable {
    @FXML
    Button btn1, btn2, btn3;
    @FXML
    private ImageView imgv;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image img = new Image(getClass().getResourceAsStream(HelloApplication.imgName));
        imgv.setImage(img);
    }
}
