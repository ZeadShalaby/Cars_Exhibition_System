/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ascom
 */
public class ViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
     public static String img;
 private Stage primaryStage;
     private Scene scane;
     private Parent root;
     
    @FXML
    Label l1;

    Button b1;

    ImageView v1;
    @FXML
    FlowPane FlowPane;

    AnchorPane AnchorPane;
   
    @FXML
    private Button b2;
     
     
    public void show(ActionEvent e) throws SQLException, IOException {
        
       root = FXMLLoader.load(getClass().getResource("/final_project/show_1.fxml"));
        
        primaryStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scane = new Scene(root);
        primaryStage.setScene(scane);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);
        
      //  b1.setStyle("-fx-background-color:black;-fx-stroke:darkviolet;-fx-cursor:hand");
        
        
      
       ////////////////////// Database ///////////////////////////
//      
//        String sql = "SELECT  `SOURCE` FROM `img` ";
//        connection con = new connection();
//        Connection con1 = null;
//        PreparedStatement ps = null;
//        ResultSet rst = null;
//        con1 = con.connect();
//
//        ps = con1.prepareStatement(sql);
//
//        rst = ps.executeQuery();
//      
//        while (rst.next()) {
//            
//            img = rst.getString(1);
//
//           v1=new ImageView(new Image(img));
//b1=new Button("",v1);
//b  
// FlowPane.getChildren().add(b1);
// v1.setFitWidth(200);
// v1.setFitHeight(200);
// 
// b1.setOnAction(event -> {
//     System.out.println("ggggggggggggggggggggg");
//     ///هنا هيحولني لصفحة ال Rental
//     
//});
//
//        }

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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //TODO
        
        
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
