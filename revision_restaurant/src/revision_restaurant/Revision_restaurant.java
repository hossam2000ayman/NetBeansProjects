/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision_restaurant;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class Revision_restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("menu");
        window.setSize(300,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              window.setLayout(new BorderLayout());   //which consist of 5 region  north, south, east, west, center
        
            
              
        north_panel np = new north_panel();
        window.add(np,BorderLayout.NORTH); //THEN I MAKE IT BE ON NORTH LOCATION 
        
        west_panel wp = new west_panel();
        window.add(wp,BorderLayout.WEST); // THEN I MAKE IT BE ON WEST LOCATION 
        
        center_panel cp = new center_panel();
        window.add(cp,BorderLayout.CENTER);
        
        east_panel ep = new east_panel();
        window.add(ep,BorderLayout.EAST);
        
        south_panel sp = new south_panel();
        window.add(sp,BorderLayout.SOUTH);
        
        window.pack();  //el arrange mohem 
        //lazem 2a7ot components el2owel we b3d keda 2a7ot pack();
        window.setVisible(true);
// TODO code application logic here
    }
    
}
