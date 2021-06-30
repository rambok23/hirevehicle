/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirevehicle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hp
 */
public class CarReg extends javax.swing.JFrame {

    /**
     * Creates new form CarReg
     */
    public CarReg() {
        initComponents();
        setIconImage();
        autoID();
        table_update();
        
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.setRowHeight(25);
    }

  
    Connection con;
    PreparedStatement pst;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtregno = new javax.swing.JTextField();
        txtmake = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtback = new javax.swing.JButton();
        txtcombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnumberplate = new javax.swing.JTextField();
        txtsheat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "CarRegistration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 51)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CarReg No ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Make");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Model");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Available");

        txtregno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregnoActionPerformed(evt);
            }
        });
        txtregno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtregnoKeyPressed(evt);
            }
        });

        txtmake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmakeKeyPressed(evt);
            }
        });

        txtmodel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmodelKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hirevehicle/icons8-add-25.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hirevehicle/icons8-update-25.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hirevehicle/icons8-delete-25.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hirevehicle/icons8-back-25.png"))); // NOI18N
        txtback.setText("Back");
        txtback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbackActionPerformed(evt);
            }
        });

        txtcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("No.Of Seats");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Number Plate");

        txtnumberplate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumberplateKeyPressed(evt);
            }
        });

        txtsheat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsheatKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Price/Day");

        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpriceKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtback, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtregno, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(txtmake)
                            .addComponent(txtmodel)
                            .addComponent(txtnumberplate)
                            .addComponent(txtsheat)
                            .addComponent(txtprice))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtregno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumberplate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtsheat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmake, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CarRegNo", "Number Plate", "seats", "Make", "Model", "Price", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String rgno = txtregno.getText();
        String numplate = txtnumberplate.getText();
        String sheat = txtsheat.getText();
        String make = txtmake.getText();
        String mod = txtmodel.getText();
        String price = txtprice.getText();
        String aval = txtcombo.getSelectedItem().toString();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lostrent","root","");
           
            
            pst =con.prepareStatement("insert into vehiclesrent(Car_no,number_plate,sheet,make,model,price,available) values(?,?,?,?,?,?,?)");
            pst.setString(1,rgno);
            pst.setString(2,numplate);
            pst.setString(3,sheat);
            pst.setString(4,make);
            pst.setString(5,mod);
            pst.setString(6,price);
            pst.setString(7,aval);
           
            
            if(numplate.equals("")){
                    JOptionPane.showMessageDialog(null,"numplate Can't Empty");
                    txtnumberplate.setText("");
                    txtnumberplate.requestFocus();
            }
            else if(sheat.equals("")){
                    JOptionPane.showMessageDialog(null,"sheat Can't Empty");
                    txtsheat.setText("");
                    txtsheat.requestFocus();
            }
            else if(make.equals("")){
                    JOptionPane.showMessageDialog(null,"Make Can't Empty");
                    txtmake.setText("");
                    txtmake.requestFocus();
            }
            else if(mod.equals("")){
                    JOptionPane.showMessageDialog(null,"Must Enter Model!!");
                    txtmodel.setText("");
                    txtmodel.requestFocus();
            }
            else if(price.equals("")){
                    JOptionPane.showMessageDialog(null,"Must Enter Price!!");
                    txtprice.setText("");
                    txtprice.requestFocus();
            }
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Car Added Successfully!!!");
            
            
            txtnumberplate.setText("");
            txtsheat.setText("");
            txtmake.setText("");
            txtmodel.setText("");
            txtprice.setText("");
            txtcombo.setSelectedIndex(0);
            txtnumberplate.requestFocus();
            autoID();
            table_update();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        txtregno.setText(d1.getValueAt(selectIndex,0).toString());
        txtnumberplate.setText(d1.getValueAt(selectIndex,1).toString());
        txtsheat.setText(d1.getValueAt(selectIndex,2).toString());
        txtmake.setText(d1.getValueAt(selectIndex,3).toString());
        txtmodel.setText(d1.getValueAt(selectIndex,4).toString());
        txtprice.setText(d1.getValueAt(selectIndex,5).toString());
        txtcombo.setSelectedItem(d1.getValueAt(selectIndex,6).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbackActionPerformed
        this.hide();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_txtbackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();

        int selectIndex = jTable1.getSelectedRow();

        String id = d1.getValueAt(selectIndex,0).toString();
        int dialogResult = JOptionPane.showConfirmDialog(this,"Do You Want To Delete The Record?","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/lostrent","root","");

                pst = con.prepareStatement("delete from vehiclesrent where Car_no = ? ");

                pst.setString(1,id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Record Deleted Successfully!!!");

                table_update();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();

        int selectIndex = jTable1.getSelectedRow();

        try {

            String id = d1.getValueAt(selectIndex,0).toString();
            String numplate = txtnumberplate.getText();
            String sheet = txtsheat.getText();
            String make = txtmake.getText();
            String mod = txtmodel.getText();
            String price = txtprice.getText();
            String status = txtcombo.getSelectedItem().toString();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lostrent","root","");

            pst = con.prepareStatement("update vehiclesrent set number_plate=?,sheet=?, make=?,model=?,price=?,available=? where Car_no = ?");

            pst.setString(1,numplate);
            pst.setString(2,sheet);
            pst.setString(3,make);
            pst.setString(4,mod);
            pst.setString(5,price);
            pst.setString(6,status);
            pst.setString(7,id);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Record Updated Successfully!!!");

            table_update();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtregnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregnoActionPerformed
        
    }//GEN-LAST:event_txtregnoActionPerformed

    private void txtnumberplateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumberplateKeyPressed

    }//GEN-LAST:event_txtnumberplateKeyPressed

    private void txtsheatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsheatKeyPressed
        
        char c = evt.getKeyChar();
       
        if(Character.isDigit(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            txtsheat.setEditable(true);
        }
        else{
            txtsheat.setEditable(false);
        }
    }//GEN-LAST:event_txtsheatKeyPressed

    private void txtmakeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmakeKeyPressed
        
              
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            txtmake.setEditable(true);
            
        }
        else{
            txtmake.setEditable(false);
        }
    }//GEN-LAST:event_txtmakeKeyPressed

    private void txtmodelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodelKeyPressed
        
              
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            txtmodel.setEditable(true);
        }
        else{
            txtmodel.setEditable(false);
        }
    }//GEN-LAST:event_txtmodelKeyPressed

    private void txtpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyPressed
        
        char c = evt.getKeyChar();
       
        if(Character.isDigit(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            txtprice.setEditable(true);
        }
        else{
            txtprice.setEditable(false);
        }
    }//GEN-LAST:event_txtpriceKeyPressed

    private void txtregnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregnoKeyPressed
            
         txtregno.setEditable(false);
    }//GEN-LAST:event_txtregnoKeyPressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
      
    }//GEN-LAST:event_jTable1KeyPressed

    /**
     * @param args the command line arguments
     */
    
    
    public void table_update()
    {
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lostrent","root","");
       
            pst = con.prepareStatement("select * from vehiclesrent");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next())
            {
                Vector v2 = new Vector();
                for(int i=1; i<=c; i++)
                {
                    v2.add(Rs.getString("Car_no"));
                    v2.add(Rs.getString("number_plate"));
                    v2.add(Rs.getString("sheet"));
                    v2.add(Rs.getString("make"));
                    v2.add(Rs.getString("model"));
                    v2.add(Rs.getString("price"));
                    v2.add(Rs.getString("available"));
                }
                
                df.addRow(v2);
                
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    
    
    
    
    
    
    
    
    
    
    public void autoID()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           
            con = DriverManager.getConnection("jdbc:mysql://localhost/lostrent","root","");
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("select Max(Car_no) from vehiclesrent");
            rs.next();
            rs.getString("Max(Car_no)");
            
            
            if(rs.getString("Max(Car_no)")==null)
            {
                txtregno.setText("C0001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("Max(Car_no)").substring(2,rs.getString("Max(Car_no)").length()));
                id++;
                txtregno.setText("C0" + String.format("%03d",id));
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtback;
    private javax.swing.JComboBox<String> txtcombo;
    private javax.swing.JTextField txtmake;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtnumberplate;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtregno;
    private javax.swing.JTextField txtsheat;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo1.png")));
    }
}
