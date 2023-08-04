/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import sun.plugin2.message.MouseEventMessage;

/**
 *
 * @author zead shalaby
 */
public class UserHomeController {

 private Stage primaryStage;
     private Scene scane;
     private Parent root;
@FXML
 Label Menu;
@FXML
 Label MenuClose;
@FXML
 AnchorPane slider;
@FXML
Button exit ;
@FXML
Button view;
@FXML
Button exit1 ; 
@FXML
TextField dele_acc;
 
        public void mouse1(){
        int count =0;
        if(count==0){
        slider.setVisible(true);
     
        }
  
   slider.setOpacity(1.1);
      
    }
public void mouse(){
        int count =1;
        if(count==1){
        slider.setVisible(false);
         }
    }
public void delete_acc( ){}



public void contact(ActionEvent e) throws IOException{
root = FXMLLoader.load(getClass().getResource("/final_project/ContactFram_1.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);

}
public void search(ActionEvent e) throws IOException{
  root = FXMLLoader.load(getClass().getResource("/final_project/SearchController.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);

}
public void dele(ActionEvent e) throws IOException{

}
public void view(ActionEvent e) throws IOException{
     root = FXMLLoader.load(getClass().getResource("/final_project/viewFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);
//view.setStyle("-fx-background-color:black;");
}
public void logout(ActionEvent e) throws IOException{
root = FXMLLoader.load(getClass().getResource("/final_project/LoginFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);
        
}
 public void Enter(Event e) {
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);

    }

    public void Exit(Event e) {
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);

    }
}





    
    
    
    

