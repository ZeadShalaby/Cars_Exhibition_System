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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Salma
 */
public class DeleteController1 implements Initializable {
    
         public static String img;
 private Stage primaryStage;
     private Scene scane;
     private Parent root;
    
     @FXML
    TextField id_owner;
    
    @FXML
    TextField id_post;
    
    @FXML
    TextField name;
    
    @FXML
    TextField country;
    
    
    
   @FXML
    public void fun_name (KeyEvent event){if(!name.getText().matches("[A-Z]{1,}[A-Za-z]{0,10}")) {name.setText("");
    } else {
/*String f =fname.gettext(); data*/
    }}
    @FXML
    public void fun_country (KeyEvent event){if(!country.getText().matches("[A-Za-z]{0,12}")) {country.setText("");
    } else {
/*String f =fname.gettext(); data*/
    }}
    
    @FXML
    public void fun_idowner(KeyEvent event){if(id_owner.getText().matches("[1-9]{1}[0-9]{0,3}")){/*String s=id.gettext();data*/}else{id_owner.setText("");}}
    
    @FXML
    public void fun_idpost(KeyEvent event){if(id_post.getText().matches("[1-9]{1}[0-9]{0,3}")){/*String s=id.gettext();data*/}else{id_post.setText("");}}
    
    
    @FXML
    public void clear(){name.setText("");country.setText("");id_owner.setText("");id_post.setText("");}  

    @FXML
    public void delete(ActionEvent e){ 

        if(id_owner.getText().length()<5){id_owner.setText("Write corect Id_Owner 'only number'");}
        else if(id_post.getText().length()<5){id_post.setText("Write corect Id_Post 'only number'");}
        else if(name.getText().length()<3){name.setText("ITS Small Name");}
        else if(country.getText().length()<5){country.setText("ITS Small country");}

 else{JOptionPane.showMessageDialog(null,name.getText()+" "+country.getText()+" "+id_owner.getText()+" "+id_post.getText()); }}  

//{ if((!id.getText().length()>=5){id.setText("wriete correct id");}//(fname.getText().length()>=5)&&(lname.getText().length()>=5)&&(email.getText().length()>=5)&&(phone.getText().length()>=5)&&(pass.getText().length()>=5))
//else{JOptionPane.showMessageDialog(null,id.getText()+" "+fname.getText()+" "+lname.getText()+" "+email.getText()+" "+phone.getText()+" "+pass.getText()); }  } 

          public void back(ActionEvent e) throws IOException{
  root = FXMLLoader.load(getClass().getResource("/final_project/AdminFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);

}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
