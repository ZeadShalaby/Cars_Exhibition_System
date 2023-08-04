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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Salma
 */
public class ForgetController implements Initializable {
      private Stage primaryStage;
     private Scene scane;
     private Parent root;
    @FXML   
    TextField id_owner;   
    @FXML   
     TextField pass; 
    @FXML   
     TextField email; 

    public void fun_id(){if(id_owner.getText().matches("[1-9]{1}[0-9]{0,3}")){/*String s=id.gettext();data*/}else{id_owner.setText("");}}


    public void clear(){id_owner.setText("");pass.setText("");email.setText("");}

    public void fun_pass(){if(pass.getText().matches("[A-Za-z]*[1-9]*")){/*String s=id.gettext();data*/}else{pass.setText("");}}

    public void fun_email(){}

    public void edit(ActionEvent event) throws IOException{
    if(id_owner.getText().length()<5){id_owner.setText("Write correct Id_Owner 'only number'");}
        else if(email.getText().length()<5){email.setText("Write correct Email Address");}
        else if(pass.getText().length()<3){pass.setText("Write correct Password");}
        
        else{
              root = FXMLLoader.load(getClass().getResource("/final_project/LoginFram.fxml"));
        
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        
        
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
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
