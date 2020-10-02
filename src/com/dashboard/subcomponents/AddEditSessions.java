/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboard.subcomponents;

import com.models.Session;
import com.services.GroupNumberServices;
import com.services.LecturerService;
import com.services.SessionService;
import com.services.SubjectService;
import com.services.TagServices;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author ESHAN
 */
public class AddEditSessions extends javax.swing.JPanel {

    private JTabbedPane jTabbedPane;
    private int sessionid = 0;
    
    public AddEditSessions(Session session, JTabbedPane jTabbedPane) {
        initComponents();
        this.jTabbedPane = jTabbedPane;
        
        LecturerService lecturerService = new LecturerService();
        SubjectService subjectService = new SubjectService();
        TagServices tagServices = new TagServices();
        GroupNumberServices groupNumberServices = new GroupNumberServices();
        
        ResultSet resultSetlecturer = lecturerService.tableLoadLecturers();
        ResultSet resultSetsubject = subjectService.tableLoadSubjects();
        ResultSet resultSettags = tagServices.tableLoadTags();
        ResultSet resultSetGroupId = groupNumberServices.tableLoadGN_Generated();
        ResultSet resultSetSubGroupId = groupNumberServices.tableLoadSGN_Generated();
        
        try {
            lecturer_jCombobox.addItem("-Select-");
            subject_jCombobox.addItem("-select-");
            tag_jCombobox.addItem("-select-");
            groupId_jCombobox.addItem("-select-");
            while (resultSetlecturer.next()) {
                lecturer_jCombobox.addItem(resultSetlecturer.getString("name"));
            }
            while (resultSetsubject.next()) {
                subject_jCombobox.addItem(resultSetsubject.getString("subject_name")+" ("+resultSetsubject.getString("subject_code")+")");
            }
            while (resultSettags.next()) {
                tag_jCombobox.addItem(resultSettags.getString("tag_type"));
            }
            
            groupId_jCombobox.addItem("----------------Group IDs------------------");
            while (resultSetGroupId.next()) {
                groupId_jCombobox.addItem(resultSetGroupId.getString("groupid"));
            }
            groupId_jCombobox.addItem("--------------Sub Group IDs----------------");
            while (resultSetSubGroupId.next()) {
                groupId_jCombobox.addItem(resultSetSubGroupId.getString("subgroupid"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddEditSessions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (session.getLecturers() != null) {
            addSessionsBtn.setText("Edit Session");
            sessionid = session.getSessionId();
            lecturers_jTextFeild.setText(session.getLecturers());
            subject_jCombobox.setSelectedItem(session.getSubject());
            tag_jCombobox.setSelectedItem(session.getTag());
            groupId_jCombobox.setSelectedItem(session.getGroup());
            studentCount_textfeild.setText(String.valueOf(session.getNumberOfStudents()));
            duration_jTextfeild.setText(String.valueOf(session.getDuration()));
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        groupId_jCombobox = new javax.swing.JComboBox<>();
        tag_jCombobox = new javax.swing.JComboBox<>();
        studentCount_textfeild = new javax.swing.JTextField();
        duration_jTextfeild = new javax.swing.JTextField();
        lecturer_jCombobox = new javax.swing.JComboBox<>();
        subject_jCombobox = new javax.swing.JComboBox<>();
        lecturers_jTextFeild = new javax.swing.JTextField();
        clear_lecturer_text_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addSessionsBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Group/Sub Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tag");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Subject");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lecturer(s)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Duration");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Student Count");

        studentCount_textfeild.setAutoscrolls(false);
        studentCount_textfeild.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        studentCount_textfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCount_textfeildActionPerformed(evt);
            }
        });
        studentCount_textfeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentCount_textfeildKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentCount_textfeildKeyReleased(evt);
            }
        });

        duration_jTextfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration_jTextfeildActionPerformed(evt);
            }
        });
        duration_jTextfeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                duration_jTextfeildKeyReleased(evt);
            }
        });

        lecturer_jCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturer_jComboboxActionPerformed(evt);
            }
        });

        lecturers_jTextFeild.setEditable(false);
        lecturers_jTextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturers_jTextFeildActionPerformed(evt);
            }
        });

        clear_lecturer_text_btn.setText("X");
        clear_lecturer_text_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_lecturer_text_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tag_jCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupId_jCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentCount_textfeild, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(duration_jTextfeild)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subject_jCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lecturer_jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lecturers_jTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(clear_lecturer_text_btn)))))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lecturer_jCombobox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(clear_lecturer_text_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecturers_jTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(subject_jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tag_jCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupId_jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentCount_textfeild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration_jTextfeild, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(100, 100, 100))
        );

        addSessionsBtn.setText("Add Sessions");
        addSessionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSessionsBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addSessionsBtn)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(addSessionsBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1137, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void studentCount_textfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCount_textfeildActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_studentCount_textfeildActionPerformed

    private void duration_jTextfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration_jTextfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration_jTextfeildActionPerformed

    private void addSessionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSessionsBtnActionPerformed
        // TODO add your handling code here:
        
        if (lecturers_jTextFeild.getText().toString().equals("") || subject_jCombobox.getSelectedIndex() == 0
                || tag_jCombobox.getSelectedIndex() == 0 || groupId_jCombobox.getSelectedIndex() == 0
                || studentCount_textfeild.getText().toString().equals("")
                || duration_jTextfeild.getText().toString().equals("")) {
            
            showAlertDialog("error", "Please fill all feilds");
        }else{
            Session session = new Session();
            session.setSessionId(sessionid);
            session.setLecturers(lecturers_jTextFeild.getText().toString());
            session.setSubject(subject_jCombobox.getSelectedItem().toString());
            session.setTag(tag_jCombobox.getSelectedItem().toString());
            session.setGroup(groupId_jCombobox.getSelectedItem().toString());
            session.setNumberOfStudents(Integer.parseInt(studentCount_textfeild.getText()));
            session.setDuration(Integer.parseInt(duration_jTextfeild.getText()));

            SessionService service = new SessionService();

            if (addSessionsBtn.getText().toLowerCase().contains("add")) {
                if (service.addSession(session)) {
                    showAlertDialog("success", "Session successfully added! Do you want to view all sessions");
                    clearfeilds();
                }else{
                    showAlertDialog("error", "Session added failed! please try again");
                }
            }else{
                if (sessionid == 0) {
                    showAlertDialog("error", "Session update error! please try again");
                }else{
                    if (service.updateSession(session)) {
                        showAlertDialog("success", "Session successfully updated! Do you want to view all sessions");
                        clearfeilds();
                    }else{
                        showAlertDialog("error", "Session update failed! please try again");
                    }

                }
            }
        }

        


    }//GEN-LAST:event_addSessionsBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        jTabbedPane.remove(0);
//        jTabbedPane.add("Subjects", new Subjects(jTabbedPane));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lecturer_jComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturer_jComboboxActionPerformed
        // TODO add your handling code here:
        if (lecturer_jCombobox.getSelectedIndex() == 0) {
            System.out.println("---------------");
        }else{
            
            String lecName = lecturer_jCombobox.getSelectedItem().toString();
            
            if (lecturers_jTextFeild.getText().contains(lecName)) {
                JOptionPane.showMessageDialog(null, "Lecturer already added");
            }else{
                if (lecturers_jTextFeild.getText().equals("")) {
                    lecturers_jTextFeild.setText(lecName);
                }else{
                    lecturers_jTextFeild.setText(lecturers_jTextFeild.getText()+", "+lecName);
                }
            }
            lecturer_jCombobox.setSelectedIndex(0);    
        }
    }//GEN-LAST:event_lecturer_jComboboxActionPerformed

    private void clear_lecturer_text_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_lecturer_text_btnActionPerformed
        // TODO add your handling code here:
        lecturers_jTextFeild.setText("");
    }//GEN-LAST:event_clear_lecturer_text_btnActionPerformed

    private void studentCount_textfeildKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentCount_textfeildKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentCount_textfeildKeyPressed

    private void studentCount_textfeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentCount_textfeildKeyReleased
        // TODO add your handling code here:
        try {
            int x = Integer.parseInt(studentCount_textfeild.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid student count");
            studentCount_textfeild.setText("");
        }
    }//GEN-LAST:event_studentCount_textfeildKeyReleased

    private void duration_jTextfeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duration_jTextfeildKeyReleased
        // TODO add your handling code here:
        try {
            int x = Integer.parseInt(duration_jTextfeild.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid duration");
            duration_jTextfeild.setText("");
        }
    }//GEN-LAST:event_duration_jTextfeildKeyReleased

    private void lecturers_jTextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturers_jTextFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecturers_jTextFeildActionPerformed

    public void showAlertDialog(String type, String msg){
        if (type.equals("success")) {
            int i = JOptionPane.showConfirmDialog(this, msg ,"Success", JOptionPane.YES_NO_OPTION);
            if(i==0){
                jTabbedPane.remove(0);
                jTabbedPane.add("View Sessions", new ViewSessions(jTabbedPane));
            }
        }else if (type.equals("error")){
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    
    public void clearfeilds(){
        lecturers_jTextFeild.setText("");
        lecturer_jCombobox.setSelectedIndex(0);
        subject_jCombobox.setSelectedIndex(0);
        tag_jCombobox.setSelectedIndex(0);
        groupId_jCombobox.setSelectedIndex(0);
        studentCount_textfeild.setText("");
        duration_jTextfeild.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSessionsBtn;
    private javax.swing.JButton clear_lecturer_text_btn;
    private javax.swing.JTextField duration_jTextfeild;
    private javax.swing.JComboBox<String> groupId_jCombobox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> lecturer_jCombobox;
    private javax.swing.JTextField lecturers_jTextFeild;
    private javax.swing.JTextField studentCount_textfeild;
    private javax.swing.JComboBox<String> subject_jCombobox;
    private javax.swing.JComboBox<String> tag_jCombobox;
    // End of variables declaration//GEN-END:variables
}
