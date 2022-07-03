/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision_restaurant;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class west_panel extends JPanel implements ActionListener {
    private JLabel labtitle;
    private JRadioButton wheat;
    private JRadioButton white;
    private ButtonGroup group;  //to take radio button in relation for each other 
                                //as when i choose wheat they ignore white and vice versa
    
    
    private final double wheatprice = 40.0;
    private final double whiteprice = 30.0;
    public static double totalcake  = 0.0;  //to call it from the main class
    public west_panel(){
        
        this.setLayout(new GridLayout(3,1));
        this.setBorder(BorderFactory.createTitledBorder("cakes menu"));
        
        labtitle = new JLabel("cakes");
        this.add(labtitle);
        wheat = new JRadioButton("wheat" , true);
        this.add(wheat);
        white = new JRadioButton("white");
        this.add(white);
       
        group = new ButtonGroup();
        group.add(white); //by add white
        group.add(wheat); //and add also wheat
        //so they are really radio choice & only one was avaliable in choice
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(wheat.isSelected()==true){
            totalcake=wheatprice;
        }
        if(white.isSelected()==true){
            totalcake=whiteprice;
        }
    }
}
