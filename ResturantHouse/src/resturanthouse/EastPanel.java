/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturanthouse;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author AinShams
 */
public class EastPanel extends JPanel implements ActionListener{
 
    private JCheckBox breadcheck;
    private JCheckBox friescheck;
    private JCheckBox saladCheck;
    
    private final double breadprice = 2.5;
    private final double friesprice = 3.4;
    private final double saladprice = 4.5;
    
    public static double totattoppingsprice =0.0;
    
    public EastPanel (){
        
        breadcheck = new JCheckBox("Bread");
        friescheck = new JCheckBox("Fries");
        saladCheck = new JCheckBox("Salad");
        this.setBorder(BorderFactory.createTitledBorder("Toppings"));
        this.setLayout(new GridLayout(4,1));
        breadcheck.addActionListener(this);
        friescheck.addActionListener(this);
        saladCheck.addActionListener(this);
        this.add(breadcheck);
        this.add(friescheck);
        this.add(saladCheck);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(breadcheck.isSelected()){
            totattoppingsprice += breadprice;
        }
        if(friescheck.isSelected()){
            totattoppingsprice += friesprice;
        }
        if(saladCheck.isSelected()){
            totattoppingsprice += saladprice;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
