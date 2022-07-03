/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class Regsisteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame f = new JFrame();

        f.setTitle("regsisteration");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(new BorderLayout());

        JPanel mainpanel = new JPanel();
        mainpanel.setBorder(BorderFactory.createTitledBorder("Regsister"));

        
        north_name nn = new north_name();
        mainpanel.add(nn, BorderLayout.NORTH);
        
        eastgender eg = new eastgender();
        mainpanel.add(eg,BorderLayout.EAST);
        
        centerage ca = new centerage();
        mainpanel.add(ca,BorderLayout.CENTER);
        
        westgrade wg = new westgrade();
        mainpanel.add(wg,BorderLayout.WEST);
        
        southbutton sb = new southbutton();
        mainpanel.add(sb,BorderLayout.SOUTH);
        f.add(mainpanel);
        f.pack();
        f.setVisible(true);
    }

}
