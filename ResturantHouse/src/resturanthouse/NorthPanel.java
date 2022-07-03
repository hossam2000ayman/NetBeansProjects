/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturanthouse;

/**
 *
 * @author AinShams
 */
import javax.swing.*;
// class extends JFrame --->  any object from class ---> window
// class extends JPanel --->  any object from class ---> panel 
public class NorthPanel extends JPanel{
    
    private JLabel Titlelabel;
            
    public NorthPanel (){
        
        // we created a label
        Titlelabel = new JLabel("Welcome to our Restruant");
        // we added or made a border for the panel
        this.setBorder(BorderFactory.createTitledBorder("WelcomeMessage"));
        // add the label in the panel
        this.add(Titlelabel);
    }
}
