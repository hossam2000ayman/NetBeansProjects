/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision_restaurant;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class north_panel extends JPanel {
    private JLabel title;
    
    public north_panel(){
    title = new JLabel("Welcome to our restaurant");

    this.setBorder(BorderFactory.createTitledBorder("welcome message"));
    this.add(title);
    }
}
