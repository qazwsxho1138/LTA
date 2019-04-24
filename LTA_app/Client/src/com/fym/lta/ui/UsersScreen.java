
package com.fym.lta.ui;

import com.fym.lta.Bao.BaoFactory;
import com.fym.lta.Bao.UserBao;
import com.fym.lta.dto.UserDto;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author h.omar
 */
public class UsersScreen extends javax.swing.JPanel {
    private UserBao user = new BaoFactory().CreateUserBao();
    private List<UserDto> searchReturnedUsers;
    private int selectedUserid = 0;
    private boolean searchFlag;

    /** Creates new form Users_search */
    public UsersScreen() {

        initComponents();
        userTableReset(user.listAll());
    }

    // this method to create a popup menu
    public static void createPopupMenu(JPanel panel) {
        JFrame poupInsert = new JFrame();
        poupInsert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        poupInsert.setContentPane(panel);
        poupInsert.setSize(800, 900); // setting size
        poupInsert.setVisible(true);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        ubdateUserBTN = new javax.swing.JButton();
        deleteUserBTN = new javax.swing.JButton();
        userEnteredName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        insertUserBTN = new javax.swing.JButton();
        searchUserBTN = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users\n", 0, 0, new java.awt.Font("Adobe Arabic", 1, 24))); // NOI18N

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Login Username", "Role", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usersTable.setRowHeight(20);
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ubdateUserBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ubdateUserBTN.setText("Update");
        ubdateUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubdateUserBTNActionPerformed(evt);
            }
        });

        deleteUserBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteUserBTN.setLabel("Delete");
        deleteUserBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserBTNMouseClicked(evt);
            }
        });
        deleteUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBTNActionPerformed(evt);
            }
        });

        userEnteredName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userEnteredName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userEnteredNameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter User Email");

        insertUserBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertUserBTN.setText("Insert  New User");
        insertUserBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertUserBTNMouseClicked(evt);
            }
        });

        searchUserBTN.setText("Search");
        searchUserBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchUserBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userEnteredName, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(searchUserBTN))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ubdateUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(deleteUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(insertUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEnteredName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ubdateUserBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insertUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }//GEN-END:initComponents

    private void ubdateUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubdateUserBTNActionPerformed
        if (usersTable.getSelectedRow() >= 0) {
            UserInsertUpdate uIScreen = new UserInsertUpdate();
            uIScreen.setUserUpdateId(Integer.parseInt(usersTable.getValueAt(usersTable.getSelectedRow(),
                                                                            4).toString())); //Passa ID
            uIScreen.setUserUpdateEmail(usersTable.getValueAt(usersTable.getSelectedRow(),
                                                              1).toString()); // pass the Email
            createPopupMenu(uIScreen);
        } else {
            JOptionPane.showOptionDialog(null, "You Should Select A user to Update ", "User Updaete ",
                                         JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    
    }//GEN-LAST:event_ubdateUserBTNActionPerformed

    private void searchUserBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchUserBTNMouseClicked

        // this part still not handeled good

        UserDto searchUser = null;
       

 
        if ( userEnteredName.getText()!= null) {
            searchUser = new UserDto();
            searchUser.setEmail( userEnteredName.getText());
            searchReturnedUsers = user.seachForUsers(searchUser);
        }

        else {
            searchReturnedUsers = user.listAll();
        } // store the result of our search

        userTableReset(searchReturnedUsers);
     

    }//GEN-LAST:event_searchUserBTNMouseClicked

    private void deleteUserBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserBTNMouseClicked
        if (usersTable.getSelectedRow() >= 0) {
            selectedUserid = Integer.parseInt(usersTable.getValueAt(usersTable.getSelectedRow(), 4).toString());
            UserDto selectedUser_Delete = new UserDto(); // this user i want to delete
            selectedUser_Delete.setuser_Id(selectedUserid);
            selectedUser_Delete.setEmail(usersTable.getValueAt(usersTable.getSelectedRow(), 1).toString());
            // call business to delete
            // don't forget you need to update the users table and remove this record
            // and check the returned value to tell the user if the delete is done or not
            if (user.deleteUser(selectedUser_Delete)) {
                int msgRes =
                    JOptionPane.showOptionDialog(null, "Deleted Successfully ", "User Deleting ",
                                                 JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                                 null, null);

                if (msgRes == JOptionPane.OK_OPTION) {
                    userTableReset(user.seachForUsers(null));
                    usersTable.repaint();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Can not delete may be deleted using another user ");
            }
        }


        else {
            JOptionPane.showMessageDialog(this, "you should select a user first to delete  ");
        }
    }//GEN-LAST:event_deleteUserBTNMouseClicked

    private void insertUserBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertUserBTNMouseClicked
        createPopupMenu(new UserInsertUpdate());
        
    }//GEN-LAST:event_insertUserBTNMouseClicked

    private void deleteUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserBTNActionPerformed

    private void userEnteredNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userEnteredNameKeyTyped
       
        searchFlag = true; 
     
    }//GEN-LAST:event_userEnteredNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteUserBTN;
    private javax.swing.JButton insertUserBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchUserBTN;
    private javax.swing.JButton ubdateUserBTN;
    private javax.swing.JTextField userEnteredName;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
    
    public void userTableReset(List<UserDto> users) {
        int userRoleid;

        Object[][] usersArr = new Object[users.size()][5];

        for (int i = 0; i < users.size(); i++) {
            usersArr[i][0] =
                users.get(i).getFName() + " " + users.get(i).getSName() + " " + users.get(i).getLName() + " " +
                users.get(i).getFamilyName();
            usersArr[i][1] = users.get(i).getEmail();
            usersArr[i][2] = users.get(i).getUserName();
            userRoleid = users.get(i).getUserRole().getRole_id();

            if (userRoleid == 1)
                usersArr[i][3] = "Role Employee";
            else
                usersArr[i][3] = "Admin";

            usersArr[i][4] = users.get(i).getuser_Id();
        }
        usersTable.setModel(new javax.swing.table.DefaultTableModel(usersArr, new String[] {
                                                                    "Name", "Email", "Login Username", "Role", "ID"
            }));
    }


}
