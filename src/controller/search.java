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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author zead shalaby
 */
public class search {
    private Stage primaryStage;
     private Scene scane;
     private Parent root;
  @FXML
  TextField search;
  

public void sert(){

if(!search.getText().matches("[1-9]{0,4}")){search.setText("");}else{System.out.println("search");}

}  
 
public void search(){
  if(search.getText().length()<5){search.setText("Write Correct ID");}
    System.out.println("okay call database");

} 
public void back(ActionEvent e) throws IOException{

  root = FXMLLoader.load(getClass().getResource("/final_project/UserHomeFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();

} 
    public void rental(ActionEvent e) throws IOException{

  
        root = FXMLLoader.load(getClass().getResource("/final_project/rental.fxml"));
        
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
