/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author User
 */
public class Welcome {
       Scene scene;
       public Welcome() {
           scene = load();
       } 
    
    public  Scene load() {
        Label welcome = new Label("Welcome");
        Label logo = new Label("Easy Money Transaction");
        
        BorderPane layout = new BorderPane();
        
        
        VBox topleft = new VBox();
        topleft.getChildren().add(logo);
       
        VBox middle = new VBox();
        middle.getChildren().add(welcome);
        
        
        layout.setLeft(topleft);
        layout.setCenter(middle);
        
        
        String welcomestyle = "-fx-background-color: rgba(37,145,145,1.0);"; 
        layout.setStyle(welcomestyle);
        
        
        Scene scene1 = new Scene(layout,800,600);
       
        return scene1;
    } 
    

    
}
