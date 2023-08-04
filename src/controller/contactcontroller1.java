/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author saids
 */
public class contactcontroller1 implements Initializable {
    
     private Stage primaryStage;
     private Scene scane;
     private Parent root;
   @FXML
   TextField email;
   @FXML
   TextField phone;
   @FXML
   TextArea comp;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    public void phone(KeyEvent e){
         if (phone.getText().matches("01?[0-9]{0,9}")) {
        } else {
            phone.setText("");
        }
    }
          public void back(ActionEvent e) throws IOException{
  root = FXMLLoader.load(getClass().getResource("/final_project/UserHomeFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);

}
              public void submit(ActionEvent e) {

}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
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
