/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.engineer;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author hp
 */
public class SoftwareEngineer extends JFrame implements ActionListener {

    private JFrame window;
    
    private JPanel panel0;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    
    private JLabel name;
    private JLabel id;
    private JLabel grade;
    private JLabel gender;
    private JLabel report;
    private JLabel course;
    private JLabel center;
    
    private JTextField textname;
    private JTextField textid;
    private JTextField textreport;
    
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup group;
    
    
    private JComboBox combocourse;
    String[]courses = {"software engineer","algorithm and data structure","numerical method ","human rights","introduction to economy","operating system","computer organization"};
    
    private JComboBox combocenter;
    String[]centers = {"ain shams","alexandria","menofia","aswan","hugrdaha","beni sweif","assiut"};
    
    private JComboBox comboGrade;
    String[]grades = {"1","2","3","4"};
    
    private JButton send;
    public SoftwareEngineer(){
        window = new JFrame();
        window.setTitle("Regsisteration");
        window.setLayout(new BorderLayout());
        
        
        
        
        panel0 = new JPanel();
        panel0.setBorder(BorderFactory.createTitledBorder("Log In"));
        panel0.setLayout(new GridLayout(3,1));
        name = new JLabel("name");
        textname = new JTextField(9);
        
        id = new JLabel("id");
        textid = new JTextField(9);
        panel0.add(name);
        panel0.add(textname);
        panel0.add(id);
        panel0.add(textid);
        window.add(panel0,BorderLayout.WEST);
//////////////////////////////////////////////////////        
        panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder("About you"));
        panel3.setLayout(new GridLayout(6,1));
        grade = new JLabel("Grade");
        comboGrade = new JComboBox(grades);
        
        center = new JLabel("Center");
        combocenter = new JComboBox(centers);
        
        course = new JLabel("Course");
        combocourse = new JComboBox(courses);
        panel3.add(grade);
        panel3.add(comboGrade);
        panel3.add(center);
        panel3.add(combocenter);
        panel3.add(course);
        panel3.add(combocourse);
        
        
        window.add(panel3,BorderLayout.EAST);
        ////////////////////////////
        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Gender"));
        gender = new JLabel("Gender");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        group = new ButtonGroup();
        group.add(male);
        group.add(female);
        panel1.setLayout(new GridLayout(3,1));
        panel1.add(male);
        panel1.add(female);
        window.add(panel1,BorderLayout.CENTER);
        //////////////////////////////////////////////////////
        panel2 = new JPanel();
        report = new JLabel("Report");
        textreport = new JTextField(012);
        send = new JButton("Send");//button is here 
        send.addActionListener(this);

        panel2.add(report);
        panel2.add(textreport);
        panel2.setLayout(new GridLayout(3,1));
        
        panel2.add(send);
        window.add(panel2,BorderLayout.SOUTH);
        
        
        ///////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        window.setResizable(false);
        window.setSize(1000,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   SoftwareEngineer SE = new SoftwareEngineer();
   new SoftwareEngineer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(e.getSource().equals(send)){
             System.out.println("your report written is"+"\n"+
                    textreport.getText());
            JOptionPane.showMessageDialog(this,"report is sended"+"\n"+"your name is "+textname.getText()+"\n"+"your id is "+textid.getText()+"\n"+
                    "your grade is "+comboGrade+"\n"+"you are in center "+combocenter+"\n"+"Your report is about course of "+combocourse);
            System.exit(0);
           
        }
    }

  
    
}
