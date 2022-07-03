/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class eastpanel extends JPanel implements ActionListener{

    private JCheckBox bread;
    private JCheckBox fries;
    private JCheckBox salad;
    private JCheckBox sugar;
    private final double breadprice = 30;
        private final double saladprice = 14.4;
    private final double friesprice =54.3;
    private final double sugarprice = 9.5;
    public static double calctotaltopping =0;

                    
    public eastpanel(){
         bread = new JCheckBox("Bread");      
         bread.setBackground(Color.orange);

         
        fries = new JCheckBox("Fries");
                fries.setBackground(Color.orange);
        salad = new JCheckBox("Salad");
                salad.setBackground(Color.orange);
        sugar = new JCheckBox("Sugar");
                sugar.setBackground(Color.orange);
        this.setBorder(BorderFactory.createTitledBorder("TOPPINGS"));
        this.setLayout(new GridLayout(4,1));
        bread.addActionListener(this);
        fries.addActionListener(this);
        salad.addActionListener(this);
        sugar.addActionListener(this);
        this.add(bread);
        this.add(fries);
        this.add(salad);
        this.add(sugar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(bread.isSelected()==true){
        calctotaltopping=+breadprice;
    }
    
    if(fries.isSelected()==true){
        calctotaltopping=+friesprice;
    }
    
    if(salad.isSelected()==true){
        calctotaltopping=+saladprice;
    }
    
    if(sugar.isSelected()==true){
        calctotaltopping=+sugarprice;
    }
    
        
    }
    
}
