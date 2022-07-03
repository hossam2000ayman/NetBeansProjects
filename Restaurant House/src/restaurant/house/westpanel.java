/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hp
 */
public class westpanel extends JPanel implements ActionListener {
    private JLabel cakes;
    private JRadioButton wheatradio;
    private JRadioButton whiteradio;
    private ButtonGroup group;  //lazem 22ol 2ny 3andy 2 radio button lehom 3elaka beb3d 
    private final double wheatprice =25.5;
    private final double whiteprice = 30.0;
    public static double calctotalcake;

    public westpanel(){
        
        cakes = new JLabel("CAKES");
        wheatradio = new JRadioButton("WHEAT");
        wheatradio.setBackground(Color.orange);
        wheatradio.setForeground(Color.black);
        wheatradio.addActionListener(this);
        this.add(wheatradio);
      
        
        whiteradio = new JRadioButton("WHITE");
       whiteradio.setBackground(Color.orange);
        whiteradio.setForeground(Color.black);
        whiteradio.addActionListener(this);//hatwadeek lel function ely hata5od el event 
        this.add(whiteradio);
      
//hanady 3ala this 2a7san ma 2nady 3ala action performed 
        //wheat.addActionListener(new westpanel()); keda ana hadeeef panel gow panel fa hayla8bat el denya 
       
        group =  new ButtonGroup();
        group.add(wheatradio);
        group.add(whiteradio);//has relation betwwen wheat and vice versa
        this.setBorder(BorderFactory.createTitledBorder("cakes"));
        
        
        setLayout(new GridLayout(2,1));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) { //tool lma e fy kema el code byetnafez 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   if(wheatradio.isSelected()==true){
       calctotalcake=wheatprice;
   }
   else if(whiteradio.isSelected()==true){
       calctotalcake=whiteprice;
   }
    
    
    
    }
    
}
