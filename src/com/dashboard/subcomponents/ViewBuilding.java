/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.subcomponents;

import com.models.Building;
import com.services.BuildingService;
import com.services.RoomService;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ESHAN
 */
public class ViewBuilding extends javax.swing.JPanel {

    /**
     * Creates new form ViewBuilding
     */
    private JTabbedPane jTabbedPane;
    
    public ViewBuilding(JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
        BuildingService bs = new BuildingService();
        building_jTable.setModel(DbUtils.resultSetToTableModel(bs.tableLoadbuilding()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        building_jTable = new javax.swing.JTable();
        deleteBuildingBtn = new javax.swing.JButton();
        editBuildingBtn = new javax.swing.JButton();

        building_jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(building_jTable);

        deleteBuildingBtn.setText("Delete");
        deleteBuildingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBuildingBtnActionPerformed(evt);
            }
        });

        editBuildingBtn.setText("Edit");
        editBuildingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBuildingBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteBuildingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBuildingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(editBuildingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBuildingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBuildingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBuildingBtnActionPerformed
        // TODO add your handling code here:
        int row = building_jTable.getSelectedRow();
        
        if (row >= 0) {
            int bid = (int) building_jTable.getValueAt(row, 0);
            String bname = building_jTable.getValueAt(row, 1).toString();
            String blocation = building_jTable.getValueAt(row, 2).toString();
            
            Building building = new Building(bname, blocation);
            building.setBuildingId(bid);
            
            jTabbedPane.remove(0);
            jTabbedPane.add("Edit Building Details", new AddEditBuilding(building, jTabbedPane));
        }else{
            JOptionPane.showMessageDialog(this, "Please select row!");
        }
        
        
    }//GEN-LAST:event_editBuildingBtnActionPerformed

    private void deleteBuildingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBuildingBtnActionPerformed
        // TODO add your handling code here:
        int row = building_jTable.getSelectedRow();
        
        if (row >= 0) {
            int bid = Integer.parseInt(building_jTable.getValueAt(row, 0).toString());

            int i = JOptionPane.showConfirmDialog(this, "Delete selected building" ,"Confirm", JOptionPane.YES_NO_OPTION);
            if(i==0){
                BuildingService bs = new BuildingService();
                bs.deleteBuilding(bid);
                JOptionPane.showMessageDialog(this, "Building delete successful");
            }
        //refresh table
            jTabbedPane.remove(0);
            jTabbedPane.add("View Buildings", new ViewBuilding(jTabbedPane));
        }else{
            JOptionPane.showMessageDialog(this, "Please select row!");
        }
    }//GEN-LAST:event_deleteBuildingBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable building_jTable;
    private javax.swing.JButton deleteBuildingBtn;
    private javax.swing.JButton editBuildingBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
