
package com.fym.lta.ui;

import com.fym.lta.Bao.BaoFactory;
import com.fym.lta.Bao.EmployeeBao;
import com.fym.lta.dto.EmployeeDto;

import java.util.List;

/**
 *
 * @author Mina
 */
public class StaffScreen extends javax.swing.JPanel {
    private EmployeeBao business = new BaoFactory().CreateemployeeBao();
    /** Creates new form StaffSearch */
    public StaffScreen() {
        initComponents();
        employeeTableReset(business.listEmployee());
      

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        btnSearch = new javax.swing.JButton();
        fName_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(700, 50, 140, 50);

        fName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName_TextFieldActionPerformed(evt);
            }
        });
        add(fName_TextField);
        fName_TextField.setBounds(380, 60, 230, 34);

        jLabel1.setText("Staff Name ");
        add(jLabel1);
        jLabel1.setBounds(230, 60, 143, 30);

        jLabel2.setText("Search for Staff member");
        add(jLabel2);
        jLabel2.setBounds(430, 0, 178, 41);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(580, 120, 90, 50);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(360, 120, 80, 50);

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 210, 620, 270);

        jButton1.setText("insert new");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(730, 120, 100, 50);
    }//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fName_TextFieldActionPerformed
    
    
    EmployeeDto s =null;    
        
    
    //  private StaffBao business = new BaoFactory().CreateNewStaffMember();
    // StaffMemberDto S = new  StaffMemberDto();
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        UsersScreen.createPopupMenu(new StaffInsert());
  
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

       
            employeeTableReset(business.listEmployee());   
        



    }//GEN-LAST:event_btnSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField fName_TextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable staffTable;
    // End of variables declaration//GEN-END:variables

    public void employeeTableReset(List<EmployeeDto> employees) {
       
        Object[][] employeesArr = new Object[employees.size()][5];

        for (int i = 0; i < employees.size(); i++) {

            employeesArr[i][0] = employees.get(i).getEmp_id();
            employeesArr[i][1] = employees.get(i).getFName();
            employeesArr[i][2] = employees.get(i).getSName();
            employeesArr[i][3] = employees.get(i).getLName();
            employeesArr[i][4] = employees.get(i).getFamilyName();

            //employeesArr[i][5] = employees.get(i).getEmail();

        }
        staffTable.setModel(new javax.swing.table.DefaultTableModel(employeesArr, new String[] {
                                                                    "ID", "First Name", "second Name", "last Name",
                                                                    "Family Name"
            }));
    }
}
