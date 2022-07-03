package CurrencyConverter;

import javax.swing.*;

public class Interface extends JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {

        initComponents(); //drag and drop component
        //regsisteration first(what's your name) 
        try {
            int count = -1;
            while (count < 0) {
                String name = JOptionPane.showInputDialog(null, "Enter Your Name*");

                if (name.length() >= 3) { //ali
                    count++; //count will be == 0 thats mean the while loop is end 
                    JOptionPane.showMessageDialog(null, "Welcome " + name);
                    System.out.println("The User Name is : " + name);
                } else {
                    JOptionPane.showInputDialog(null, "Enter Your Name*"); //the count will be the same == -1 
                }
            }
        } catch (NullPointerException NPE) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Convertor");
        setBackground(new java.awt.Color(204, 255, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 255, 255));
        jTextField1.setText("Currency Program");
        jTextField1.setBorder(null);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 204, 0));
        jTextField4.setText("Enter Your Currency Number");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Input :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Output :");

        jTextField2.setBackground(new java.awt.Color(51, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Egypt", "United States Of America", "Europe", "Saudi Arabia" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 102, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Egypt", "United States Of America", "Europe", "Saudi Arabia" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(225, 84, 84));
        jButton1.setText("Convert");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(225, 84, 84));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(225, 84, 84));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 204, 0));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//clear    
        // TODO add your handling code here:
        jTextField2.setText(""); //strings ---> "" || null 
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Exit
// TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Thank you ... ^_^");
        System.out.println("You Choose Exit");
        System.out.println("Your Program is End");
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Convert
// TODO add your handling code here:
        try {
            String box1 = (String) jComboBox1.getSelectedItem();//1  
            String box2 = (String) jComboBox2.getSelectedItem();//2

            //EGYPT
            if (box1.equals("Egypt") && box2.equals("United States Of America")) {
                jTextField5.setText("EGP");
                double EGP = Double.parseDouble(jTextField2.getText());
                double USD = (EGP * 0.06312);//double
                jTextField3.setText(String.valueOf(USD));//string
                jTextField6.setText("USD");

            }
            if (box1.equals("Egypt") && box2.equals("Europe")) {
                jTextField5.setText("EGP");
                double EGP = Double.parseDouble(jTextField2.getText());
                double EURO = (double) (EGP * 0.05202);
                jTextField3.setText(String.valueOf(EURO));
                jTextField6.setText("EURO");

            }
            if (box1.equals("Egypt") && box2.equals("Egypt")) {
                jTextField5.setText("EGP");
                double EGP = Double.parseDouble(jTextField2.getText());
                jTextField3.setText(String.valueOf(EGP));
                jTextField6.setText("EGP");
                //
            }
            if (box1.equals("Egypt") && box2.equals("Saudi Arabia")) {
                jTextField5.setText("EGP");
                double EGP = Double.parseDouble(jTextField2.getText());
                double SAR = (double) (EGP * 0.24);
                jTextField3.setText(String.valueOf(SAR));
                jTextField6.setText("EGP");
            }

            /////////////////////////////////////////////////////// 
            //EUROPE
            if (box1.equals("Europe") && box2.equals("Egypt")) {
                jTextField5.setText("EURO");
                double EURO = Double.parseDouble(jTextField2.getText());
                double EGP = (double) (EURO * 19.22);
                jTextField3.setText(String.valueOf(EGP));

            }
            if (box1.equals("Europe") && box2.equals("Europe")) {
                jTextField5.setText("EURO");
                double EURO = Double.parseDouble(jTextField2.getText());
                jTextField3.setText(String.valueOf(EURO));
                jTextField6.setText("EURO");

            }
            if (box1.equals("Europe") && box2.equals("United States Of America")) {
                jTextField5.setText("EURO");
                double EURO = Double.parseDouble(jTextField2.getText());
                double USD = (double) (EURO * 1.21350);
                jTextField3.setText(String.valueOf(USD));
                jTextField6.setText("USD");
            }
            if (box1.equals("Europe") && box2.equals("Saudi Arabia")) {
                jTextField5.setText("EURO");
                double EURO = Double.parseDouble(jTextField2.getText());
                double SAR = (double) (EURO * 4.55);
                jTextField3.setText(String.valueOf(SAR));
                jTextField6.setText("SAR");
            }
            ///////////////////////////////////////////////////
            //UNITED STATES OF AMERICA 
            if (box1.equals("United States Of America") && box2.equals("Egypt")) {
                jTextField5.setText("USD");
                double USD = Double.parseDouble(jTextField2.getText());
                double EGP = (double) (USD * 15.84260);
                jTextField3.setText(String.valueOf(EGP));
                jTextField6.setText("EGP");
            }
            if (box1.equals("United States Of America") && box2.equals("Europe")) {
                jTextField5.setText("USD");
                double USD = Double.parseDouble(jTextField2.getText());
                double EURO = (double) (USD * 0.82406);
                jTextField3.setText(String.valueOf(EURO));
                jTextField6.setText("EURO");
            }
            if (box1.equals("United States Of America") && box2.equals("United States Of America")) {
                jTextField5.setText("USD");
                double USD = Double.parseDouble(jTextField2.getText());
                jTextField3.setText(String.valueOf(USD));
                jTextField6.setText("USD");
            }
            if (box1.equals("United States Of America") && box2.equals("Saudi Arabia")) {
                jTextField5.setText("USD");
                double USD = Double.parseDouble(jTextField2.getText());
                double SAR = (double) (USD * 3.75);
                jTextField3.setText(String.valueOf(SAR));
                jTextField6.setText("SAR");
            }
            /////////////////////////////////////////////////////////////
            //SAUDI ARABIA   
            if (box1.equals("Saudi Arabia") && box2.equals("Egypt")) {
                jTextField5.setText("SAR");
                double SAR = Double.parseDouble(jTextField2.getText());
                double EGP = (double) (SAR * 4.22);
                jTextField3.setText(String.valueOf(EGP));
                jTextField6.setText("EGP");
            }
            if (box1.equals("Saudi Arabia") && box2.equals("United States Of America")) {
                jTextField5.setText("SAR");
                double SAR = Double.parseDouble(jTextField2.getText());
                double USD = (double) (SAR * 0.27);
                jTextField3.setText(String.valueOf(USD));
                jTextField6.setText("USD");
            }
            if (box1.equals("Saudi Arabia") && box2.equals("Europe")) {
                jTextField5.setText("SAR");
                double SAR = Double.parseDouble(jTextField2.getText());
                double EURO = (double) (SAR * 0.22);
                jTextField3.setText(String.valueOf(EURO));
                jTextField6.setText("EURO");
            }
            if (box1.equals("Saudi Arabia") && box2.equals("Saudi Arabia")) {
                jTextField5.setText("SAR");
                double SAR = Double.parseDouble(jTextField2.getText());
                jTextField3.setText(String.valueOf(SAR));
                jTextField6.setText("SAR");
            }
        } catch (Exception E) { //number format exception 
            //second exception
            //Built in Exception
            JOptionPane.showMessageDialog(null, " Please Enter a Valid Number ");
            jTextField5.setText("");
            System.out.println("The following error is : " + E.getLocalizedMessage());
        } finally {
            //finally output in all condition have exxceptiion or not  
            int question = JOptionPane.showConfirmDialog(null, "Do you want to continue", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION); // finally 

            if (question == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Don't Forget Press Clear To Restart The Program");
                System.out.println("You Choose Yes");
                System.out.println("Program Still Work");
            } else if (question == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you ... ^_^");
                System.out.println("You Choose No");
                System.out.println("Your Program is End");
                System.exit(0);
            } else if (question == JOptionPane.CANCEL_OPTION) {//x
                System.out.println("You Choose Cancel");
                System.out.println("Still Program Continue...");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    public void launch() {
        new Interface().setVisible(true);
        new Interface().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}