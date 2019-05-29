
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.LocationTypeBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.dto.LocationTypeDto;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


public class LocationTypeScreen extends javax.swing.JPanel {
    boolean updateFlag = false ;  
    LocationTypeBao LocationTypeListInDatabase = new BaoFactory().createLocationTypeBao();
   
    /**table Structure  */
    private void setTableModel(List<LocationTypeDto> LocationType)
    {
       Object [][] Column = new Object [LocationType.size()][6];
       for(int i =0;i<LocationType.size();i++){
           Column[i][0] = LocationType.get(i).getCode();
           Column[i][1] = LocationType.get(i).getDescription();
           Column[i][2] = LocationType.get(i).getInsertedBy();
           Column[i][3] = LocationType.get(i).getInertion_Date();
           Column[i][4] = LocationType.get(i).getUpdatedBy();
           Column[i][5] = LocationType.get(i).getUpdate_Date();

           
       }
       Table.setModel(new javax.swing.table.DefaultTableModel(Column,new String [] {" Location Type Code " , " Description","Inserted By",
 "  Insertion Date", "Updated By", "Update Date"}));  
    }
    /** Creates new form LocationTypeScreen */
    public LocationTypeScreen() {
        initComponents();
            insertPanel.setVisible(false);
            // screenID = 3
            // now one step we will create an object of ScreenBao to know the current permission
            String permissionType = new BaoFactory().createScreenBao().getCurrentPermission(3);
            Utilities.mandate(updateLocationTypeBTN, insertLocationTypeBTN, deleteLocationTypeBTN, 3, permissionType);
            
        if (LocationTypeListInDatabase.listLocationType()!=null)
            setTableModel(LocationTypeListInDatabase.listLocationType());
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
        Table = new javax.swing.JTable();
        updateLocationTypeBTN = new javax.swing.JButton();
        deleteLocationTypeBTN = new javax.swing.JButton();
        LocationTypeEnteredCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        insertLocationTypeBTN = new javax.swing.JButton();
        searchLocationTypeBTN = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        save1 = new javax.swing.JButton();
        desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        code1 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location Type", 0, 0, new java.awt.Font("Yu Gothic Light", 1, 24))); // NOI18N

        Table.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location Type Code", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setRowHeight(30);
        jScrollPane1.setViewportView(Table);
        Table.getColumnModel().getColumn(0).setHeaderValue("Location Type Code");
        Table.getColumnModel().getColumn(1).setHeaderValue("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        updateLocationTypeBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateLocationTypeBTN.setText("Update");
        updateLocationTypeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLocationTypeBTNActionPerformed(evt);
            }
        });

        deleteLocationTypeBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteLocationTypeBTN.setLabel("Delete");
        deleteLocationTypeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLocationTypeBTNMouseClicked(evt);
            }
        });

        LocationTypeEnteredCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LocationTypeEnteredCode.setText(" ");
        LocationTypeEnteredCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Search");

        insertLocationTypeBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertLocationTypeBTN.setText("Insert  New ");
        insertLocationTypeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertLocationTypeBTNMouseClicked(evt);
            }
        });

        searchLocationTypeBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchLocationTypeBTN.setText("       Search       ");
        searchLocationTypeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLocationTypeBTNMouseClicked(evt);
            }
        });
        searchLocationTypeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLocationTypeBTNActionPerformed(evt);
            }
        });

        insertPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        save1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        desc.setText(" ");
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 4, 148));
        jLabel2.setText("Description:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("Code");

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LocationTypeEnteredCode, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(searchLocationTypeBTN)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateLocationTypeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(deleteLocationTypeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertLocationTypeBTN)))
                        .addGap(18, 18, 18)
                        .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LocationTypeEnteredCode, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(searchLocationTypeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertLocationTypeBTN)
                    .addComponent(updateLocationTypeBTN)
                    .addComponent(deleteLocationTypeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents

    private void updateLocationTypeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLocationTypeBTNActionPerformed
    if(Table.getSelectedRow()>=0)
    {
    updateFlag = true ;
    jLabel3.setVisible(false);
    code1.setVisible(false);
    }
    else JOptionPane.showMessageDialog(this, "select a Location Type to delete");     
    }//GEN-LAST:event_updateLocationTypeBTNActionPerformed

    private void deleteLocationTypeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLocationTypeBTNMouseClicked
    insertPanel.setVisible(false);
   if(Table.getSelectedRow()>=0)
   {
        
        String Code = Table.getValueAt(Table.getSelectedRow(), 0).toString(); // get the LocationType code
        LocationTypeDto SelectedLocationType = new LocationTypeDto(); // selected LocationType you wanna delete
        SelectedLocationType.setCode(Code);
                 int msg=  JOptionPane.showConfirmDialog(this, "are you sure you need to delete ");
                                if (msg == JOptionPane.OK_OPTION)
                                { //the result would be "remove the selected row and check the returned value to tell the user if the delete is done or not"
               if(LocationTypeListInDatabase.deleteLocationType(SelectedLocationType)){
                 JOptionPane.showMessageDialog(this, "the selected LocationType is deleted Successfully  ");
                 //refresh the table data..
                     setTableModel(LocationTypeListInDatabase.listLocationType());
                     
                 } else
                     JOptionPane.showMessageDialog(this, " this LocationType can't be deleteted ");
                                }
    }
    else JOptionPane.showMessageDialog(this, "select a Location Type to delete");     
    }//GEN-LAST:event_deleteLocationTypeBTNMouseClicked

    private void insertLocationTypeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLocationTypeBTNMouseClicked
    updateFlag = false ;
    insertPanel.setVisible(true);
    code1.setText(null);
    desc.setText(null);
    jLabel3.setVisible(true);
    code1.setVisible(true);
    }//GEN-LAST:event_insertLocationTypeBTNMouseClicked

    private void searchLocationTypeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLocationTypeBTNMouseClicked
    try{
        insertPanel.setVisible(true);
    String Code = null; // hold entered data
    if (LocationTypeEnteredCode.getText()!= null )
        
    setTableModel(LocationTypeListInDatabase.SearchLocationType(LocationTypeEnteredCode.getText())) ;
    else
    setTableModel(LocationTypeListInDatabase.listLocationType()) ;
    }catch (Exception e) {
    // TODO: Add catch code
    e.printStackTrace();
    }
    }//GEN-LAST:event_searchLocationTypeBTNMouseClicked

    private void searchLocationTypeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLocationTypeBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchLocationTypeBTNActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
     
        LocationTypeDto LocationType = new LocationTypeDto();
        LocationType.setDescription(desc.getText());

        if(updateFlag)
        {   LocationType.setUpdate_Date(new Date(System.currentTimeMillis()));
            LocationType.setUpdatedBy(LoginEngine.currentUser);
            LocationType.setCode( Table.getValueAt(Table.getSelectedRow(), 0).toString());
        }
        else{
            LocationType.setUpdatedBy(LoginEngine.currentUser);
            LocationType.setInsertedBy(LoginEngine.currentUser);
            LocationType.setUpdate_Date(new Date(System.currentTimeMillis()));
            LocationType.setInertion_Date(new Date(System.currentTimeMillis()));
            LocationType.setCode(code1.getText());
        }

        if (LocationTypeListInDatabase.save(LocationType))
        {JOptionPane.showMessageDialog(this , " saved ");
         setTableModel(LocationTypeListInDatabase.listLocationType()) ;
        }
        else JOptionPane.showMessageDialog(this , "error can't save ");
    }//GEN-LAST:event_save1ActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LocationTypeEnteredCode;
    private javax.swing.JTable Table;
    private javax.swing.JTextField code1;
    private javax.swing.JButton deleteLocationTypeBTN;
    private javax.swing.JTextField desc;
    private javax.swing.JButton insertLocationTypeBTN;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save1;
    private javax.swing.JButton searchLocationTypeBTN;
    private javax.swing.JButton updateLocationTypeBTN;
    // End of variables declaration//GEN-END:variables

}
