/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class northpanel extends JPanel {
    private JLabel titlelabel;

    public northpanel(){
        //we create label
        titlelabel = new JLabel("welcome to our restaurant");
        

        //we added or made a border for the panel 
        this.setBorder(BorderFactory.createTitledBorder("Welcome Message"));
        
        //add the label in the panel
    add(titlelabel);
    }

}
