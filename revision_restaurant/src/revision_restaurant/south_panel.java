/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision_restaurant;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author hp
 */
public class south_panel extends JPanel implements ActionListener {

    private JButton calculate;
    private JButton exit;
    public static double totalcost = 0.0;
    
    public south_panel(){
        
        calculate = new JButton ("calculate");
        exit = new JButton  ("exit");
        
        add(calculate);
        add(exit);
        
        calculate.addActionListener(this);
        exit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==calculate){
        totalcost = east_panel.totaltopping+west_panel.totalcake+center_panel.totaldrink;
        //call object foreach class by public static from west , east , center
        
        JOptionPane.showMessageDialog(this,"The total amount is "+totalcost);
    }
    if(e.getSource()==exit){
        System.exit(0);
    }
    }
    
}
