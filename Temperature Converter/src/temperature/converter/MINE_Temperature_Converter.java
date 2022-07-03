/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class MINE_Temperature_Converter extends JFrame {

    //1st step
    private JLabel label;
    private JPanel Panel1;
    private JTextField celicius;
    private JTextField kelvin;
    private JButton convert;
    private JButton clear;
    private JButton exit;
    private JFrame backgroundcolor;

    public MINE_Temperature_Converter() {
        //2nd

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TEMPERATURE CONVERTER");
        panel();
        pack();
        setVisible(true);
    }

    public void panel() {
        //3rd
        backgroundcolor = new JFrame();
        backgroundcolor.setBackground(Color.cyan);
        Panel1 = new JPanel();
        Panel1.setBackground(Color.LIGHT_GRAY);
        //  Panel1.setForeground(Color.red); not important 
        label = new JLabel("input temperature");
        label.setBackground(Color.WHITE);
        label.setForeground(Color.blue);
        celicius = new JTextField(10);
        celicius.setBackground(Color.cyan);
        celicius.setForeground(Color.black);                    //component can not be enter in jframe like this 
        kelvin = new JTextField(10);
        kelvin.setBackground(Color.cyan);
        kelvin.setForeground(Color.black);
        convert = new JButton("convert");
        convert.setSize(40, 50);
        convert.setBackground(Color.blue);
        convert.setForeground(Color.white);
        convert.addActionListener(new convert());
        clear = new JButton("clear");
        clear.setSize(40, 50);
        clear.setBackground(Color.blue);
        clear.setForeground(Color.white);
        clear.addActionListener(new clear());
         exit = new JButton("exit");
         exit.setBackground(Color.blue);
         exit.setForeground(Color.white);
         exit.setSize(40, 50);
         exit.addActionListener(new exit());

        //must be grouped in a container like JPanel 1 
        Panel1.add(label);
        Panel1.add(celicius);
        Panel1.add(kelvin);
        Panel1.add(convert);
        Panel1.add(clear);
        Panel1.add(exit);
        Panel1.setLayout(new FlowLayout());
        add(Panel1);//vip
//it's mean that to add panel in frame to appear on window //important to help in visible the components needs  
    }

    public class convert implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String input = celicius.getText();
            String output = kelvin.getText();
            if (!celicius.getText().equals("")) {
                String kelvin = celicius.getText(); //celicius convert to kelvin 
                try {
                    double kel = Double.parseDouble(kelvin);
                    kel = +273.15;
                    JOptionPane.showMessageDialog(null, "temp in kelvin is " + kel);
                } catch (NumberFormatException NFE) {
                    JOptionPane.showMessageDialog(null, "invalid input");

                }
            }
            if (!kelvin.getText().equals("")) {
                String celicius = kelvin.getText();//kelvin convert to celcius
                try {
                    double cel = Double.parseDouble(celicius);

                    cel = cel - 273.15;
                    JOptionPane.showMessageDialog(null, "temp in celicius is " + cel);
                } catch (NumberFormatException NFE) {
                    JOptionPane.showMessageDialog(null, "invalid input");
                }
            }
        }

    }

    public class clear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               kelvin.setText(null);
               celicius.setText(null);
        }

    }

    public class exit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.exit(0);
        }
        
    }
}
