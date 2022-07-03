/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author hp
 */
public class eastgender extends JPanel implements ListSelectionListener {

    private ButtonGroup group;
    private JRadioButton male;
    private JRadioButton female;
    public static JTextField resultgender;
    public eastgender(){
      
        setBorder(BorderFactory.createTitledBorder("(2) Gender"));
        setLayout(new GridLayout(2,1));
        
        male = new JRadioButton("male");
        male.addActionListener(null);
        
        female = new JRadioButton("female");
        female.addItemListener(null);
        
        resultgender = new JTextField();
        
        group = new ButtonGroup();
        group.add(male);
        group.add(female);
        add(male);
        add(female);
        
        
      
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try{
        if(e.getSource()==male || e.getSource()==female){
            resultgender.equals(e.getSource());
        }     
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(null,"enter the gender");
       System.out.println("number format exception");
        }
        
       
    }
    
}
