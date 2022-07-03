/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author hp
 */
public class southpanel extends JPanel implements ActionListener {
    private JButton calculate;
    private JButton exit;
    private double calctotalmenu = 0.0;
    public southpanel(){
        calculate = new JButton("Calculate");
                calculate.setBackground(Color.orange);

        exit = new JButton ("Exit");
                exit.setBackground(Color.orange);

        setLayout(new FlowLayout());
        this.setBorder(BorderFactory.createTitledBorder("CALCULATE"));
        this.add(calculate);
        this.add(exit);
        calculate.addActionListener(this);
        exit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource() == calculate){   //e.getSource() == calcbnt   ---> with the button only condition from get source
        calctotalmenu = westpanel.calctotalcake+eastpanel.calctotaltopping+centerpanel.calctotaldrink;
        JOptionPane.showMessageDialog(this, "total price is "+calctotalmenu);
    }
    if(e.getSource() == exit){
        System.exit(0);
    }
    }
}
