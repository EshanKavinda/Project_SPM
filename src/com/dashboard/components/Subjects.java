/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.components;

import com.dashboard.subcomponents.AddEditSubjects;
import com.dashboard.subcomponents.ViewSubjects;
import com.models.Subject;
import javax.swing.JTabbedPane;

/**
 *
 * @author ESHAN
 */
public class Subjects extends javax.swing.JPanel {

    /**
     * Creates new form Subjects
     */
    private JTabbedPane jTabbedPane;
    
    public Subjects(JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSubjectsBtn = new javax.swing.JButton();
        viewSubjectsBtn = new javax.swing.JButton();

        addSubjectsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/Add-Folder-icon_1.png"))); // NOI18N
        addSubjectsBtn.setText("ADD SUBJECTS");
        addSubjectsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectsBtnActionPerformed(evt);
            }
        });

        viewSubjectsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/Actions-view-calendar-list-icon.png"))); // NOI18N
        viewSubjectsBtn.setText("VIEW SUBJECTS");
        viewSubjectsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSubjectsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(addSubjectsBtn)
                .addGap(26, 26, 26)
                .addComponent(viewSubjectsBtn)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewSubjectsBtn)
                    .addComponent(addSubjectsBtn))
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSubjectsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectsBtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane.remove(0);
        jTabbedPane.add("Add Subjects", new AddEditSubjects(new Subject(), jTabbedPane));
    }//GEN-LAST:event_addSubjectsBtnActionPerformed

    private void viewSubjectsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSubjectsBtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane.remove(0);
        jTabbedPane.add("View Subjects", new ViewSubjects(jTabbedPane));
    }//GEN-LAST:event_viewSubjectsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjectsBtn;
    private javax.swing.JButton viewSubjectsBtn;
    // End of variables declaration//GEN-END:variables
}
