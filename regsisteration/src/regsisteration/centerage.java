/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class centerage extends JPanel implements ItemListener {
    private JLabel labelage;
            
    private JComboBox age;
     String []ages = {"11","12","13","14","15","16","17","18","19","20"}; //important
     
     public static JTextField resultage;
     
     public centerage(){
         
         
         setBorder(BorderFactory.createTitledBorder("(3) age"));
         
         setLayout(new GridLayout(2,1));
        
         labelage = new JLabel("Age");
         
         age = new JComboBox(ages);     //ay combobox , textfield , checkbox ,radiobutton  ==> must be casting to string 
        
     
        
        add(labelage);
        add(age);
        age.addItemListener(this);
     }

    @Override
    public void itemStateChanged(ItemEvent e) {
    
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try{
            if(age.getSelectedItem().equals(ages)){
                resultage.equals(age.getSelectedItem());
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(null,"please enter your age");
        }
           
    }
}
