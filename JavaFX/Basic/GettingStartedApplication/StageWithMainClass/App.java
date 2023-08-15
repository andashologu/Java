package com.jenkov.javafx.helloworld;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFxApp extends Application {

    @Override
        public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    

}
