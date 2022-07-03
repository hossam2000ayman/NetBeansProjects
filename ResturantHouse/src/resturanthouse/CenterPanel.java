/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturanthouse;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author AinShams
 */
public class CenterPanel extends JPanel implements ActionListener{
    
    private JCheckBox teacheck;
    private JCheckBox coffeecheck;
    private JCheckBox pepsicheck;
    private JCheckBox Nescafecheck;

    private final double teaprice=  4.5;
    private final double coffeeprice=  7.5;
    private final double pepsiprice=  5.5;
    private final double Nescafeprice=  10.5;
    
    public static double totaldrinkscost = 0.0;
    
    public CenterPanel (){
        teacheck = new JCheckBox("Tea");
        coffeecheck = new JCheckBox("coffe");
        pepsicheck = new JCheckBox("Pepsi");
        Nescafecheck = new JCheckBox("Nescafe");
        
        this.setLayout(new GridLayout(4,1));
        this.setBorder(BorderFactory.createTitledBorder("Drinks"));
        teacheck.addActionListener(this);
        coffeecheck.addActionListener(this);
        pepsicheck.addActionListener(this);
        Nescafecheck.addActionListener(this);
        
        add(teacheck);
        add(coffeecheck);
        add(pepsicheck);
        add(Nescafecheck);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(teacheck.isSelected()){
            totaldrinkscost+= teaprice;
        }
        if(coffeecheck.isSelected()){
            totaldrinkscost += coffeeprice;
        }
        if(pepsicheck.isSelected()){
            totaldrinkscost += pepsiprice;
        }
        if(Nescafecheck.isSelected()){
            totaldrinkscost += Nescafeprice;
        }
    }    
}
