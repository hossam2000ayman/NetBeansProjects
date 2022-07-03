/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucombolist;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author EELU
 */
public class ComboList extends JFrame 
    implements ActionListener, ItemListener, ListSelectionListener{

    // 2 CB
    private JPanel ComboPanel;
    private JComboBox sandwichescombo;
    private String[] sandwiches = {"Chicken", "Meat", "Fish"};
    private JComboBox sizescombo;
    private String[] sizes = {"Large", "Medium", "small"};
    // 2 List
    private JPanel ListPanel1;
    private JList drinkslist;  // Single selection 
    private JPanel ListJPanel2;
    private String[] drinks = {"Pepsi", "Coffee", "Nescafe"};
    private JList toppingslist; // multiple selection
    private String[] toppings = {"Bread", "Fries", "Salad"};
    private final double chickenlarge = 13.45;
    private final double chickenmedium = 6.45;
    private final double chickensmall = 3.45;
    private final double meatlarge = 15.45;
    private final double meatmedium = 7.45;
    private final double meatsmall = 5.45;
    private final double fishlarge = 15.45;
    private final double fishmedium = 7.45;
    private final double fishsmall = 5.45;
    private final double Pepsiprice = 6.45;
    private final double Coffeeprice = 4.45;
    private final double Nescafeprice = 3.45;
    private final double Breadprice = 6.45;
    private final double Friesprice = 4.45;
    private final double saladprice = 3.45;

    private JButton calcbnt;
    private double totalprice = 0.0;

    public ComboList() {
        setTitle("MenuList");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        DefineCombos();
        Definedrinklist();
        Definetoppingslist();
        Definecalc();
        pack();
        setVisible(true);
    }

    public void DefineCombos() {
        ComboPanel = new JPanel();
        sandwichescombo = new JComboBox(sandwiches);
        sizescombo = new JComboBox(sizes);
        sandwichescombo.addItemListener(this);
        sizescombo.addItemListener(this);
        ComboPanel.setBorder(BorderFactory.createTitledBorder("Sandwiches"));
        ComboPanel.setLayout(new GridLayout(2, 1));
        ComboPanel.add(sandwichescombo);
        ComboPanel.add(sizescombo);
        add(ComboPanel);
    }

    public void Definedrinklist() {
        ListPanel1 = new JPanel();
        drinkslist = new JList(drinks);
        drinkslist.addListSelectionListener(this);
        drinkslist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListPanel1.setBorder(BorderFactory.createTitledBorder("Drinks"));
        ListPanel1.add(drinkslist);
        add(ListPanel1);
    }

    public void Definetoppingslist() {
        ListJPanel2 = new JPanel();
        toppingslist = new JList(toppings);
        toppingslist.addListSelectionListener(this);
        toppingslist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ListJPanel2.setBorder(BorderFactory.createTitledBorder("Toppings"));
        ListJPanel2.add(toppingslist);
        add(ListJPanel2);
    }

    public void Definecalc() {
         calcbnt = new JButton("Calculate");
         calcbnt.addActionListener(this);
         add(calcbnt);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "The total price is = " 
                + totalprice);
        // Button
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(sandwichescombo.getSelectedItem().equals("Meat") &&
                sizescombo.getSelectedItem().equals("Large")){
            totalprice += meatlarge;
        }
        else if(sandwichescombo.getSelectedItem().equals("Fish") &&
                sizescombo.getSelectedItem().equals("small")){
            totalprice += fishsmall;
        }
        // Combobox
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Single list selection of drinks
        if(drinkslist.getSelectedValue().equals("Pepsi")){
            totalprice += Pepsiprice;
        }
        else if(drinkslist.getSelectedValue().equals("Coffee")){
            totalprice += Coffeeprice;
        }
        else if(drinkslist.getSelectedValue().equals("Nescafe")){
            totalprice += Nescafeprice;
        }
        
        // Multi list of toppings
                                        // Deprecated function
        Object [] values = toppingslist.getSelectedValues();
        // physcial data type is string
        for(int i = 0; i < values.length; i++){
            String s = (String) values[i];
            if(s.equals("Bread")){
                totalprice += Breadprice;
            }
            if(s.equals("Fries")){
                totalprice += Breadprice;
            }
            if(s.equals("Salad")){
                totalprice += Breadprice;
            }
            
        }
    }

}
