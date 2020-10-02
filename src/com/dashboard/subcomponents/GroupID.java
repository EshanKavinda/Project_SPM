/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.subcomponents;


import com.models.Ays;
import com.services.GroupIdService;
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
public class GroupID extends javax.swing.JPanel {

   private JTabbedPane jTabbedPane;
   private int g_Id = 0;
   private int i = 0;
   
    public GroupID(JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
        GroupIdService service = new GroupIdService();
        jTable4.setModel(DbUtils.resultSetToTableModel(service.tableLoadGID()));
        jTable4.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTable4.getColumnModel().getColumn(1).setHeaderValue("Group ID");
        
//comboBox Ays
        ResultSet resultset = service.tableLoadAys();
        
       try {
           while (resultset.next()) {
               aysCombo.addItem(resultset.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(GroupID.class.getName()).log(Level.SEVERE, null, ex);
       }
//comboBox Pro       
       ResultSet resultsetp = service.tableLoadPro();
       try {
           while (resultsetp.next()) {
               proCombo.addItem(resultsetp.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(GroupID.class.getName()).log(Level.SEVERE, null, ex);
       }
 //ComboBox Group      
       ResultSet resultsetg = service.tableLoadGN();
       try {
           while (resultsetg.next()) {
               gnCombo.addItem(resultsetg.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(GroupID.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        generateBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        aysCombo = new javax.swing.JComboBox<>();
        proCombo = new javax.swing.JComboBox<>();
        gnCombo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Select Academic Year & Semester");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Select Programme");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Select Group Number");

        generateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generateBtn.setText("Generate Group ID");
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(174, 174, 174)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gnCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aysCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(generateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aysCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        
        boolean gAvailibility = false;
        Ays group = new Ays();
        group.setAysId(g_Id);
        group.setAcademicYS(aysCombo.getSelectedItem().toString()+"."+proCombo.getSelectedItem().toString()+"."+gnCombo.getSelectedItem().toString());
        
        GroupIdService gs = new GroupIdService();
        ResultSet resultSet = gs.tableLoadGID();
        
       try {
           while (resultSet.next()) {
               if(resultSet.getString(2).equals(group.getAcademicYS().toString())){
                   gAvailibility = true;
               }
           }
       } catch (SQLException ex) {
           Logger.getLogger(GroupID.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       if(aysCombo.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(null, "Please Select Academic Year!");
       }else if(proCombo.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(null, "Please Select Programme !");
       }else if(gnCombo.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(null, "Please Select Group Number !");
       }else if(gAvailibility){
           JOptionPane.showMessageDialog(null, "All Ready Generated Group ID !");
       }else{
           gs.addGroupID(group);
           i = JOptionPane.showConfirmDialog(this, "SucessFully Generated.","SucessFull",JOptionPane.DEFAULT_OPTION);
           
           if(i==0){
               jTabbedPane.remove(0);
               jTabbedPane.add("GroupID",new GroupID(jTabbedPane));
           }
       }
    }//GEN-LAST:event_generateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        int row = jTable4.getSelectedRow();
        
         if(row >= 0){
            int gId = Integer.parseInt(jTable4.getValueAt(row, 0).toString());
            String groupID = jTable4.getValueAt(row, 1).toString().toUpperCase();
            
            int i = JOptionPane.showConfirmDialog(this, "Delete "+groupID,"Confirm",JOptionPane.YES_NO_OPTION);
            if(i==0){
                GroupIdService service = new GroupIdService();
                service.deleteGroupID(gId);
                 JOptionPane.showMessageDialog(this, "Group ID Sucessfully Deleted");
                
            }
             jTabbedPane.remove(0);
             jTabbedPane.add("GroupID",new GroupID(jTabbedPane));
        }else{
             JOptionPane.showMessageDialog(this,"Please Select the Row");
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int row = jTable4.getSelectedRow();
        String GroupID = jTable4.getValueAt(row, 1).toString();
        jLabel7.setText(GroupID);
        
    }//GEN-LAST:event_jTable4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aysCombo;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton generateBtn;
    private javax.swing.JComboBox<String> gnCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable4;
    private javax.swing.JComboBox<String> proCombo;
    // End of variables declaration//GEN-END:variables
}
