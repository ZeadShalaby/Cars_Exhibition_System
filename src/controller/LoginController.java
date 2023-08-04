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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
     private Stage primaryStage;
     private Scene scane;
     private Parent root;
    @FXML
    TextField id;
    @FXML
    TextField email;
    @FXML
    TextField pass;
    
    @FXML
    RadioButton admin;
    @FXML
    RadioButton owner;
    @FXML
    RadioButton customer;
    
 public void submit(ActionEvent e) throws IOException {
    
    int ID=Integer.parseInt(id.getText());
    
     if(admin.isSelected()&&(ID>=70001)&&(email.getText().length()>=10)&&(pass.getText().length()>=6)){
          root = FXMLLoader.load(getClass().getResource("/final_project/AdminFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);
        
        
        
        
     }
      if(owner.isSelected()&&(ID>=40001)&&(email.getText().length()>=10)&&(pass.getText().length()>=6)){
            root = FXMLLoader.load(getClass().getResource("/final_project/OwnerHomeFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false); 
        
      
      }
       if(customer.isSelected()&&(ID>=10000)&&(email.getText().length()>=10)&&(pass.getText().length()>=6)){
             root = FXMLLoader.load(getClass().getResource("/final_project/UserHomeFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false); 
       
       
       }
     
     
     
 }
    public void Enter(Event e) {
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);

    }

    public void Exit(Event e) {
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);

    }

    public void key(KeyEvent event) {
       if(!id.getText().matches("[0-9]{1,4}")){
         id.setText("");
       }
    }

    public void keyp(KeyEvent event) {
       if(!pass.getText().matches("[0-9]*")){
           pass.setText("");
       }
    }
    
    public void email(KeyEvent event){
        if(!email.getText().matches("[A-Z]{0,1}[A-Za-z]{0,7}@fci.com")){
            
        }
    }

    public void clear() {
        id.setText("");
        email.setText("");
        pass.setText("");
    }
    
    public void forget(ActionEvent e) throws IOException{
        
         root = FXMLLoader.load(getClass().getResource("/final_project/ForgetFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false); 
    
    }
    
public void sign(ActionEvent e) throws IOException {
     
      root = FXMLLoader.load(getClass().getResource("/final_project/SignupFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false); 
 }
      @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
