/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_kentaky;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author hp
 */
public class My_kentaky extends JFrame {

  
    ///////////////////////////////////////////////////////////////
    
    public class kentaky extends JPanel implements ActionListener, ListSelectionListener, ItemListener {

    private JPanel mealmenu;
    private JPanel drink_toppingmenu;
    private JPanel the_paid;

    private JComboBox meals;

    private String[] meal = {"meat", "fish", "chicken"}; //component of jcombobox

    private final double meatprice = 20.0;
    private final double fishprice = 30.0;
    private final double chickenprice = 15.0;

    private JComboBox sizes;

    private String[] size = {"large", "medium", "small"};//component of jcombobox

    private final double smallmeat = 20.0;
    private final double mediummeat = 25.0;
    private final double largemeat = 50.0;

    private  final double smallfish = 30.0;
    private  final double mediumfish = 60.0;
    private  final double largefish = 90.0;

    private  final double smallchicken = 15.0;
    private  final double mediumchicken = 20.0;
    private  final double largechicken = 30.0;

    private JList drinks;
    private String[] drink = {"coffe", "tea", "pepsi", "cola"};

    private  final double coffeprice = 20.0;
    private  final double teaprice = 20.0;
    private  final double pepsiprice = 20.2;
    private  final double colaprice = 20.0;
    
    private JList toppings;
    private String[] topping = {"bread", "fries", "salad"};

    private  final double breadprice = 20.0;
    private  final double friesprice = 20.0;
    private  final double saladprice = 20.0;
    
    
    private JButton calculate;
    private JButton exit;
    private double totalcost = 0.0;
    public kentaky() {

        
        mealmenu = new JPanel();
        mealmenu.setBorder(BorderFactory.createTitledBorder("Meals"));
    
        mealmenu.setLayout(new GridLayout(2,1));

        
        meals = new JComboBox(meal);

        mealmenu.add(meals);

        sizes = new JComboBox(size);
        mealmenu.add(sizes);
        meals.addItemListener(this);   //
        sizes.addItemListener(this);   //

        ///////////////////complete the first panel in east location /////////////////////////
        
        drink_toppingmenu = new JPanel();
        drink_toppingmenu.setBorder(BorderFactory.createTitledBorder("Drink,topping"));
        drink_toppingmenu.setLayout(new GridLayout(1,2));

        

        drinks = new JList(drink);
        drinks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        drink_toppingmenu.add(drinks);
        drinks.addListSelectionListener(this);    //
        
        toppings = new JList(topping);
        toppings.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        drink_toppingmenu.add(toppings);
        toppings.addListSelectionListener(this);     //
        
        ////////////////COMPLETE the second panel in center location///////////////////////
        
        the_paid = new JPanel();
        the_paid.setBorder(BorderFactory.createTitledBorder("calculation"));
        the_paid.setLayout(new GridLayout(2,1));
       
        
        calculate = new JButton("calculate");
      
        exit = new JButton ("exit");
          the_paid.add(calculate); 
          the_paid.add(exit);
          calculate.addActionListener(this);   //
          exit.addActionListener(this);      //
          
         
          ///////////////////////complete the third panel in west location //////////////////////
          
          //put all of the panels in jframe 
          JFrame j = new JFrame();

          j.setLayout(new BorderLayout());
          the_paid.setLayout(new BorderLayout());
       

          j.add(mealmenu,BorderLayout.WEST);
          j.add(drink_toppingmenu,BorderLayout.CENTER);
          j.add(the_paid.add(exit),BorderLayout.SOUTH);
          j.add(the_paid.add(calculate),BorderLayout.SOUTH);
          j.setSize(500,300);
          j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          j.setVisible(true);
          j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) { //ListSelectionListener
        //single selection in SelectionMode ---> ListSelectionModel    --> getSelectedValue()    no dericated objects
        //dah lma bashawer 3ala single selection only
        if(drinks.getSelectedValue().equals("coffe")){
            totalcost=+coffeprice;
        }else if(drinks.getSelectedValue().equals("tea")){
            totalcost=+teaprice;
            }else if (drinks.getSelectedValue().equals("pepsi")){
                totalcost=+pepsiprice;
            }else if(drinks.getSelectedValue().equals("cola")){
        totalcost=+colaprice;
    }
        
        //multiple interval selection in selection mode -->  ListSelectionModel  ---> getSelectedValues() dericated objects 
        //dah lma bashawer 3ala multiple interval selection or single interval selecion  
       else if (toppings.getSelectedValues().equals("bread")){
            totalcost=+breadprice;
        }
       else if(toppings.getSelectedValues().equals("fries")){
            totalcost=+friesprice;
        }
       else if(toppings.getSelectedValues().equals("salad")){
            totalcost=+saladprice;
        }
            
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {//ItemListener
        
    if(meals.getSelectedItem().equals("chicken") && sizes.getSelectedItem().equals("large")){
        totalcost=+largechicken;
    }
    if(meals.getSelectedItem().equals("chicken") && sizes.getSelectedItem().equals("medium")){
        totalcost=+largechicken;
    }if(meals.getSelectedItem().equals("chicken") && sizes.getSelectedItem().equals("small")){
        totalcost=+largechicken;
    }
    if(meals.getSelectedItem().equals("meat") && sizes.getSelectedItem().equals("large")){
       totalcost=+ largemeat;
    }
    if(meals.getSelectedItem().equals("meat") && sizes.getSelectedItem().equals("medium")){
       totalcost=+ mediummeat;
    }
    if(meals.getSelectedItem().equals("meat") && sizes.getSelectedItem().equals("small")){
       totalcost=+ smallmeat;
    }
    if(meals.getSelectedItem().equals("fish") && sizes.getSelectedItem().equals("large")){
       totalcost=+ largefish;
    }
    if(meals.getSelectedItem().equals("fish") && sizes.getSelectedItem().equals("medium")){
       totalcost=+ mediumfish;
    }
    if(meals.getSelectedItem().equals("fish") && sizes.getSelectedItem().equals("small")){
       totalcost=+ smallfish;
    }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==calculate){
        JOptionPane.showMessageDialog(this,"the total cost is "+totalcost);
    }
    if(e.getSource()==exit){
        System.exit(0);
    }
    }

}
    ////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
 
        // TODO code application logic here
       My_kentaky mk = new My_kentaky();
       My_kentaky.kentaky mkk = mk.new kentaky();
       
       
    }
    
}
