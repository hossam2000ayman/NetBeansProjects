/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.house;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author AinShams
 */
public class centerpanel extends JPanel implements ActionListener {

    private JCheckBox tea;
    private JCheckBox coffee;
    private JCheckBox pepsi;
    private JCheckBox nescafe;

    private final double teaprice = 4.5;
    private final double coffeeprice = 7.5;
    private final double pepsiprice = 5.5;
    private final double nescafeprice = 10.5;

    public static double calctotaldrink = 0.0;

    public centerpanel() {
        tea = new JCheckBox("Tea");
        tea.setBackground(Color.orange);
        coffee = new JCheckBox("coffe");
        coffee.setBackground(Color.orange);

        pepsi = new JCheckBox("Pepsi");
        pepsi.setBackground(Color.orange);

        nescafe = new JCheckBox("Nescafe");
        nescafe.setBackground(Color.orange);

        this.setLayout(new GridLayout(4, 1));
        this.setBorder(BorderFactory.createTitledBorder("DRINKS"));
        tea.addActionListener(this);
        coffee.addActionListener(this);
        pepsi.addActionListener(this);
        nescafe.addActionListener(this);

        add(tea);
        add(coffee);
        add(pepsi);
        add(nescafe);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tea.isSelected()) {
            calctotaldrink += teaprice;
        }
        if (coffee.isSelected()) {
            calctotaldrink += coffeeprice;
        }
        if (pepsi.isSelected()) {
            calctotaldrink += pepsiprice;
        }
        if (nescafe.isSelected()) {
            calctotaldrink += nescafeprice;
        }
    }
}
