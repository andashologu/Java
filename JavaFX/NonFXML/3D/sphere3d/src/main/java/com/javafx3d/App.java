package com.javafx3d;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.CullFace; 
import javafx.stage.Stage; 
import javafx.scene.shape.Sphere; 
         
public class App extends Application { 
   @Override 
   public void start(Stage stage) { 
     
      Sphere sphere = new Sphere(); 
      sphere.setRadius(50.0);   
      sphere.setTranslateX(300); 
      sphere.setTranslateY(150); 
      sphere.setCullFace(CullFace.BACK);          
       
      Group root = new Group(sphere); 

      Scene scene = new Scene(root, 600, 300); 
      stage.setTitle("Drawing a Sphere"); 
      stage.setScene(scene); 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}