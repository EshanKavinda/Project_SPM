/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.subcomponents;


import com.models.CGroupNumber;
import com.services.GroupNumberServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Chanuka
 */
public class GroupNumber extends javax.swing.JPanel {

    private JTabbedPane jTabbedPane;
    private int GN_id = 0;
    private int i = 0;
    
   
    public GroupNumber(JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
        GroupNumberServices service = new GroupNumberServices();
        jTable1.setModel(DbUtils.resultSetToTableModel(service.tableLoadGN()));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Group Number");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Group Number");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton5)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        boolean gnAvailibility = false;
        CGroupNumber gn = new CGroupNumber();
        gn.setGnId(GN_id);
        gn.setGroupNumber(jTextField1.getText().toString());
        
        GroupNumberServices gns = new GroupNumberServices();
        ResultSet resultSet = gns.tableLoadGN();
        
        
        try {
            while (resultSet.next()) {
                if(resultSet.getString(2).equals(jTextField1.getText().toString())){ 
                    gnAvailibility = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GroupNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill the Group Number!");
        } else if(gnAvailibility){
            JOptionPane.showMessageDialog(null, "All Ready Added Group Number!");
        }else{
            if (jButton1.getText().toLowerCase().contains("add")) {
                 gns.addGN(gn);
                 i = JOptionPane.showConfirmDialog(this, "SucessFully Added.","SucessFull",JOptionPane.DEFAULT_OPTION);
             }else if (jButton1.getText().toLowerCase().contains("edit")){
                 gns.updateGN(gn);
                 i = JOptionPane.showConfirmDialog(this, "Sucessfully Edited.","SucessFull",JOptionPane.DEFAULT_OPTION);
             }
              if(i==0){
                     System.out.println("Sucess Sent");
                     jTabbedPane.remove(0);
                     jTabbedPane.add("Group Number",new GroupNumber(jTabbedPane));
                 }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        GN_id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        String GroupNumber = jTable1.getValueAt(row, 1).toString();
        jLabel2.setText(GroupNumber);
        jTextField1.setText(GroupNumber);
        jButton1.setText("Edit");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        
        if(row >= 0) {
            int GN_id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            int groupNumber = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
           
            
            int i = JOptionPane.showConfirmDialog(this, "Delete "+groupNumber,"Confirm",JOptionPane.YES_NO_OPTION);
            if(i==0){
                GroupNumberServices tagService = new GroupNumberServices();
                tagService.deleteGN(GN_id);
                JOptionPane.showMessageDialog(this, "Group Number Sucessfully Deleted");
            }
           jTabbedPane.remove(0);
           jTabbedPane.add("GroupNumber",new GroupNumber(jTabbedPane));
        }else{
            JOptionPane.showMessageDialog(this,"Please Select the Row");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
         try{
            int x = Integer.parseInt(jTextField1.getText());  
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Only Numbers!");
            jTextField1.setText("");
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
