/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author User
 */
public class AppliationManager {
    public static void main(String[] args) {
        GUIManager gui = new GUIManager(args);
        
        gui.LoadScene(new Welcome().scene);
    }
}
