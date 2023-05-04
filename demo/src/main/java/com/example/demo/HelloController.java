package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class HelloController extends HelloApplication {
    @FXML
    private Label welcomeText;
    @FXML
    Button btn1, btn2, btn3;

    public void onHelloButtonClick(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource()==btn1){imgName += "1.jpg";}
        if (actionEvent.getSource()==btn2){imgName += "2.jpg";}
        if (actionEvent.getSource()==btn3){imgName += "3.jpg";}

        Stage stage = (Stage) btn1.getScene().getWindow();
        stage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("com/example/demo/mainScene.fxml")));
        stage.setScene(new Scene(root, 600, 400));
    }
}