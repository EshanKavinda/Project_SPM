/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.subcomponents;

import com.models.Building;
import com.services.BuildingService;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author ESHAN
 */
public class AddEditBuilding extends javax.swing.JPanel {

    /**
     * Creates new form AddEditBuilding
     */
    private JTabbedPane jTabbedPane;
    private int building_id = 0;
    
    public AddEditBuilding(Building building, JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
        
        if (building.getBuildingName() != null) {
            addEditBuildingBtn.setText("Edit Building");
            
            building_id = building.getBuildingId();
            buildingname.setText(building.getBuildingName());
            buildinglocation.setText(building.getLocation());
            
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

        jPanel1 = new javax.swing.JPanel();
        buildingName = new javax.swing.JLabel();
        buildinglocation = new javax.swing.JTextField();
        addEditBuildingBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buildingname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        buildingName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buildingName.setText("Name");

        buildinglocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildinglocationActionPerformed(evt);
            }
        });

        addEditBuildingBtn.setText("Add Building");
        addEditBuildingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBuildingBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Location");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buildinglocation, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buildingName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buildingname, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addEditBuildingBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buildingName)
                    .addComponent(buildingname, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buildinglocation, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEditBuildingBtn)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addEditBuildingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBuildingBtnActionPerformed
        // TODO add your handling code here:
        Building building = new Building();
        building.setBuildingId(building_id);
        building.setBuildingName(buildingname.getText().toString());
        building.setLocation(buildinglocation.getText().toString());
        
        BuildingService buildingService = new BuildingService();
        
        if (addEditBuildingBtn.getText().toLowerCase().contains("add")) {
            buildingService.addBuilding(building);
        }else{
            if (building_id == 0) {
                System.out.println("Update error");
            }else{
                buildingService.updateBuilding(building);   
            }
            
        }
        
        int i = JOptionPane.showConfirmDialog(this, "Do you want to view all building details" ,"Success", JOptionPane.YES_NO_OPTION);
            if(i==0){
                jTabbedPane.remove(0);
                jTabbedPane.add("View Buildings", new ViewBuilding(jTabbedPane));
            }
        
        

    }//GEN-LAST:event_addEditBuildingBtnActionPerformed

    private void buildinglocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildinglocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildinglocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEditBuildingBtn;
    private javax.swing.JLabel buildingName;
    private javax.swing.JTextField buildinglocation;
    private javax.swing.JTextField buildingname;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}