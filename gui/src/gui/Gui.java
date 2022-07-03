/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class Gui extends JFrame {

    private JPanel panel;
    private JPanel panel2;
    private JLabel cel_label;
    private JLabel kel_label;
    private JTextField cel;
    private JTextField kel;
    private JButton confirm;
    private JButton clear;
    private JButton exit;

    public Gui() {
        setTitle("Gui Converter");
        setSize(300, 200);               
        CREATE_PANEL();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void CREATE_PANEL() {
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Converter"));
        
        panel.setBackground(Color.ORANGE);
        
        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("confirmation"));
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.YELLOW);

        cel_label = new JLabel("Celicius");
        cel = new JTextField(10);

        kel_label = new JLabel("Kelvin");
        kel = new JTextField(10);
        
        confirm = new JButton("Confirm");
        confirm.addActionListener(new buttons());
        
        clear = new JButton("Clear");
        clear.addActionListener(new buttons());
        
        exit = new JButton("Exit");
        exit.addActionListener(new buttons());

        panel.add(cel_label);
        panel.add(cel);
        panel.add(kel_label);
        panel.add(kel);
        
        
        panel2.add(confirm);
        panel2.add(clear);
        panel2.add(exit);
        
        add(panel);
        add(panel2);
    }

    public class buttons implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
     if(e.getSource() == confirm){
            
            String celicius = cel.getText();
            String kelvin = kel.getText();

            if (!kelvin.equals("")) {
                try {
                    double KELVIN = Double.parseDouble(kelvin);
                } catch (NumberFormatException NFE) {
                    JOptionPane.showMessageDialog(null, "invalid input");
                }
            }
            if (!celicius.equals("")) {
                try {
                    double CELICIUS = Double.parseDouble(celicius);
                } catch (NumberFormatException NFE) {
                
                    JOptionPane.showMessageDialog(null, "invalid input");
                }
                
            }
            JOptionPane.showMessageDialog(null,"Temp in cel is" +celicius+
                    "\n"+" and temp in kelvin is "+kelvin );
     }
     if(e.getSource() == clear){
         cel.getText().equals("");
         kel.getText().equals("");
     }
     if(e.getSource() == exit){
         JOptionPane.showMessageDialog(null,"Thank you");
         System.exit(0);
     }
        }
    }
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
        new Gui();
        }
}
