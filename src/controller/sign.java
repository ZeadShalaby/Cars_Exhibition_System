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
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;

/**
 *
 * @author zead shalaby
 */
public class sign {
   private Stage primaryStage;
     private Scene scane;
     private Parent root;
 @FXML
TextField error;    
@FXML
TextField id;
@FXML
TextField fname;
@FXML
TextField lname;
@FXML
TextField email;  
@FXML
TextField phone;
@FXML
PasswordField pass;
@FXML
Button submit;
@FXML
RadioButton honor;
@FXML
RadioButton user;
@FXML
RadioButton male;
@FXML
RadioButton female;
@FXML
CheckBox Age;






public void submit(ActionEvent e) throws IOException{if(id.getText().length()<5){error.setText("Write corect Id 'only number'");} 

else if(fname.getText().length()<3){error.setText("ITS Small Name");}
else if(lname.getText().length()<3){error.setText("ITS Small Name");}
else if(pass.getText().length()<5){error.setText("Write a wrong password");}
else if(phone.getText().length()<11){error.setText("Write corect phone number");}
else if((!honor.isSelected()||!user.isSelected())&&(!male.isSelected()||!female.isSelected())&&!Age.isSelected()){
error.setText("Complet Choise");

 
}

else{
     root = FXMLLoader.load(getClass().getResource("/final_project/LoginFram.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
}
}  


public void clear(){id.setText("");fname.setText("");lname.setText("");email.setText("");phone.setText("");pass.setText("");}  
public void key(KeyEvent event){if(id.getText().matches("[0-9]{1,4}")){/*String s=id.gettext();data*/}else{id.setText("");}}
public void keyf(KeyEvent event){if(!fname.getText().matches("[A-Z]{1,}[A-Za-z]{0,10}")) {fname.setText("");
    } else {
/*String f =fname.gettext(); data*/
    }}
public void keyl(KeyEvent event){if(!lname.getText().matches("[A-Z]{1,}[A-Za-z]{0,10}")) {lname.setText("");
    } else {
/*String f =lname.gettext(); data*/
    }}
public void keye(KeyEvent event){if((fname.getText().length()>=4)&&(lname.getText().length()>=4)){email.setText(fname.getText() +" "+lname.getText()+"@fci.com");};
}
    
/*String f =fname.gettext(); data*/
    
public void keypho(KeyEvent event){if(phone.getText().matches("01?[0-9]{0,9}")){/*String s=id.gettext();data*/}else{phone.setText("");}}
public void keyp(KeyEvent event){if(pass.getText().matches("[A-Za-z]*[0-9]*")){/*String s=id.gettext();data*/}else{pass.setText("");}}


public void male(){String s = male.getText();System.out.println(s);}  
public void female(){String S =female.getText(); System.out.println(S);}  
public void honor(){String S= honor.getText();System.out.println(S);}
public void user(){String s = user.getText();System.out.println(s);}
public void Age(){if(Age.isSelected()){System.out.println("Acept");}else{JOptionPane.showMessageDialog(null,"choise Age: are you or not Age = 18");}}    
     

   public void Enter(Event e) {
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);

    }

    public void Exit(Event e) {
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);

    }
   }

