/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class southbutton extends JPanel implements ActionListener{

    private JButton apply;
    
    public southbutton(){
       JButton apply = new JButton ("apply");
        
        apply.addActionListener(this);
        add(apply);
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
        if(e.getSource()==apply){
            System.out.println("your name is "+north_name.name.getText());
            System.out.println("your password is "+north_name.password.getText());
            System.out.println("your gender is "+eastgender.resultgender);
            System.out.println("your age is "+centerage.resultage);
            System.out.println("your fields are "+westgrade.resultfield+"\n"+ "and skill are "+westgrade.resultskill);
            System.out.println("your grade is "+westgrade.resultgrade);
            
            }
    }catch(Exception EE){
                
                }
    }
        
    }
    

