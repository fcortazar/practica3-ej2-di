package com.di.practica32;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class controlButton extends initButton {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Boton");

        CustomButton customButton = new CustomButton("Púlsame");
        StackPane root = new StackPane();
        root.getChildren().add(customButton);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    // Clase CustomButton que extiende de Button
    public class CustomButton extends Button {

        public CustomButton(String text) {
            super(text);

            // Añadir manejo de eventos para cambiar el texto al colocar el ratón encima
            setOnMouseEntered(event -> setText("Púlsame!!"));
            setOnMouseExited(event -> setText("Púlsame"));
        }
    }
}