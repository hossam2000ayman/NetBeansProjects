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
public class center_panel extends JPanel implements ActionListener {

    private JLabel drinks;
    private JCheckBox tea;
    private JCheckBox coffe;
    private JCheckBox pepsi;
    private JCheckBox nescafe;
    
    private final double nescafeprice = 20.0;
    private final double pepsiprice = 15.0;
    private final double teaprice = 5.0;
    private final double coffeprice = 25.0;
    public static double totaldrink = 0.0;
    public center_panel(){
        this.setLayout(new GridLayout(5,1));
        this.setBorder(BorderFactory.createTitledBorder("Drinks Menu"));
        drinks = new JLabel("Drinks");
        tea = new JCheckBox("tea");
        coffe = new JCheckBox("coffe");
        pepsi = new JCheckBox("pepsi");
        nescafe = new JCheckBox("nescafe");
        add(drinks);
        add(tea);
        add(coffe);
        add(pepsi);
        add(nescafe);
        tea.addActionListener(this);
        coffe.addActionListener(this);  //is refer to the class that i stand on it as class refer to itself
        pepsi.addActionListener(this);
        nescafe.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(tea.isSelected()){
        totaldrink=+teaprice;
    }
    if(coffe.isSelected()){
        totaldrink=+coffeprice;
    }
    if(pepsi.isSelected()){
        totaldrink=+pepsiprice;
    }
    if(nescafe.isSelected()){
        totaldrink = + nescafeprice;
    }
        
    }
    
}
