/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 *
 * @author User
 */
public class AccountValidation {
    
    Scene scene;
    private long AccountNo;
    Button next;
    public long getAccountNo() {
        return AccountNo;
    }
    public AccountValidation() {
        
        
        scene = load();
    }
    
    
    
    
    
    public Scene load() {
        Label accountidlabel = new Label("Account ID");
        
        next = new Button("Next->");
        next.setOnAction(e -> {
            
        });
        
        TextField accountno = new TextField();
        AccountNo = Long.parseLong( accountno.getText());
        GridPane gridPane = new GridPane();
        gridPane.getChildren().addAll(accountidlabel,accountno,next);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        
        
        GridPane.setConstraints(accountidlabel,0,0);
        GridPane.setConstraints(accountno,1,0);
        GridPane.setConstraints(next,0,2);
        
        Scene scene = new Scene(gridPane,800,600);
         String welcomestyle = "-fx-background-color: rgba(37,145,145,1.0);"; 
        
         
         gridPane.setStyle(welcomestyle);
        return scene;
    }
}
