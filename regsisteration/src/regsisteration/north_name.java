/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class north_name extends JPanel{
    private JLabel labelname;
    private JLabel labelpassword;
    public static JTextField name;
    public static JTextField password;
    
    public north_name(){
        setBorder(BorderFactory.createTitledBorder("(1) Name and password"));
        setLayout(new GridLayout(3,1));
        labelname = new JLabel("Name");
        name = new JTextField(8);
        
        labelpassword = new JLabel("password");
        password = new JTextField(10);
        
    
        add(labelname);
        add(name);
        add(labelpassword);
        add(password);
       
        
    }

  
}
