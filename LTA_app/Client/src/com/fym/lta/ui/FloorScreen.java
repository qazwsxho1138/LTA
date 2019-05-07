
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.FloorBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.dto.FloorDto;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


/**
 *
 * @author
 */
public class FloorScreen extends javax.swing.JPanel 
{
    FloorBao FloorListInDatabase = new BaoFactory().createFloorBao();
  boolean updateFlag ;

    /**table Structure  */    
    private void setTableModel(List<FloorDto> Floor)
    {
        Object [][] Column = new Object [Floor.size()][4];
        for(int i =0;i<Floor.size();i++){
            Column[i][0] = Floor.get(i).getCode();
            Column[i][1] = Floor.get(i).getDescription();          
              
        }
        floorTable.setModel(new javax.swing.table.DefaultTableModel(Column,new String [] {
                " Code " , " Description " }));  
    }
    

    /** Creates new form FloorScreen */
    public  FloorScreen(){
        initComponents();
        //get all Floors data from database...
        if (FloorListInDatabase.listFloor() != null) 
            setTableModel(FloorListInDatabase.listFloor());

        insertPanel.setVisible(false);
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
        floorTable = new javax.swing.JTable();
        insertFloorBTN = new javax.swing.JButton();
        updateFloorBTN = new javax.swing.JButton();
        deleteFloorBTN = new javax.swing.JButton();
        FloorEnteredCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchFloorBTN = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        code = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Building Floor", 0, 0, new java.awt.Font("Yu Gothic UI", 1, 24))); // NOI18N

        floorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        floorTable.setRowHeight(20);
        jScrollPane1.setViewportView(floorTable);
        floorTable.getColumnModel().getColumn(0).setHeaderValue("Code");
        floorTable.getColumnModel().getColumn(1).setHeaderValue("Description");

        insertFloorBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertFloorBTN.setText("Insert  New");
        insertFloorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertFloorBTNActionPerformed(evt);
            }
        });

        updateFloorBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateFloorBTN.setText("Update");
        updateFloorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFloorBTNActionPerformed(evt);
            }
        });

        deleteFloorBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteFloorBTN.setLabel("Delete");
        deleteFloorBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteFloorBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(updateFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(insertFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        FloorEnteredCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Enter Floor Code :");

        searchFloorBTN.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        searchFloorBTN.setText("Search");
        searchFloorBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFloorBTNMouseClicked(evt);
            }
        });

        insertPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        code.setText(" ");

        codeLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        codeLabel.setForeground(new java.awt.Color(51, 0, 153));
        codeLabel.setText("Code:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 4, 148));
        jLabel4.setText("Choose Department ");

        desc.setText(" ");
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 4, 148));
        jLabel6.setText("Description:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 4, 148));
        jLabel7.setText("Choose Building");

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(insertPanelLayout.createSequentialGroup()
                            .addComponent(codeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(insertPanelLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(439, Short.MAX_VALUE)))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(insertPanelLayout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FloorEnteredCode, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(searchFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FloorEnteredCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFloorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(insertPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }//GEN-END:initComponents




    private void updateFloorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFloorBTNActionPerformed
    codeLabel.setVisible(false) ; 
    code.setVisible(false);
    
    if(floorTable.getSelectedRow()>=0)
    {
     try{
         
        insertPanel.setVisible(true);
         updateFlag = true  ; 
    
    }catch(Exception e){
        e.printStackTrace();
    }}else
    JOptionPane.showMessageDialog(this, " you may forgot to select the floor you wanna update ");
    
    }//GEN-LAST:event_updateFloorBTNActionPerformed

    private void deleteFloorBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteFloorBTNMouseClicked
    /*to delete selected row  */  
         try{

             insertPanel.setVisible(false);
    String code = floorTable.getValueAt(floorTable.getSelectedRow(), 0).toString(); // get the building code
    FloorDto SelectedFloor = new FloorDto(); // selected building you wanna delete
    SelectedFloor.setCode(code);
         //the result would be "remove the selected row and check the returned value to tell the user if the delete is done or not"
           if(FloorListInDatabase.deleteFloor(SelectedFloor)){
             JOptionPane.showMessageDialog(this, "the selected building is deleted Successfully  ");
             //refresh the table data..
                 setTableModel(FloorListInDatabase.listFloor());

             } else
                 JOptionPane.showMessageDialog(this, " this floor can't be deleteted ");
         }catch(Exception e){
             e.printStackTrace();
             }
    
    }//GEN-LAST:event_deleteFloorBTNMouseClicked

    private void insertFloorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertFloorBTNActionPerformed
    insertPanel.setVisible(true);
     updateFlag = false  ; 
    codeLabel.setVisible(false) ; 
    code.setVisible(false);
    code.setText(null);
    desc.setText(null);
    }//GEN-LAST:event_insertFloorBTNActionPerformed

    private void searchFloorBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFloorBTNMouseClicked

    try{
        insertPanel.setVisible(false);
    String code = null; // hold entered data
    if (FloorEnteredCode.getText()!= null )
        
    setTableModel(FloorListInDatabase.SearchFloor(FloorEnteredCode.getText())) ;
    else
    setTableModel( FloorListInDatabase.listFloor()) ;
    }catch (Exception e) {
    e.printStackTrace();
    }
      
    }//GEN-LAST:event_searchFloorBTNMouseClicked

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        FloorDto Floor = new FloorDto();
      
        Floor.setDescription(desc.getText());

        if(updateFlag)
        {   Floor.setUpdate_Date(new Date(System.currentTimeMillis()));
            Floor.setUpdatedBy(LoginEngine.currentUser);
            Floor.setCode(floorTable.getValueAt(floorTable.getSelectedRow(), 0).toString());
        }
        else{
            Floor.setUpdatedBy(LoginEngine.currentUser);
            Floor.setInsertedBy(LoginEngine.currentUser);
            Floor.setUpdate_Date(new Date(System.currentTimeMillis()));
            Floor.setInertion_Date(new Date(System.currentTimeMillis()));
            Floor.setCode(code.getText());
        }

        if (FloorListInDatabase.save(Floor))
        { JOptionPane.showMessageDialog(this , " saved ");
            setTableModel(FloorListInDatabase.listFloor());
            insertPanel.setVisible(false);
        }
        else JOptionPane.showMessageDialog(this , "error can't save ");
    }//GEN-LAST:event_saveMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FloorEnteredCode;
    private javax.swing.JTextField code;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JButton deleteFloorBTN;
    private javax.swing.JTextField desc;
    private javax.swing.JTable floorTable;
    private javax.swing.JButton insertFloorBTN;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JButton searchFloorBTN;
    private javax.swing.JButton updateFloorBTN;
    // End of variables declaration//GEN-END:variables
}
