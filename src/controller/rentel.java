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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author ascom
 */
public class rentel {
      private Stage primaryStage;
     private Scene scane;
     private Parent root;
    
    @FXML
    TextField Rname;
    
     @FXML
    TextField Vname;
     
       @FXML
    TextField EndD;
       
       @FXML
    TextField StartD;
       
        @FXML
    TextField Rnumber;
        
       @FXML
    TextField vPrice; 
       
       
      public void rental(ActionEvent e) throws IOException{/* isert in data*/
         
          JOptionPane.showMessageDialog(null,"correcct rental");
      
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
    
     
       public void Enter(Event e) {
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);

    }

    public void Exit(Event e) {
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);

    }
      
}
