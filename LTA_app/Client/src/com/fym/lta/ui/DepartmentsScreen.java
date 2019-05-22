
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.DepartmentBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.dto.BuildingDto;
import com.fym.lta.dto.DepartmentDto;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Mina
 */
public class DepartmentsScreen extends javax.swing.JPanel {
    boolean updateFlag = false;
    private DepartmentBao departmentBaoObj = new BaoFactory().createDepartmentBao();
    private List<DepartmentDto> searchReturnedDepartment;

    List<BuildingDto> allBuildings = new BaoFactory().createBuildingBao().listBuilding();

    /** Creates new form DepartmentSearch */
    public DepartmentsScreen() {
        initComponents();

        listComboBuildings(allBuildings);
        insertPanel.setVisible(false);
        if(departmentBaoObj.listDepartment()!=null)
        {
            departmentTableReset(departmentBaoObj.listDepartment());
        }
        
        String permissionType = new BaoFactory().createScreenBao().getCurrentPermission(4);
        Utilities.mandate(departmrntUpdateBtn, departmrntInsertBtn, departmrntDeleteBtn, 4, permissionType);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        departmentCode_TextField = new javax.swing.JTextField();
        departmrntDeleteBtn = new javax.swing.JButton();
        departmrntUpdateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DepartmentTable = new javax.swing.JTable();
        departmrntInsertBtn = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        code_TextField = new javax.swing.JTextField();
        name_TextField = new javax.swing.JTextField();
        homeBuilding_ComboBox = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Department Screen");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setText("Search ");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Code");

        departmrntDeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        departmrntDeleteBtn.setText("Delete ");
        departmrntDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmrntDeleteBtnMouseClicked(evt);
            }
        });
        departmrntDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmrntDeleteBtnActionPerformed(evt);
            }
        });

        departmrntUpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        departmrntUpdateBtn.setText("Update");
        departmrntUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmrntUpdateBtnActionPerformed(evt);
            }
        });

        DepartmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(DepartmentTable);

        departmrntInsertBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        departmrntInsertBtn.setText("Insert new");
        departmrntInsertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmrntInsertBtnMouseClicked(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Code");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Home Building ");

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(75, 75, 75)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_TextField)
                    .addComponent(homeBuilding_ComboBox, 0, 266, Short.MAX_VALUE)
                    .addGroup(insertPanelLayout.createSequentialGroup()
                        .addComponent(code_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(code_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(homeBuilding_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(departmrntUpdateBtn)
                                        .addGap(44, 44, 44)
                                        .addComponent(departmrntDeleteBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(departmrntInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(departmentCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearch)))
                                .addGap(85, 85, 85)))))
                .addGap(49, 49, 49)
                .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmentCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departmrntUpdateBtn)
                                    .addComponent(departmrntDeleteBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(departmrntInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(insertPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }//GEN-END:initComponents
    
  
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    
  

    }//GEN-LAST:event_btnSearchActionPerformed
     
     
    
    
    private void departmrntUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmrntUpdateBtnActionPerformed
        if (DepartmentTable.getSelectedRow() >= 0) {

            code_TextField.setText(DepartmentTable.getValueAt(DepartmentTable.getSelectedRow(), 0).toString());
            code_TextField.setEnabled(false);
           // name_TextField.setText(DepartmentTable.getValueAt(DepartmentTable.getSelectedRow(), 1).toString());
            insertPanel.setVisible(true);
            updateFlag = true;


        } else {
            JOptionPane.showMessageDialog(this, "select a department to delete ");
        }
    }//GEN-LAST:event_departmrntUpdateBtnActionPerformed

    private void departmrntDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmrntDeleteBtnActionPerformed
        // D.setDepartment_id(Integer.parseInt(id_TextField.getText()));
    }//GEN-LAST:event_departmrntDeleteBtnActionPerformed

    private void departmrntInsertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmrntInsertBtnMouseClicked
        insertPanel.setVisible(true);
        code_TextField.setEnabled(true);
        updateFlag = false;
    }//GEN-LAST:event_departmrntInsertBtnMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        insertPanel.setVisible(false);

        if (departmentCode_TextField.getText() != null) {
            DepartmentDto D = new DepartmentDto();
            D.setCode(departmentCode_TextField.getText());
            if (departmentBaoObj.SearchDepartment(D) != null)
                departmentTableReset(departmentBaoObj.SearchDepartment(D));
            else
                JOptionPane.showMessageDialog(null, "not found");

        }

        else {
            // no input will return all Departments
            searchReturnedDepartment = departmentBaoObj.listDepartment();
        }
 
    
    }//GEN-LAST:event_btnSearchMouseClicked

    private void departmrntDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmrntDeleteBtnMouseClicked
        insertPanel.setVisible(false);

        String code = DepartmentTable.getValueAt(DepartmentTable.getSelectedRow(), 0).toString();
        DepartmentDto selectedDepartment_Delete = new DepartmentDto(); // this department i want to delete
        selectedDepartment_Delete.setCode(code);

        if (departmentBaoObj.deleteDepartment(selectedDepartment_Delete)) {
            JOptionPane.showMessageDialog(this, "deleted");
            departmentTableReset(departmentBaoObj.listDepartment());

        } else {
            JOptionPane.showMessageDialog(this, "Can not delete may be deleted using another Employee ");
        } 
    }//GEN-LAST:event_departmrntDeleteBtnMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        DepartmentDto department = new DepartmentDto();
        BuildingDto building = new BuildingDto();
        building.setBuilding_id(allBuildings.get(homeBuilding_ComboBox.getSelectedIndex()).getBuilding_id());

        department.setName(name_TextField.getText());
        department.setCode(code_TextField.getText());
        department.setHomebuilding(building);
        if (updateFlag) { 
            department.setUpdate_Date(new Date(System.currentTimeMillis()));
            department.setUpdatedBy(LoginEngine.currentUser);
        } else {
            department.setUpdate_Date(new Date(System.currentTimeMillis()));
            department.setUpdatedBy(LoginEngine.currentUser);
            department.setInertion_Date(new Date(System.currentTimeMillis()));
            department.setInsertedBy(LoginEngine.currentUser);
          
        }

        if (departmentBaoObj.saveDepartment(department)) {
            JOptionPane.showMessageDialog(this, "saved ");
            departmentTableReset(departmentBaoObj.listDepartment());
        } else
            JOptionPane.showMessageDialog(this, "can not save "); 
    }//GEN-LAST:event_btnSaveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DepartmentTable;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField code_TextField;
    private javax.swing.JTextField departmentCode_TextField;
    private javax.swing.JButton departmrntDeleteBtn;
    private javax.swing.JButton departmrntInsertBtn;
    private javax.swing.JButton departmrntUpdateBtn;
    private javax.swing.JComboBox homeBuilding_ComboBox;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_TextField;
    // End of variables declaration//GEN-END:variables
    
    
    public void departmentTableReset(List<DepartmentDto> Department) {
        Object[][] DepartmentArr = new Object[Department.size()][3];

        for (int i = 0; i < Department.size(); i++) {
            DepartmentArr[i][0] = Department.get(i).getCode();
            DepartmentArr[i][1] = Department.get(i).getName();
             DepartmentArr[i][2] = Department.get(i).getHomebuilding().getCode();
        }
        DepartmentTable.setModel(new javax.swing.table.DefaultTableModel(DepartmentArr, new String[] {
                                                                         "Code", "Name","Code Of Home Building" }));
    }

    void listComboBuildings(List<BuildingDto> Buildings) {
        for (int i = 0; i < Buildings.size(); i++) {
            homeBuilding_ComboBox.addItem(Buildings.get(i).getCode());
        }

    }
}
