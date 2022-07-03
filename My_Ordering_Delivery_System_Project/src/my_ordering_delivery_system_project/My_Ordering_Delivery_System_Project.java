/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ordering_delivery_system_project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class My_Ordering_Delivery_System_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){     
       My_Login_Registeration MLR = new My_Login_Registeration();
       MLR.setVisible(true);
       MLR.setLocation(100,100);
       MLR.setResizable(false);
    }
}
