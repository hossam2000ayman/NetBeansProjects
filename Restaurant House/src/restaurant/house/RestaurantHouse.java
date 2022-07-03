/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.NORTH;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class RestaurantHouse{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             JFrame j = new JFrame();
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setTitle("Menu");
         j.setSize(300,300);
        j.setLayout(new BorderLayout());//divide window into 5 parts
       
        northpanel np =  new northpanel();
        np.setBackground(Color.green);
         j.add(np,BorderLayout.NORTH); //7adet makanha fy north put the north panel in north part of window 
       
          westpanel wp =  new westpanel();
                  wp.setBackground(Color.blue);

         j.add(wp,BorderLayout.WEST);
         
         centerpanel cp = new centerpanel();
                 cp.setBackground(Color.blue);

         j.add(cp,BorderLayout.CENTER);
         
         
         eastpanel ep = new eastpanel();
                 ep.setBackground(Color.blue);

         j.add(ep,BorderLayout.EAST);
       
         southpanel sp = new southpanel();
                 sp.setBackground(Color.green);

         j.add(sp , BorderLayout.SOUTH);
         
         j.pack(); //dah ratebly kol panels gowa frame
       j.setVisible(true);
       
        
     
    }
    
}
