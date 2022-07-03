/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturanthouse;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author AinShams
 */
public class ResturantHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        JFrame window = new JFrame();
        window.setTitle("Menu");
        window.setSize(300,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout()); // divide the window into 5 parts
        
        NorthPanel NP = new NorthPanel();
        window.add(NP,BorderLayout.NORTH); // put the north panel in the north part of the window 
        
        WestPanel WP = new WestPanel(); // panel 
        window.add(WP,BorderLayout.WEST);
        
        CenterPanel CP = new CenterPanel();
        window.add(CP,BorderLayout.CENTER);
        
        
        EastPanel EP = new EastPanel();
        window.add(EP,BorderLayout.EAST);
        
        SouthPanel SP = new SouthPanel();
        window.add(SP,BorderLayout.SOUTH);
        
        window.pack();
        window.setVisible(true);
        // TODO code application logic here
    }
    
}
