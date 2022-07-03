/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytempconverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//create object from temp convertor  ----> new window
public class TempConverter extends JFrame {
    private JPanel Panel1;
    private JLabel labtitle;
    private JTextField tempfahr;
    private JButton convertbnt;
    private JTextField tempcel;
    
    public TempConverter(){
        setTitle("TempConverter");
        //width    //height
        //300 pixels
        //setSize(300,300); //hatla7ez 2n el size kbeer 3ala component dyat 
        setSize(300,300);    //initial size   2olt ne8ayarha we nshof 
        //fy function mawgoda fy gui 3nd JFrame 2smaha (pack)
        //pack === 23mel el window 3ala el2ad 7gm el component 
      //  pack();    //opps 5aly balak t70t el pack b3d BuildPanel (2o e panel el anta 3amelha call 3alashan y3raf y3red el 7agat
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lama te close el program y3mel build succesful (y3ny y2fel el debug we compile
        
     ///   getContentPane().setBckground(Color.blue);  //m3naha lowwen elframe we frame 2sasan wara elpanel fa msh hashofha mn panel fehmt 
         BuildPanel();
         pack(); //23mel elwindow 3ala 2d 7agm el component  //we heya msh la8et el set size  
        setResizable(false); //mat7akemsh fy size 
        setVisible(true); //2akeed dyat 2aham 7aga fy program tmam
        //hal ana deft el panel gowa el window bt3ty ..   la2 
        //yb2a lazem 2adeef 
    
        //BuildPanel(); //mafrod hanadeeh 2bl set visible wala b3d set visible tb3an 2bl set visible 3alashan 23raf 2a2raha  
        
        
        
    }
    
    public void BuildPanel(){ //mafrod hanadeeh 2bl set visible wala b3d set visible tb3an ...2bl set visible 3alashan 23raf 2a2raha  
        Panel1 = new JPanel();
         //label title
        labtitle = new JLabel("please enter the value in fahr");
       
        //10 pixels width     ----> 10 pixels l 3ard       
        tempfahr = new JTextField(10);
                tempcel = new JTextField(10);

//button title
        convertbnt = new JButton("convert");
        //lo 3ayz telawen 
        convertbnt.setBackground(Color.red);
        convertbnt.setForeground(Color.yellow);
        //harbot el link mabeen  button we code 
        convertbnt.addActionListener(new ActionConvert());
        //hal 27na bna5od el keyam dyat 3ala tol fy window wala lazem negam3hom fy panel1 we panel2 we  panel3 we ha kaza 
        Panel1.add(labtitle);//l2nn kol el function dyat mawgooda gowa JFrame
        
        Panel1.add(tempfahr);//l2nn kol el function dyat mawgooda gowa JFrame
       Panel1.add(tempcel);
        Panel1.add(convertbnt);//l2nn kol el function dyat mawgooda gowa JFrame
        add(Panel1); //keda ana deftaha fy window //2a2dar 2sta5demha mn 8er ay moshkela   //l2nn kol el function dyat mawgooda gowa JFrame 
    Panel1.setBackground(Color.cyan); //inside Panel 
        //here is 3 type of lay out  --->border, flow ,grid
        
        //27sn 2azabat el lay out 3ala panel  howa mmkn fy window bs msh mestahel 
        //nshof nerosohom ezay fy panel dah lo hasta5demhom   ana msh me7tag 2asan 23ml layout 
        Panel1.setLayout(new FlowLayout()); 
    }
    //3alashan tebarmag el zorar bt3na lazem t3mel steps 
    //1- create new class
    //2- new class make implement to interface ---> ActionListener
    //3-put code inside function inside interface
    // named by action performed 
    //3alashan t3ml link ma been button and code 
    //4 //1 hat3araf object mn new class el anta 3amaltaha(create object from new class )
    //2 call addActionListener();
    public class ActionConvert implements ActionListener{ //leh 7asal error fy 2ol 3alashan anta msh madeet 3a2d mnel 2ol bt3 implements inside interface 
//3alashan temdy 2el 3a2d lazem t3mel eh   
        //implement el method le kol el abstract ely gowak 
        //el2wel bs 2at2aked 2ny 3amel import lel ActionListener 3alashan 23raf 2roo7 lel source 
        @Override
        public void actionPerformed(ActionEvent e) {
          //ya50d elklam mn text field we y7awelo l fahr we 2l3aks 
          
          //mmkn 2b2a 23mel check bassed hena dah bnesba lel tempcel 2ly mahmoud zawedha 
       
            String Ss = tempfahr.getText(); //byla2y string 3andy fady  fa msh hay3raf y7awelowe yro7 3alatol fy catch 
            if(!tempfahr.getText().equals("")){
                    String fahr = tempfahr.getText(); //mosta7eel t7sal moshkela 2omal moshkela te7sal ezay lama 2agy 2a7awel 

          
          try{  //garab nafez el mawdo3 dah we lo mnf3sh 23mel catch ll Number Format Exception
               double cel = Double.parseDouble(fahr);//convert string to double
               //howa msh wared yb2a dah fy moshkela 
               //a exception 2l7a2 2amseko
               //b3d keda ne7seb cel
               cel = cel*(5.0/9.0) - 32.0;
               JOptionPane.showMessageDialog(null, "The converted temperature in celicius ="+cel);
               
           }catch(NumberFormatException NFE){ // y3ny msh hay5aly program yedrab 
               JOptionPane.showMessageDialog(null, "cel entered is wrong format ");
               
           }
          }          

           //howa eh ely fadelana 
           //2shof ezay 2arbot el zorar bl class  (link y3ny)
           //nfs el klma han3melo fy cel
          
          //mmkn 2b2a 23mel check bassed hena dah bnesba lel tempcel 2ly mahmoud zawedha

             if(!tempcel.getText().equals("")){
          String cel = tempcel.getText();
          
          try{  //garab nafez el mawdo3 dah we lo mnf3sh 23mel catch ll Number Format Exception
               double fahr = Double.parseDouble(cel);//convert string to double
               //howa msh wared yb2a dah fy moshkela 
               //a exception 2l7a2 2amseko
               //b3d keda ne7seb cel
               fahr = fahr*(9.0/5.0) + 32.0;
               JOptionPane.showMessageDialog(null, "The converted temperature in fahr ="+fahr);
               
           }catch(NumberFormatException NFE){ // y3ny msh hay5aly program yedrab 
               JOptionPane.showMessageDialog(null, "Fahr entered is wrong format ");
               
           }
          }      
            
            
            
        }
     
    
        
    }
    
    
    
    
}
