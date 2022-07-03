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
public class SouthPanel extends JPanel implements ActionListener{
    
    private JButton calcbnt;
    private JButton exitbnt;
    
    private double totalmenucost = 0.0;
    
    public SouthPanel (){
        calcbnt = new JButton("Calculate");
        exitbnt = new JButton("Exit");
        this.setBorder(BorderFactory.createTitledBorder("Order Calculation"));
        this.setLayout(new GridLayout(1, 2));
        calcbnt.addActionListener(this);
        exitbnt.addActionListener(this);
        add(calcbnt);
        add(exitbnt);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcbnt){
            totalmenucost = WestPanel.totalcakecost + CenterPanel.totaldrinkscost + EastPanel.totattoppingsprice;
            JOptionPane.showMessageDialog(null, "The Total Price is = " + totalmenucost);
        }
        if(e.getSource() == exitbnt){
            System.exit(0);
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
