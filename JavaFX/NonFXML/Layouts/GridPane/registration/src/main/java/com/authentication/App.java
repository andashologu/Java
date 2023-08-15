package com.authentication;

import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.layout.GridPane; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  
         
public class App extends Application { 
   @Override 
   public void start(Stage stage) {     

      Label emailLbl = new Label("Email");       
      Label pwdLbl = new Label("Password");     
      TextField emailFld = new TextField();      
      PasswordField pwdFld = new PasswordField();
      Button lgnBtn = new Button("Login"); 
      
      GridPane gridPane = new GridPane();    
      gridPane.setMinSize(400, 200); 
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);        
      gridPane.setAlignment(Pos.CENTER); 
       
      gridPane.add(emailLbl, 0, 0); 
      gridPane.add(emailFld, 1, 0); 
      gridPane.add(pwdLbl, 0, 1);       
      gridPane.add(pwdFld, 1, 1); 
      gridPane.add(lgnBtn, 0, 2); 
       
      lgnBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      emailLbl.setStyle("-fx-font: normal bold 20px 'serif' "); 
      pwdLbl.setStyle("-fx-font: normal bold 20px 'serif' ");  
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
       
      Scene scene = new Scene(gridPane); 
      stage.setTitle("Authentication"); 
      stage.setScene(scene);
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}