/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author hp
 */
public class ComboList extends JFrame implements ActionListener, ItemListener, ListSelectionListener {
                                                //button           //combobox  ///lists
    private JPanel window1;                     //checkbox         //checkbox
                                                //combobox         
    //2combobox                                 //radio button 
    private JPanel combopanel;//CB
    private JComboBox sandwiches;
    private JComboBox size;
    private String[] food = {"chicken", "fish", "meat"};
    private String[] sizes = {"large", "medium", "small"};

    private JPanel listpanel;//LISTs
    private JList drinklist;//single selection    //setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    private String[] drink = {"pepsi", "coffe", "nescafe"};
      private JList toppinglist;//multi choice          //setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    private String[] topping = {"bread", "fries", "salad"};
    
  
      private JPanel button;
      private JButton calculate;

    private final double largechickenprice = 60.0;
    private final double mediumchickenprice = 45.0;
    private final double smallchickenprice = 30.0;

    private final double largefishprice = 70.0;
    private final double mediumfishprice = 50.0;
    private final double smallfishprice = 30.0;

    private final double largemeatprice = 90.0;
    private final double mediummeatprice = 60.0;
    private final double smallmeatprice = 30.0;

    private final double friesprice = 60.0;

    private final double breadprice = 40.0;

    private final double saladprice = 10.0;

    private final double pepsiprice = 30.0;

    private final double coffeeprice = 30.0;

    private final double nescafeprice = 30.0;

    private double totalprice = 0.0;

    public ComboList() {
        setTitle("Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        definecombo();
        definedrink();
        definetopping();
        definecalculate();

        pack();
        setVisible(true);

    }

    public void definecombo() {
        combopanel = new JPanel();
        sandwiches = new JComboBox(food); //raseet el array food gowa combobox bt3 sandwiches
        size = new JComboBox(sizes); //raseet el array sizes gowa combobox bt3 size
        combopanel.setBorder(BorderFactory.createTitledBorder("(1) SANDWICHES"));
        combopanel.setLayout(new GridLayout(2, 1)); // food , size 
        combopanel.add(sandwiches);
        combopanel.add(size);
        add(combopanel);
        sandwiches.addItemListener(this); //zay action listener bs men el combo box bacall el action event bt3 combobox
        size.addItemListener(this); //mfesh copy by3otabar override we e7na msh 3ayzeen dah !!!!!!!

    }

    public void definedrink() { //hena ana 3ayezha single selection
        listpanel = new JPanel();
        
        drinklist = new JList(drink);//put array drink inside drinklist bt3 lists ---> dah nafs elklam 3nd combobox
        drinklist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//i make it single selection ,el klam dah mn el JList bs 
        listpanel.setBorder(BorderFactory.createTitledBorder("(2) DRINKS"));
        listpanel.setLayout(new GridLayout(2, 1));
        listpanel.add(drinklist);
        add(listpanel);
        drinklist.addListSelectionListener(this);

    }

    public void definetopping() {
        listpanel = new JPanel();//zay ma 2olt mmkn 2akarar el field tany 3ady bs el far2 h3melo multi selection 
        toppinglist = new JList(topping);
        toppinglist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//i make it multiple selection ,el klam dah mn el JList bs 
        listpanel.setBorder(BorderFactory.createTitledBorder("(3)TOPPINGS"));
        listpanel.setLayout(new GridLayout(2, 1));
        listpanel.add(toppinglist);
      
        add(listpanel);
        toppinglist.addListSelectionListener(this);
    }

    public void definecalculate() {
        button = new JPanel();
        calculate = new JButton("CALCULATE");
        button.add(calculate);
        calculate.addActionListener(this);            
       add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//buttn

        
        JOptionPane.showMessageDialog(this, "the total cost is " + totalprice);
      System.exit(0);
          
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {//combobox    //use getSelectedItem()
        if (sandwiches.getSelectedItem().equals("meat") && size.getSelectedItem().equals("large")) {
            totalprice = +largemeatprice;
        }
        if (sandwiches.getSelectedItem().equals("meat") && size.getSelectedItem().equals("medium")) {
            totalprice = +mediummeatprice;
        }
        if (sandwiches.getSelectedItem().equals("meat") && size.getSelectedItem().equals("small")) {
            totalprice = +smallmeatprice;
        }
        if (sandwiches.getSelectedItem().equals("chicken") && size.getSelectedItem().equals("large")) {
            totalprice = +largechickenprice;
        }
        if (sandwiches.getSelectedItem().equals("chicken") && size.getSelectedItem().equals("medium")) {
            totalprice = +mediumchickenprice;
        }
        if (sandwiches.getSelectedItem().equals("chicken") && size.getSelectedItem().equals("small")) {
            totalprice = +smallchickenprice;
        }
        if (sandwiches.getSelectedItem().equals("fish") && size.getSelectedItem().equals("large")) {
            totalprice = +largefishprice;
        }
        if (sandwiches.getSelectedItem().equals("fish") && size.getSelectedItem().equals("medium")) {
            totalprice = +mediumfishprice;
        }
        if (sandwiches.getSelectedItem().equals("fish") && size.getSelectedItem().equals("small")) {
            totalprice = +smallfishprice;
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {//lists   //getSelectedValue in single and multiple seletion 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        //single list single selection 
        if (drinklist.getSelectedValue().equals("pepsi")) {
            totalprice += pepsiprice;
        }
        if (drinklist.getSelectedValue().equals("coffee")) {
            totalprice += coffeeprice;
        }
        if (drinklist.getSelectedValue().equals("nescafe")) {
            totalprice += nescafeprice;
        }

        //multiple selection    // by derication function getSelectedValues();
        Object[] values = toppinglist.getSelectedValues(); //3andy array mn object msh 3aref ha select meen fa h3ml multi selection 
        for (int i = 0; i < values.length; i++) {
            String s = (String) values[i];//must turn it in string  and make array for more than one selection 
            if (s.equals("bread")) {
                totalprice = +breadprice;
            }
            if (s.equals("fries")) {
                totalprice = +friesprice;
            }
            if (s.equals("salad")) {
                totalprice = +saladprice;
            }
        }
        
      
        
    }

}
