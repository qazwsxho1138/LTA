package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.ScreenBao;
import com.fym.lta.bao.SearchEngine;
import com.fym.lta.dto.ScreenDto;
import com.fym.lta.dto.SearchDto;

import java.awt.event.KeyEvent;

import java.io.File;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author h.omar
 */
public class MMenu extends javax.swing.JFrame {
    JTextField search;

    // create bao object and get all avaialable screens in one steps
    ScreenBao sBaoObj = new BaoFactory().createScreenBao();
    //ScreenBao screenObj = new BaoFactory().createScreenBao();
    // this method to draw new panel on  our  main frame
    public void switchtoPanel(JPanel x) {
        try {
            x.setBounds(mainPanel.getBounds()); // passing the border
            this.setContentPane(x);
            this.validate();
            this.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Creates new form MMenu */
    public MMenu() {


        initComponents();
        search = new JTextField("  Seach ....  ");
        jMenuBar1.add(search);
    search.setText("search");
                search.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        searchKeyPressed(evt);
                    }
                });
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\welcome.png"));
   
        {
            
                mainPanel = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu5 = new javax.swing.JMenu();
                jMenu3 = new javax.swing.JMenu();
                buildingM_Item = new javax.swing.JMenuItem();
                floorM_Item = new javax.swing.JMenuItem();
                locationTypeM_Item = new javax.swing.JMenuItem();
                departmentM_Item = new javax.swing.JMenuItem();
                courseM_Item = new javax.swing.JMenuItem();
                staffM_Item = new javax.swing.JMenuItem();
                jMenuItem1 = new javax.swing.JMenuItem();
                jMenu2 = new javax.swing.JMenu();
                locationMasterM_Item = new javax.swing.JMenuItem();
                locationManualM_Item = new javax.swing.JMenuItem();
                locationAutoM_Item = new javax.swing.JMenuItem();
                jMenu1 = new javax.swing.JMenu();
                userM_Item = new javax.swing.JMenuItem();
                roleM_Item = new javax.swing.JMenuItem();
                roleScreenM_Item = new javax.swing.JMenuItem();
                report = new javax.swing.JMenu();
                jMenu6 = new javax.swing.JMenu();
                logout = new javax.swing.JMenu();
                jMenu4 = new javax.swing.JMenu();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                mainPanel.setBackground(new java.awt.Color(0, 0, 0));
                mainPanel.setForeground(new java.awt.Color(255, 255, 255));
                mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setBackground(new java.awt.Color(0, 0, 0));
                jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\welcome.png")); // NOI18N
                mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 562, 348));

                jMenuBar1.setBackground(new java.awt.Color(51, 98, 114));
                jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
                jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                jMenu5.setForeground(new java.awt.Color(255, 255, 255));
                jMenu5.setText("Tables         ");
                jMenu5.setActionCommand("Insert New   ");
                jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jMenu5MouseClicked(evt);
                    }
                });
                        if(sBaoObj.getCurrentPermission(15)>=8)
                        {jMenuBar1.add(jMenu5);}

                jMenu3.setForeground(new java.awt.Color(255, 255, 255));
                jMenu3.setText("         Basic Data Management         ");

                buildingM_Item.setText("Building");
                buildingM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buildingM_ItemActionPerformed(evt);
                    }
                });
                         if(sBaoObj.getCurrentPermission(1)>=8)
                         {jMenu3.add(buildingM_Item);}

                floorM_Item.setText("Building Floor");
                floorM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        floorM_ItemActionPerformed(evt);
                    }
                });
                      if(sBaoObj.getCurrentPermission(2)>=8)
                        {jMenu3.add(floorM_Item);}

                locationTypeM_Item.setText("location Type");
                locationTypeM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        locationTypeM_ItemActionPerformed(evt);
                    }
                });
                          if(sBaoObj.getCurrentPermission(3)>=8)
                        { jMenu3.add(locationTypeM_Item);}

                departmentM_Item.setText("Departments");
                departmentM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        departmentM_ItemActionPerformed(evt);
                    }
                });
                            if(sBaoObj.getCurrentPermission(4)>=8)
                        {jMenu3.add(departmentM_Item);}

                courseM_Item.setText("Course");
                courseM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        courseM_ItemActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(5)>=8)
                jMenu3.add(courseM_Item);

                staffM_Item.setText("Employees");
                staffM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        staffM_ItemActionPerformed(evt);
                    }
                });
                            if(sBaoObj.getCurrentPermission(6)>=8)
                jMenu3.add(staffM_Item);

                jMenuItem1.setText("Equipment");
                jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jMenuItem1ActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(7)>=8)
                jMenu3.add(jMenuItem1);

                jMenuBar1.add(jMenu3);

                jMenu2.setForeground(new java.awt.Color(255, 255, 255));
                jMenu2.setText("          Locations and spaces management          ");

                locationMasterM_Item.setText("Locations master screen");
                locationMasterM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        locationMasterM_ItemActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(11)>=8)
                jMenu2.add(locationMasterM_Item);

                locationManualM_Item.setText("Location Manual Assignment");
                locationManualM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        locationManualM_ItemActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(12)>=8)
                jMenu2.add(locationManualM_Item);

                locationAutoM_Item.setText("Location Automatic Assignment");
                locationAutoM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        locationAutoM_ItemActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(13)>=8)
                jMenu2.add(locationAutoM_Item);

                jMenuBar1.add(jMenu2);

                jMenu1.setForeground(new java.awt.Color(255, 255, 255));
                jMenu1.setText("         Authentication and Authorization         ");
                jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jMenu1MouseClicked(evt);
                    }
                });

                userM_Item.setText("User");
                userM_Item.setName("user"); // NOI18N
                userM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        userM_ItemActionPerformed(evt);
                    }
                });
                            if(sBaoObj.getCurrentPermission(8)>=8)
                jMenu1.add(userM_Item);

                roleM_Item.setText("Role");
                roleM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        roleM_ItemActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(9)>=8)
                jMenu1.add(roleM_Item);

                roleScreenM_Item.setText("Role Screens");
                roleScreenM_Item.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        roleScreenM_ItemActionPerformed(evt);
                    }
                });
                            if(sBaoObj.getCurrentPermission(10)>=8)
                jMenu1.add(roleScreenM_Item);

                jMenuBar1.add(jMenu1);

                report.setForeground(new java.awt.Color(255, 255, 255));
                report.setText("         Report         ");
                report.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        reportMouseClicked(evt);
                    }
                });
                        if(controlOnMenu(15))
                jMenuBar1.add(report);

                jMenu6.setForeground(new java.awt.Color(255, 255, 255));
                jMenu6.setText("         Settings         ");
                jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jMenu6MouseClicked(evt);
                    }
                });
                jMenuBar1.add(jMenu6);

                logout.setForeground(new java.awt.Color(255, 255, 255));
                logout.setText("          Log Out         ");
                logout.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        logoutMouseClicked(evt);
                    }
                });
                jMenuBar1.add(logout);

                jMenu4.setForeground(new java.awt.Color(255, 255, 255));
                jMenu4.setText("         Help         ");
                jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jMenu4MouseClicked(evt);
                    }
                });
                jMenu4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jMenu4ActionPerformed(evt);
                    }
                });
                if(sBaoObj.getCurrentPermission(16)>=8)
                jMenuBar1.add(jMenu4);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                );

                pack();
            }
   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        buildingM_Item = new javax.swing.JMenuItem();
        floorM_Item = new javax.swing.JMenuItem();
        locationTypeM_Item = new javax.swing.JMenuItem();
        departmentM_Item = new javax.swing.JMenuItem();
        courseM_Item = new javax.swing.JMenuItem();
        staffM_Item = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        locationMasterM_Item = new javax.swing.JMenuItem();
        locationManualM_Item = new javax.swing.JMenuItem();
        locationAutoM_Item = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        userM_Item = new javax.swing.JMenuItem();
        roleM_Item = new javax.swing.JMenuItem();
        roleScreenM_Item = new javax.swing.JMenuItem();
        report = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\welcome.png")); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 562, 348));

        jMenuBar1.setBackground(new java.awt.Color(51, 98, 114));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Tables         ");
        jMenu5.setActionCommand("Insert New   ");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
		if(controlOnMenu(14))
        jMenuBar1.add(jMenu5);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("         Basic Data Management         ");

        buildingM_Item.setText("Building");
        buildingM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(1))
        jMenu3.add(buildingM_Item);

        floorM_Item.setText("Building Floor");
        floorM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(2))
        jMenu3.add(floorM_Item);

        locationTypeM_Item.setText("location Type");
        locationTypeM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTypeM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(3))
        jMenu3.add(locationTypeM_Item);

        departmentM_Item.setText("Departments");
        departmentM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(4))
        jMenu3.add(departmentM_Item);

        courseM_Item.setText("Course");
        courseM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(5))
        jMenu3.add(courseM_Item);

        staffM_Item.setText("Employees");
        staffM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(6))
        jMenu3.add(staffM_Item);

        jMenuItem1.setText("Equipment");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
		if(controlOnMenu(7))
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("          Locations and spaces management          ");

        locationMasterM_Item.setText("Locations master screen");
        locationMasterM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationMasterM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(11))
        jMenu2.add(locationMasterM_Item);

        locationManualM_Item.setText("Location Manual Assignment");
        locationManualM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationManualM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(12))
        jMenu2.add(locationManualM_Item);

        locationAutoM_Item.setText("Location Automatic Assignment");
        locationAutoM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationAutoM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(13))
        jMenu2.add(locationAutoM_Item);

        jMenuBar1.add(jMenu2);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("         Authentication and Authorization         ");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        userM_Item.setText("User");
        userM_Item.setName("user"); // NOI18N
        userM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(8))
        jMenu1.add(userM_Item);

        roleM_Item.setText("Role");
        roleM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(9))
        jMenu1.add(roleM_Item);

        roleScreenM_Item.setText("Role Screens");
        roleScreenM_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleScreenM_ItemActionPerformed(evt);
            }
        });
		if(controlOnMenu(10))
        jMenu1.add(roleScreenM_Item);

        jMenuBar1.add(jMenu1);

        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("         Report         ");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
		if(controlOnMenu(15))
        jMenuBar1.add(report);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("         Settings         ");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("          Log Out         ");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("         Help         ");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
		if(controlOnMenu(16))
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents
      

    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void courseM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseM_ItemActionPerformed
        switchtoPanel(new CourseScreen());
    }//GEN-LAST:event_courseM_ItemActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
     
    }//GEN-LAST:event_jMenu1MouseClicked

    private void userM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userM_ItemActionPerformed

        switchtoPanel(new UsersScreen()); 
       
    }//GEN-LAST:event_userM_ItemActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        try {
            File file = new File("ab.txt");

            if (file.delete()) {
                // initialize login frame and make it visible
                Login log = new Login();
                log.setVisible(true);
                // dispose the curren farm
                dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_logoutMouseClicked

    private void roleScreenM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleScreenM_ItemActionPerformed
        switchtoPanel(new ScreenRoles()); 
    }//GEN-LAST:event_roleScreenM_ItemActionPerformed

    private void roleM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleM_ItemActionPerformed
        switchtoPanel(new RoleScreen());
    }//GEN-LAST:event_roleM_ItemActionPerformed

    private void staffM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffM_ItemActionPerformed
        switchtoPanel(new StaffScreen()); 
    }//GEN-LAST:event_staffM_ItemActionPerformed

    private void buildingM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingM_ItemActionPerformed
        switchtoPanel(new BuildingScreeen()); 
    }//GEN-LAST:event_buildingM_ItemActionPerformed

    private void locationMasterM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationMasterM_ItemActionPerformed
        switchtoPanel(new LocationMasterScreen()); 
  
       
    }//GEN-LAST:event_locationMasterM_ItemActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        switchtoPanel(new ScheduleInsert());
    }//GEN-LAST:event_jMenu5MouseClicked


    private void locationquicksearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationquicksearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationquicksearchActionPerformed

    private void assigendrolequicksearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigendrolequicksearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assigendrolequicksearchActionPerformed

    private void locationTypeM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTypeM_ItemActionPerformed
        switchtoPanel(new LocationTypeScreen());
    }//GEN-LAST:event_locationTypeM_ItemActionPerformed


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        switchtoPanel(new EquipmentScreen()); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void floorM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorM_ItemActionPerformed
        switchtoPanel(new FloorScreen()); 
    }//GEN-LAST:event_floorM_ItemActionPerformed

    private void locationManualM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationManualM_ItemActionPerformed
        switchtoPanel(new ManualAssignment()); 
    }//GEN-LAST:event_locationManualM_ItemActionPerformed


    private void departmentM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentM_ItemActionPerformed
        switchtoPanel(new DepartmentsScreen());
       
    }//GEN-LAST:event_departmentM_ItemActionPerformed

    private void locationAutoM_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationAutoM_ItemActionPerformed
        switchtoPanel(new AutoAssignment());
    
    }//GEN-LAST:event_locationAutoM_ItemActionPerformed

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        switchtoPanel(new MailScreen()); 
    }//GEN-LAST:event_reportMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        switchtoPanel(new Setting()); 
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
     
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        
    switchtoPanel(new Help());   
    
    }//GEN-LAST:event_jMenu4MouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {
        List<SearchDto> result ;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            result = SearchEngine.SearchList(search.getText());  
            switchtoPanel( new SearchViewr(result) );
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buildingM_Item;
    private javax.swing.JMenuItem courseM_Item;
    private javax.swing.JMenuItem departmentM_Item;
    private javax.swing.JMenuItem floorM_Item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem locationAutoM_Item;
    private javax.swing.JMenuItem locationManualM_Item;
    private javax.swing.JMenuItem locationMasterM_Item;
    private javax.swing.JMenuItem locationTypeM_Item;
    private javax.swing.JMenu logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu report;
    private javax.swing.JMenuItem roleM_Item;
    private javax.swing.JMenuItem roleScreenM_Item;
    private javax.swing.JMenuItem staffM_Item;
    private javax.swing.JMenuItem userM_Item;
    // End of variables declaration//GEN-END:variables


    boolean controlOnMenu(int id) {
        /* for (int i = 0; i < availableScreens.size(); i++) {
            int screenID = availableScreens.get(i).getScreen_id();
            if (screenID == id)
                return true;
        } */
        return false;
    }


}
