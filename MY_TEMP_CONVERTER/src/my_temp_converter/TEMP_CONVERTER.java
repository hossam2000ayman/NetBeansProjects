/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_temp_converter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class TEMP_CONVERTER extends JFrame {
    //fields or attribute
    private JPanel panel1;
    private JLabel celicius;
    private JLabel kelvin;
    private JLabel fahrenheit;
    private JTextField cel;
    private JTextField kel;
    private JTextField fahr;
    private JButton convert;
    private JButton exit;
    
    public TEMP_CONVERTER(){
        setTitle("temperature");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        makepanel();
        pack();
        setVisible(true);
        
    }
    public void makepanel(){
        panel1 = new JPanel();
        add(panel1);
        
        celicius = new JLabel("temperature in celicius");
        panel1.add(celicius);
        
        kelvin = new JLabel("temperature in kelvin");
        panel1.add(kelvin);
        
        fahrenheit = new JLabel("temperature in fahrenheit");
        panel1.add(fahrenheit);
        
        cel =  new JTextField(10);      //string
        panel1.add(cel);
        
        kel = new JTextField(10);      //string
        panel1.add(kel);
        
        fahr = new JTextField(10);    //string
        panel1.add(fahr);
        
        convert = new JButton("convert");
        panel1.add(convert);
        convert.addActionListener(new actionbuttons());
        
        exit = new JButton("exit");
        panel1.add(exit);
        exit.addActionListener(new actionbuttons());
        
    }
    
    public class actionbuttons implements ActionListener{

        
        @Override
        public void actionPerformed(ActionEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
             if(e.getSource() == exit){  //from action event  ====> e
             System.exit(0);
         }
            
            String x = cel.getText();//in condition cel
        String y = kel.getText();//in condtion kel
         String z = fahr.getText();//in condition fahr
        
         try{
                  //compare between strings 
         if(!cel.getText().equals("")){
             double cel = Double.parseDouble(x);
             double kel = cel+273.15;
             double fahr = cel*(5.0/9.0)-32;
             
          JOptionPane.showMessageDialog(null,"(1) temperature in kelvin "+kel );
            
             JOptionPane.showMessageDialog(null,"(1) temperature in kelvin "+fahr ); 
         }
            //compare between strings 
          if(!kel.getText().equals("")){
             double kel = Double.parseDouble(y);
             double cel = kel-273.15;
             double fahr = (kel-273.15)*(5.0/9.0)-32;
             
         
             JOptionPane.showMessageDialog(null,"(2) temperature in celicius "+cel ); 
            JOptionPane.showMessageDialog(null,"(2)temperature in fahrenheit "+fahr ); 
         }
            //compare between strings 
         if(!fahr.getText().equals("")){
             double fahr = Double.parseDouble(z);
             double kel = (fahr*(9.0/5.0)+32)+273.15;
             double cel = fahr*(9.0/5.0)+32;
             
             JOptionPane.showMessageDialog(null,"(3) temperature in kelvin "+kel );
             JOptionPane.showMessageDialog(null,"(3) temperature in celicius "+cel ); 
            // JOptionPane.showMessageDialog(null,"temperature in fahrenheit "+fahr ); 
         }
         }catch(NumberFormatException NFE){
             JOptionPane.showMessageDialog(null,"invalid number");
         }
         
        
         
        }
        
    }
}

