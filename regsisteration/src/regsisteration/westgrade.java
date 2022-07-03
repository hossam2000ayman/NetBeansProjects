/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regsisteration;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author hp
 */
public class westgrade extends JPanel implements ListSelectionListener , ItemListener {

    private JComboBox grade;
    String[]grades = {"1","2","3","4"};
    private JList skill;
    String []skills = {"programing","software engineering","c++","python","routersploit"};
    
    private JList field;
    String []fields = {"Information Technology","Bussiness administerator"};
    
    public static JTextField resultskill;
    public static JTextField resultfield;
    public static JTextField resultgrade;
    public westgrade(){
        setBorder(BorderFactory.createTitledBorder("(4) Skill"));
        setLayout(new FlowLayout());
        
        grade = new JComboBox(grades);
        grade.setBorder(BorderFactory.createTitledBorder("grade"));
        skill = new JList(skills);
        skill.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        
        field = new JList(fields);
     
        field.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
        resultskill = new JTextField(7);
        resultfield = new JTextField(7);
        resultgrade = new JTextField();
        skill.addListSelectionListener(this);
        field.addListSelectionListener(this);
      
    add(skill);
    add(field);
    
    add(grade);
    
    }
            
    
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   try{
        if(skill.getSelectedValue().equals("programing")){
        resultskill.equals("programings");
    }if(skill.getSelectedValue().equals("python")){
        resultskill.equals("python"); 
    }if(skill.getSelectedValue().equals("programings")){
        resultskill.equals("programings"); 
    }if(skill.getSelectedValue().equals("c++")){
        resultskill.equals("c++"); 
    }if(skill.getSelectedValue().equals("routersploit")){
        resultskill.equals("routersploit"); 
    }
   }catch(Exception E){
       
   }
   
   try{
        if(field.getSelectedValue().equals("Information Technology")){
        resultfield.equals("Information Technology");
    }if(skill.getSelectedValue().equals("Bussiness administerator")){
        resultfield.equals("Bussiness administerator"); 
    }
   }catch(Exception E){
       
   }
   
   
   
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(grade.getSelectedItem().equals("1")){
            resultgrade.equals("1");
        }if(grade.getSelectedItem().equals("2")){
            resultgrade.equals("2");
        }if(grade.getSelectedItem().equals("3")){
            resultgrade.equals("3");
        }if(grade.getSelectedItem().equals("4")){
            resultgrade.equals("4");
        }
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
