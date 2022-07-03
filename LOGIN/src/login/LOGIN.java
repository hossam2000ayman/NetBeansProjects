/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class LOGIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginform LF = new loginform();
        LF.setVisible(true);
        LF.setLocation(100, 100);
        LF.setResizable(false);
        LF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    
}
