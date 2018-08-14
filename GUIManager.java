/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class GUIManager extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    public GUIManager(String args[]) {
        
        launch(args);
    }
    @Override
 public void start(Stage Initial) throws Exception {
     window = Initial;
     
 }
    
    
    
    public void LoadScene(Scene s) {
        window.setScene(s);
        window.show();
        
    }
}
