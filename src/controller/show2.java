/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author ascom
 */
public class show2 {
     private Stage primaryStage;
     private Scene scane;
     private Parent root;
    @FXML
    Label carName;
    
    @FXML
    Label carPrice;
    
    @FXML
    Label carModel;
        
    @FXML
    Label carColor;
    
    
     @FXML
 
    
        public void back(ActionEvent e) throws IOException{

  root = FXMLLoader.load(getClass().getResource("/final_project/viewFram_1.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();

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
