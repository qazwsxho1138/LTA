
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.BuildingBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.dto.BuildingDto;

import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class BuildingScreeen extends javax.swing.JPanel {

    BuildingBao buildingBaoObject = new BaoFactory().createBuildingBao();
    boolean updateFlag = false;

    List<BuildingDto> buildings = new ArrayList<>();

    /** Creates new form Building */
    public BuildingScreeen() {
        initComponents();
        if (buildingBaoObject.listBuilding() != null)
            buildingTableReset(buildingBaoObject.listBuilding());
        insertPanel.setVisible(false);
        saveListBtn.setVisible(false);
        // screenID = 1
        // now one step we will create an object of ScreenBao to know the current permission
        int permissionType = new BaoFactory().createScreenBao().getCurrentPermission(1);
        Utilities.mandate(ubdateBuildingBTN, insertBuildingBTN, deleteBuildingBTN, 1,
                          Utilities.convertTOBase2(permissionType));
      
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\building.png")); // NOI18N

        insertBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\insert.png")); // NOI18N
        ubdateBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\update.png")); // NOI18N
        searchBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search.png")); // NOI18N
        deleteBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\delete.png")); // NOI18N
      
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search2.png")); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N
        saveListBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        popup = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        bPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buildingTable = new javax.swing.JTable();
        ubdateBuildingBTN = new javax.swing.JButton();
        deleteBuildingBTN = new javax.swing.JButton();
        BuildingEnteredCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        insertBuildingBTN = new javax.swing.JButton();
        searchBuildingBTN = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        saveListBtn = new javax.swing.JButton();

        jMenuItem1.setText("Print");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem1);

        jMenuItem2.setText("Expor to PDF");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem2);

        jMenuItem3.setText("Export to XLX");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem3);

        jMenuItem4.setText("Hide Insertion Panel");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem4);

        jMenuItem5.setText("Import Sheet");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem5);

        setBackground(new java.awt.Color(0, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bPanel.setBackground(new java.awt.Color(0, 0, 0));
        bPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 240, 240)), "Buildings", 0, 0, new java.awt.Font("Tekton Pro Cond", 1, 36), new java.awt.Color(204, 240, 240))); // NOI18N

        buildingTable.setBackground(new java.awt.Color(51, 98, 114));
        buildingTable.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        buildingTable.setForeground(new java.awt.Color(255, 255, 255));
        buildingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        buildingTable.setRowHeight(25);
        buildingTable.setSelectionBackground(new java.awt.Color(22, 224, 236));
        jScrollPane1.setViewportView(buildingTable);
        buildingTable.getColumnModel().getColumn(0).setHeaderValue("Code");
        buildingTable.getColumnModel().getColumn(1).setHeaderValue("Description");

        javax.swing.GroupLayout bPanelLayout = new javax.swing.GroupLayout(bPanel);
        bPanel.setLayout(bPanelLayout);
        bPanelLayout.setHorizontalGroup(
            bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        bPanelLayout.setVerticalGroup(
            bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        add(bPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 550, 290));
        bPanel.getAccessibleContext().setAccessibleName("Building ");

        ubdateBuildingBTN.setBackground(new java.awt.Color(0, 0, 0));
        ubdateBuildingBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ubdateBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\update.png")); // NOI18N
        ubdateBuildingBTN.setBorderPainted(false);
        ubdateBuildingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubdateBuildingBTNActionPerformed(evt);
            }
        });
        add(ubdateBuildingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, 30));

        deleteBuildingBTN.setBackground(new java.awt.Color(0, 0, 0));
        deleteBuildingBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\delete.png")); // NOI18N
        deleteBuildingBTN.setBorderPainted(false);
        deleteBuildingBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBuildingBTNMouseClicked(evt);
            }
        });
        add(deleteBuildingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 80, 30));

        BuildingEnteredCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuildingEnteredCode.setBorder(null);
        BuildingEnteredCode.setMaximumSize(new java.awt.Dimension(2, 20));
        BuildingEnteredCode.setMinimumSize(new java.awt.Dimension(2, 20));
        BuildingEnteredCode.setPreferredSize(new java.awt.Dimension(2, 20));
        add(BuildingEnteredCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search2.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, 100, 20));

        insertBuildingBTN.setBackground(new java.awt.Color(0, 0, 0));
        insertBuildingBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\insert.png")); // NOI18N
        insertBuildingBTN.setBorderPainted(false);
        insertBuildingBTN.setMaximumSize(new java.awt.Dimension(110, 25));
        insertBuildingBTN.setMinimumSize(new java.awt.Dimension(110, 25));
        insertBuildingBTN.setPreferredSize(new java.awt.Dimension(110, 25));
        insertBuildingBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertBuildingBTNMouseClicked(evt);
            }
        });
        insertBuildingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBuildingBTNActionPerformed(evt);
            }
        });
        add(insertBuildingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 120, 30));

        searchBuildingBTN.setBackground(new java.awt.Color(0, 0, 0));
        searchBuildingBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchBuildingBTN.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search.png")); // NOI18N
        searchBuildingBTN.setBorderPainted(false);
        searchBuildingBTN.setMaximumSize(new java.awt.Dimension(70, 30));
        searchBuildingBTN.setMinimumSize(new java.awt.Dimension(70, 30));
        searchBuildingBTN.setPreferredSize(new java.awt.Dimension(70, 30));
        searchBuildingBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBuildingBTNMouseClicked(evt);
            }
        });
        add(searchBuildingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, 50));

        insertPanel.setBackground(new java.awt.Color(51, 98, 114));
        insertPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 98, 114));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description");
        insertPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 107, 148, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code");
        insertPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 27, 126, 54));

        code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        code.setBorder(null);
        insertPanel.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 204, 33));

        desc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desc.setText(" ");
        desc.setBorder(null);
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        insertPanel.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 107, 270, 169));

        jButton1.setBackground(new java.awt.Color(51, 98, 114));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(60, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(60, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        insertPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 140, 60));

        add(insertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 510, 370));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\building.png")); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 280, 50));

        saveListBtn.setBackground(new java.awt.Color(0, 0, 0));
        saveListBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveListBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N
        saveListBtn.setBorderPainted(false);
        saveListBtn.setMaximumSize(new java.awt.Dimension(60, 30));
        saveListBtn.setMinimumSize(new java.awt.Dimension(60, 30));
        saveListBtn.setPreferredSize(new java.awt.Dimension(60, 30));
        saveListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveListBtnMouseClicked(evt);
            }
        });
        add(saveListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 90, 40));
    }//GEN-END:initComponents
    //Update Buttom
    private void ubdateBuildingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubdateBuildingBTNActionPerformed
        if (buildingTable.getSelectedRow() >= 0) {

            code.setText(buildingTable.getValueAt(buildingTable.getSelectedRow(), 0).toString());
            insertPanel.setVisible(true);
            code.setEnabled(false);
            updateFlag = true;
        } else
            JOptionPane.showMessageDialog(this, "select a Building to updaet");
    }//GEN-LAST:event_ubdateBuildingBTNActionPerformed

    private void deleteBuildingBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBuildingBTNMouseClicked
        if (buildingTable.getSelectedRow() >= 0) {
            String code = buildingTable.getValueAt(buildingTable.getSelectedRow(), 0).toString();
            BuildingDto selectedBuilding_Delete = new BuildingDto(); // this Building i want to delete
            selectedBuilding_Delete.setCode(code);

            if (buildingBaoObject.deleteBuilding(selectedBuilding_Delete)) {
                {
                    int msg = JOptionPane.showConfirmDialog(this, "are you sure you need to delete ");
                    if (msg == JOptionPane.OK_OPTION) {
                        JOptionPane.showMessageDialog(this, "deleted");
                        buildingTableReset(buildingBaoObject.listBuilding());
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Can not delete may be deleted using another user ");
            }
        } else
            JOptionPane.showMessageDialog(this, "select a Building to Delete");
     
      

    }//GEN-LAST:event_deleteBuildingBTNMouseClicked

    private void insertBuildingBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertBuildingBTNMouseClicked
        insertPanel.setVisible(true);
        code.setEnabled(true);
        updateFlag = false;
    }//GEN-LAST:event_insertBuildingBTNMouseClicked

    private void searchBuildingBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBuildingBTNMouseClicked
        if (BuildingEnteredCode.getText() != null)
            if (buildingBaoObject.SearchBuilding(BuildingEnteredCode.getText()) != null)
                buildingTableReset(buildingBaoObject.SearchBuilding(BuildingEnteredCode.getText()));
            else
                JOptionPane.showMessageDialog(this, "not found");
        else {
            JOptionPane.showMessageDialog(this, "you should enter a building code");
            buildingTableReset(buildingBaoObject.listBuilding());
        }
      
    }//GEN-LAST:event_searchBuildingBTNMouseClicked

    private void insertBuildingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBuildingBTNActionPerformed
       
      
        
    }//GEN-LAST:event_insertBuildingBTNActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        BuildingBao business = new BaoFactory().createBuildingBao();
        BuildingDto b = new BuildingDto();

        b.setCode(code.getText());
        b.setDescription(desc.getText());
        if (updateFlag) {
            b.setUPDATE_DATE(new Date(System.currentTimeMillis()));
            b.setUPDATED_BY(LoginEngine.currentUser);
        } else {
            b.setINSERTION_DATE(new Date(System.currentTimeMillis()));
            b.setINSERTED_BY(LoginEngine.currentUser);

            b.setUPDATE_DATE(new Date(System.currentTimeMillis()));
            b.setUPDATED_BY(LoginEngine.currentUser);
        }
        if (business.saveBuilding(b)) {
            JOptionPane.showMessageDialog(this, "Saved");
            buildingTableReset(business.listBuilding());

        } else
            JOptionPane.showMessageDialog(this, "Can't Save");
    }//GEN-LAST:event_jButton1MouseClicked

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Utilities.printRecord(bPanel);
    }//GEN-LAST:event_jMenuItem1ActionPerformed



    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 
        Utilities.export_PDF(buildingTable);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   
        Utilities.export_XLX(buildingTable);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

        if (evt.isPopupTrigger()) {
            popup.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        insertPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void saveListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveListBtnMouseClicked

        boolean status = false;
        if (buildings != null) {
            for (int i = 0; i < buildings.size(); i++) {
                status = buildingBaoObject.saveBuilding(buildings.get(i));
                status = status && status;
            }
        }

        if (status) {
            JOptionPane.showMessageDialog(this, "All Seved");
            buildingTableReset(buildingBaoObject.listBuilding());
        } else
            JOptionPane.showMessageDialog(this, "Error in Save some Buildings ");

        saveListBtn.setVisible(false);
    }//GEN-LAST:event_saveListBtnMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        buildingTableReset(readlist()); 

    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuildingEnteredCode;
    private javax.swing.JPanel bPanel;
    private javax.swing.JTable buildingTable;
    private javax.swing.JTextField code;
    private javax.swing.JButton deleteBuildingBTN;
    private javax.swing.JTextField desc;
    private javax.swing.JButton insertBuildingBTN;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JButton saveListBtn;
    private javax.swing.JButton searchBuildingBTN;
    private javax.swing.JButton ubdateBuildingBTN;
    // End of variables declaration//GEN-END:variables





    public void buildingTableReset(List<BuildingDto> buildings) {

        Object[][] bArray = new Object[buildings.size()][6];

        for (int i = 0; i < buildings.size(); i++) {
            bArray[i][0] = buildings.get(i).getCode();
            bArray[i][1] = buildings.get(i).getDescription();
            bArray[i][2] = buildings.get(i).getINSERTED_BY();
            bArray[i][4] = buildings.get(i).getUPDATED_BY();
            bArray[i][3] = buildings.get(i).getINSERTION_DATE();
            bArray[i][5] = buildings.get(i).getUPDATE_DATE();

        }
        buildingTable.setModel(new javax.swing.table.DefaultTableModel(bArray, new String[] {
                                                                       "Code", "Description", "Inserted By",
                                                                       "  Insertion Date", "Updated By", "Update Date"
            }));
    }


    public List<BuildingDto> readlist() {

        //Choose XLS FILE
        JFileChooser Chooser = new JFileChooser();
        int Variable = Chooser.showOpenDialog(null);
        List<BuildingDto> Buildings = new ArrayList<>();
        ;

        if (Variable == JFileChooser.APPROVE_OPTION) {
            try {

                XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(Chooser.getSelectedFile()));
                //Get first/desired sheet from the workbook
                XSSFSheet sheet = workbook.getSheetAt(0);
                //Iterate through each rows one by one
                Iterator<Row> rowIterator = sheet.iterator();

                while (rowIterator.hasNext()) {

                    Row row = rowIterator.next();
                    Iterator cellIterator = row.cellIterator();
                    // create Building object from BuildingDto
                    BuildingDto Building = new BuildingDto();
                    while (cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();

                        //Cell with index 1 contains Code

                        if (cell.getColumnIndex() == 0 && cell.getRowIndex() != 0) {
                            Building.setCode(cell.getStringCellValue());
                        }
                        //Cell with index 2 To save  Description
                        if (cell.getColumnIndex() == 1 && cell.getRowIndex() != 0) {
                            Building.setDescription(cell.getStringCellValue());

                        }

                        Building.setINSERTED_BY(LoginEngine.currentUser);
                        Building.setINSERTION_DATE(new Date(System.currentTimeMillis()));

                    }
                    // check if the code equal null or not
                    if (Building.getCode() != null) {
                        Buildings.add(Building);
                    }

                }

            }

            catch (Exception e) {
                e.printStackTrace();
            }

        }
        saveListBtn.setVisible(true);
        buildings = Buildings;
        return Buildings;

    }
}
