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
public class WestPanel extends JPanel implements ActionListener{
    // 2 Radio buttions
    
    private JRadioButton wheatradio;
    private JRadioButton whiteradio;
    private ButtonGroup group;
    private final double wheatcost = 6.7;
    private final double whitecost = 4.5;
    // cost ?? 
    public static double totalcakecost;
    
    public WestPanel (){
        totalcakecost = wheatcost;
        wheatradio = new JRadioButton("WheatCake",true);
        wheatradio.addActionListener(this);
        whiteradio = new JRadioButton("WhiteCake");
        whiteradio.addActionListener(this);
        group = new ButtonGroup();
        group.add(wheatradio);
        group.add(whiteradio);
        this.setBorder(BorderFactory.createTitledBorder("Cake"));
        this.setLayout(new GridLayout(2,1));
        this.add(wheatradio); // 1 , 1
        this.add(whiteradio); // 2 , 1
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(wheatradio.isSelected()== true){
            totalcakecost = wheatcost;
        }
        else if (whiteradio.isSelected()== true){
            totalcakecost = whitecost;
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
