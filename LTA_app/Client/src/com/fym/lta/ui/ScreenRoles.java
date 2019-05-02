
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.RoleBao;
import com.fym.lta.bao.ScreenBao;
import com.fym.lta.dto.RoleDto;
import com.fym.lta.dto.ScreenDto;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author h.omar
 */
public class ScreenRoles extends javax.swing.JPanel {
    // creeate bussiness and dto objects
    RoleBao roleBaoObj = new BaoFactory().createRoleBao();
    ScreenBao screenBaoObj = new BaoFactory().createScreenBao();
    List<RoleDto> allRoles = new ArrayList();
    String permission = "view  "; //hold permission value
    List<ScreenDto> selectedScreens = new ArrayList(); //hold the values of selected screens

    /** Creates new form ScreenRoles */
    public ScreenRoles() {
        initComponents();
        allRoles = roleBaoObj.getAll();
        setRolesCombo(allRoles);
        
        viewPermission.setSelected(true);
        viewPermission.setEnabled(false);
        

        // roleID = 11 
        // now one step we will create an object of ScreenBao to know the current permission 
        // String permissionType = new BaoFactory().createScreenBao().getCurrentPermission(11);
        //  Utilities.mandate(ubdateUserBTN,insertUserBTN , deleteUserBTN ,11,permissionType);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        buildingCheckbox = new javax.swing.JCheckBox();
        floorCheckbox = new javax.swing.JCheckBox();
        locationtypeCheckbox = new javax.swing.JCheckBox();
        depaertmentCheckbox = new javax.swing.JCheckBox();
        staffCheckbox = new javax.swing.JCheckBox();
        subjectCheckbox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        usersCheckbox = new javax.swing.JCheckBox();
        roleCheckbox = new javax.swing.JCheckBox();
        ScreenRolesCheckbox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        SpaceOccupancyCheckbox = new javax.swing.JCheckBox();
        ScheduleCheckbox = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        LocationMasterCheckbox = new javax.swing.JCheckBox();
        locationMAssigmentCheckbox = new javax.swing.JCheckBox();
        locationAutoAssigmentCheckbox = new javax.swing.JCheckBox();
        roleCombo = new javax.swing.JComboBox();
        label1 = new java.awt.Label();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        insertPermission = new javax.swing.JCheckBox();
        viewPermission = new javax.swing.JCheckBox();
        updatePermission = new javax.swing.JCheckBox();
        deletePermission = new javax.swing.JCheckBox();
        label2 = new java.awt.Label();
        jPanel8 = new javax.swing.JPanel();
        doneBtn = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Screens", 0, 0, new java.awt.Font("Adobe Arabic", 1, 24))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label3.setText("Basic Data Management");

        buildingCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buildingCheckbox.setText("Building");
        buildingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingCheckboxActionPerformed(evt);
            }
        });

        floorCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        floorCheckbox.setText("Floor");
        floorCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorCheckboxActionPerformed(evt);
            }
        });

        locationtypeCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        locationtypeCheckbox.setText("location Type");
        locationtypeCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtypeCheckboxActionPerformed(evt);
            }
        });

        depaertmentCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        depaertmentCheckbox.setText("Departments");
        depaertmentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depaertmentCheckboxActionPerformed(evt);
            }
        });

        staffCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffCheckbox.setText("Staff");
        staffCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffCheckboxActionPerformed(evt);
            }
        });

        subjectCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subjectCheckbox.setText("Subject");
        subjectCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buildingCheckbox)
                    .addComponent(floorCheckbox)
                    .addComponent(locationtypeCheckbox)
                    .addComponent(depaertmentCheckbox)
                    .addComponent(staffCheckbox)
                    .addComponent(subjectCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buildingCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(floorCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationtypeCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depaertmentCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectCheckbox)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label4.setText("Authentication and Authorization");

        usersCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usersCheckbox.setText("Users");
        usersCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersCheckboxActionPerformed(evt);
            }
        });

        roleCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roleCheckbox.setText("Role");
        roleCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCheckboxActionPerformed(evt);
            }
        });

        ScreenRolesCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ScreenRolesCheckbox.setText("ScreenRoles");
        ScreenRolesCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScreenRolesCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersCheckbox)
                    .addComponent(roleCheckbox)
                    .addComponent(ScreenRolesCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usersCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScreenRolesCheckbox)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setText("Program Outputs");

        SpaceOccupancyCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SpaceOccupancyCheckbox.setText("Space Occupancy");
        SpaceOccupancyCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceOccupancyCheckboxActionPerformed(evt);
            }
        });

        ScheduleCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ScheduleCheckbox.setText("Schedule");
        ScheduleCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpaceOccupancyCheckbox)
                    .addComponent(ScheduleCheckbox))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SpaceOccupancyCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScheduleCheckbox)
                .addGap(0, 120, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        label6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label6.setText("Authentication and Authorization");

        LocationMasterCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LocationMasterCheckbox.setText("Locations master screen");
        LocationMasterCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationMasterCheckboxActionPerformed(evt);
            }
        });

        locationMAssigmentCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        locationMAssigmentCheckbox.setText("Location Manual Assignment");
        locationMAssigmentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationMAssigmentCheckboxActionPerformed(evt);
            }
        });

        locationAutoAssigmentCheckbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        locationAutoAssigmentCheckbox.setText("Location Automatic Assignment");
        locationAutoAssigmentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationAutoAssigmentCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationMasterCheckbox)
                    .addComponent(locationMAssigmentCheckbox)
                    .addComponent(locationAutoAssigmentCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LocationMasterCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationMAssigmentCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationAutoAssigmentCheckbox)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        roleCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText("Role");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        insertPermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertPermission.setText("Insert");
        insertPermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPermissionActionPerformed(evt);
            }
        });

        viewPermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewPermission.setText("View");

        updatePermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatePermission.setText("Update");
        updatePermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePermissionActionPerformed(evt);
            }
        });

        deletePermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletePermission.setText("Delete");
        deletePermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePermissionActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setText(" Permissions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatePermission)
                    .addComponent(deletePermission)
                    .addComponent(insertPermission)
                    .addComponent(viewPermission))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(updatePermission)
                .addGap(18, 18, 18)
                .addComponent(deletePermission)
                .addGap(18, 18, 18)
                .addComponent(insertPermission)
                .addGap(18, 18, 18)
                .addComponent(viewPermission)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        doneBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doneBtn.setText("Done");
        doneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(267, 267, 267))))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents

    private void buildingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(1));
    }//GEN-LAST:event_buildingCheckboxActionPerformed

    private void locationtypeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtypeCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(3));        
    }//GEN-LAST:event_locationtypeCheckboxActionPerformed

    private void depaertmentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depaertmentCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(4));
    }//GEN-LAST:event_depaertmentCheckboxActionPerformed

    private void staffCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(5));
    }//GEN-LAST:event_staffCheckboxActionPerformed

    private void subjectCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(6));        
    }//GEN-LAST:event_subjectCheckboxActionPerformed

    private void usersCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(9));        
    }//GEN-LAST:event_usersCheckboxActionPerformed

    private void roleCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(10));        
    }//GEN-LAST:event_roleCheckboxActionPerformed

    private void ScreenRolesCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScreenRolesCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(11));        
    }//GEN-LAST:event_ScreenRolesCheckboxActionPerformed

    private void SpaceOccupancyCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceOccupancyCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(7));    
    }//GEN-LAST:event_SpaceOccupancyCheckboxActionPerformed

    private void ScheduleCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(8));        
    }//GEN-LAST:event_ScheduleCheckboxActionPerformed

    private void LocationMasterCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationMasterCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(12));        
    }//GEN-LAST:event_LocationMasterCheckboxActionPerformed

    private void locationMAssigmentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationMAssigmentCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(13));        
    }//GEN-LAST:event_locationMAssigmentCheckboxActionPerformed

    private void locationAutoAssigmentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationAutoAssigmentCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(14));        
    }//GEN-LAST:event_locationAutoAssigmentCheckboxActionPerformed

    private void doneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneBtnMouseClicked
       
       
        // now we selectrole selected index is same as
        RoleDto role = allRoles.get(roleCombo.getSelectedIndex());
        role.setPermission(permission);
        // calling bussiness to save 
        if(screenBaoObj.saveScreenRoles(selectedScreens, role))
        {
        JOptionPane.showMessageDialog(this , "Saved successfully") ;     
        }
        else 
        JOptionPane.showMessageDialog(this , "Can't Save") ;     

       
       
    }//GEN-LAST:event_doneBtnMouseClicked

    private void updatePermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePermissionActionPerformed
        permission += " update ";
    }//GEN-LAST:event_updatePermissionActionPerformed

    private void deletePermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePermissionActionPerformed
        permission += " delete ";
    }//GEN-LAST:event_deletePermissionActionPerformed

    private void insertPermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPermissionActionPerformed
        permission += " insert ";
    }//GEN-LAST:event_insertPermissionActionPerformed

    private void floorCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorCheckboxActionPerformed
        selectedScreens.add(new ScreenDto(2));        
    }//GEN-LAST:event_floorCheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LocationMasterCheckbox;
    private javax.swing.JCheckBox ScheduleCheckbox;
    private javax.swing.JCheckBox ScreenRolesCheckbox;
    private javax.swing.JCheckBox SpaceOccupancyCheckbox;
    private javax.swing.JCheckBox buildingCheckbox;
    private javax.swing.JCheckBox deletePermission;
    private javax.swing.JCheckBox depaertmentCheckbox;
    private javax.swing.JButton doneBtn;
    private javax.swing.JCheckBox floorCheckbox;
    private javax.swing.JCheckBox insertPermission;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JCheckBox locationAutoAssigmentCheckbox;
    private javax.swing.JCheckBox locationMAssigmentCheckbox;
    private javax.swing.JCheckBox locationtypeCheckbox;
    private javax.swing.JCheckBox roleCheckbox;
    private javax.swing.JComboBox roleCombo;
    private javax.swing.JCheckBox staffCheckbox;
    private javax.swing.JCheckBox subjectCheckbox;
    private javax.swing.JCheckBox updatePermission;
    private javax.swing.JCheckBox usersCheckbox;
    private javax.swing.JCheckBox viewPermission;
    // End of variables declaration//GEN-END:variables



    // this function just to list the role data in roleCombo
    void setRolesCombo(List<RoleDto> roles) {
        for (int i = 0; i < roles.size(); i++) {
            roleCombo.addItem(roles.get(i).getDescription()); // name not desc
        }

    }

}
