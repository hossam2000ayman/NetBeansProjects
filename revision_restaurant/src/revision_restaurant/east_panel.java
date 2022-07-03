/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision_restaurant;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author hp
 */
public class east_panel extends JPanel implements ItemListener {

    private JLabel topping;
    private JCheckBox bread;
    private JCheckBox fries;
     private JCheckBox salad;
      private JCheckBox suger;
    
      private final double breadprice = 20.0;
    private final double friesprice = 25.0;
     private final double saladprice = 12.0;
      private final double sugerprice = 10.0;
      public static double totaltopping =0.0;
    
      
      public east_panel(){
          setLayout(new GridLayout(5,1));
          setBorder(BorderFactory.createTitledBorder("Toppings menu"));
          topping = new JLabel("Topping");
          bread =new JCheckBox("bread");
          fries = new JCheckBox("fries");
          salad = new JCheckBox("salad");
          suger = new JCheckBox("suger");
          
          add(topping);
          add(bread);
          add(fries);
          add(salad);
          add(suger);
          bread.addItemListener(this);
          fries.addItemListener(this);
          salad.addItemListener(this);
          suger.addItemListener(this);
          
      }
    
    
//    public void actionPerformed(ActionEvent e) {    
////throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
         if(bread.isSelected()){
            totaltopping=+breadprice;
        }
        if(fries.isSelected()){
            totaltopping=+friesprice;
        }
        if(salad.isSelected()){
            totaltopping=+saladprice;
        }
        if(suger.isSelected()){
            totaltopping=+sugerprice;
        }
    }
    
}
