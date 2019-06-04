package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.CourseBao;
import com.fym.lta.bao.EmployeeBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.bao.SchedualBao;
import com.fym.lta.common.LTAException;
import com.fym.lta.dto.CourseDto;
import com.fym.lta.dto.DepartmentDto;
import com.fym.lta.dto.EmployeeDto;
import com.fym.lta.dto.LocationTypeDto;
import com.fym.lta.dto.SchedualDto;
import com.fym.lta.dto.SlotDto;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ScheduleInsert extends javax.swing.JPanel 
{
    @SuppressWarnings("oracle.jdeveloper.java.serialversionuid-stale")
    private static final long serialVersionUID = 1L;
    
    private  SchedualBao schedualBao = new BaoFactory().createSchedualBao();    
    private  List<SchedualDto> searchSchedual;
    boolean SchedualAvailabilty = true;


    /** Creates new form ScheduleInsert */
    public ScheduleInsert() {
        initComponents();
        PanelInsert.setVisible(false);
        if(schedualBao.listAll()!=null)
            TableReset(schedualBao.listAll());
        // roleID = 14 
        // now one step we will create an object of ScreenBao to know the current permission 
          String permissionType = new BaoFactory().createScreenBao().getCurrentPermission(14);
          Utilities.mandate(null,insertBTN , deleteBTN ,14,permissionType);
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
        table = new javax.swing.JTable();
        insertBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        ScheduleCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        PanelInsert = new javax.swing.JPanel();
        academicYearlable = new javax.swing.JLabel();
        departmentlable = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        academicYearcombox = new javax.swing.JComboBox();
        departmentcombox = new javax.swing.JComboBox();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedules", 0, 0, new java.awt.Font("Tekton Pro Cond", 1, 36))); // NOI18N

        table.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SCHEDULECODE", "AcademicYear", "CodeDeparment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setHeaderValue("SCHEDULECODE");
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setHeaderValue("AcademicYear");
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setHeaderValue("CodeDeparment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 230, 462, 240);

        insertBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertBTN.setText("Insert  New ");
        insertBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertBTNMouseClicked(evt);
            }
        });
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });
        add(insertBTN);
        insertBTN.setBounds(310, 150, 160, 54);

        searchBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBTNMouseClicked(evt);
            }
        });
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        add(searchBTN);
        searchBTN.setBounds(370, 50, 97, 50);

        ScheduleCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ScheduleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleCodeActionPerformed(evt);
            }
        });
        add(ScheduleCode);
        ScheduleCode.setBounds(10, 50, 250, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search");
        add(jLabel1);
        jLabel1.setBounds(12, 9, 110, 30);

        deleteBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBTN.setLabel("Delete");
        deleteBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBTNMouseClicked(evt);
            }
        });
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        add(deleteBTN);
        deleteBTN.setBounds(120, 150, 111, 50);

        PanelInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        academicYearlable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        academicYearlable.setText("Academic Year ");

        departmentlable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        departmentlable.setText("Department");

        insert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insert.setText("Open");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        academicYearcombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Year    ", "Second Year    ", "Third Year    ", "Fourth Year " }));

        departmentcombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sduguv", "dawjcbuoJ", "SDJCBJkx ;" }));
        departmentcombox.setToolTipText("");

        javax.swing.GroupLayout PanelInsertLayout = new javax.swing.GroupLayout(PanelInsert);
        PanelInsert.setLayout(PanelInsertLayout);
        PanelInsertLayout.setHorizontalGroup(
            PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(departmentlable, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(departmentcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(academicYearlable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(academicYearcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
            .addGroup(PanelInsertLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelInsertLayout.setVerticalGroup(
            PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(academicYearcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentlable)
                            .addComponent(departmentcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(academicYearlable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        add(PanelInsert);
        PanelInsert.setBounds(510, 45, 445, 420);
    }//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        //Choose XLS FILE
        JFileChooser Chooser = new JFileChooser();
        int Variable = Chooser.showOpenDialog(null);
        //To select items for Combox
        int selectDpertment = departmentcombox.getSelectedIndex();
        int academicYear = academicYearcombox.getSelectedIndex();
        
        if (selectDpertment == 0) // Choose Computer  Department
        {
              if (Variable == JFileChooser.APPROVE_OPTION) 
                {                     

                    try {
                        
                        
                        HSSFWorkbook lta = new HSSFWorkbook(new FileInputStream(Chooser.getSelectedFile()));
                        HSSFSheet Sheet = lta.getSheet("Sheet0");
                        HSSFRow CodeDeparment = Sheet.getRow(0); // Row (1)
                        HSSFRow Acadimcyear = Sheet.getRow(1); // Row (2)
                        HSSFRow SCHEDULECODE = Sheet.getRow(2); // Row (2)
 
          
                        // rows
                        SchedualDto schudel = new SchedualDto();

                        List<SlotDto> slots =  new ArrayList<>();
                        SchedualBao SchedualBao = new BaoFactory().createSchedualBao();
                        EmployeeBao EmployeeBao = new BaoFactory().createemployeeBao();
                        CourseBao CourseBao = new BaoFactory().createCourseBao(); 
                        schudel.setAcademicYear(Acadimcyear.getCell(1).toString());
                        schudel.setSCHEDULECODE(SCHEDULECODE.getCell(1).toString());
                        schudel.setCodeDeparment(CodeDeparment.getCell(1).toString());
                        float temp = Float.parseFloat(Acadimcyear.getCell(3).toString()) ;
                        int num = (int) temp;
                        schudel.setStudent_number(num );
 
                        for (int i = 3; i < 38; i += 7)
                        {   
                            HSSFRow slotCode = Sheet.getRow(i);
                           // HSSFRow Starttime = Sheet.getRow(i + 1);
                            HSSFRow courseName = Sheet.getRow(i+2); 
                            HSSFRow StaffName1 = Sheet.getRow(i + 3);
                            HSSFRow StaffName2 = Sheet.getRow(i + 4);
                            HSSFRow Type = Sheet.getRow(i + 5);
                            HSSFRow PrefSpace = Sheet.getRow(i + 6);   
                           
                            for (int k = 1; k < 9; k += 2)
                            {                        
                                EmployeeDto instructor = new EmployeeDto();
                                CourseDto course = new CourseDto();
                                List<EmployeeDto> instructors = new ArrayList<>();


                                instructor.setEmail(StaffName1.getCell(k + 1).toString());
                                // you need to cut the string and set the name as comming +++++++++
                                // use string cut or any format
                                //+++++++++++++++++++++++++++++++++++++++
                                instructor.setFName("a");
                                instructor.setSName("b");
                                instructor.setLName("c");
                                instructor.setFamilyName("d");
                                instructor.setCareerDgree("PROF");
                                //+++++++++++++++++++++++++++++++++++++++
                                instructor.setInsertedBy(LoginEngine.currentUser);
                                instructor.setUpdatedBy(LoginEngine.currentUser);
                                instructor.setInertion_Date(new Date(System.currentTimeMillis()));
                                instructor.setUpdate_Date(new Date(System.currentTimeMillis()));
                                DepartmentDto department = new DepartmentDto(); 
                                department.setCode(schudel.getCodeDeparment());
                                instructor.setDepartment(department);
                                
                                if(instructor.getFullName()!="" &&instructor.getEmail()!=""&&instructor.getEmail()!=null)
                                try {
                                    EmployeeBao.saveEmployee(instructor);
                                     } catch (LTAException ltae) {
                                     ltae.printStackTrace();
                                }
                                 instructors.add(instructor);
                               
                                course.setInstructors(instructors);
                                course.setCode(courseName.getCell(k + 1).toString());
                                course.setName(courseName.getCell(k).toString());
                                course.setInsertedBy(LoginEngine.currentUser);
                                course.setUpdatedBy(LoginEngine.currentUser);
                                course.setInertion_Date(new Date(System.currentTimeMillis()));
                                course.setUpdate_Date(new Date(System.currentTimeMillis()));
                               
                                DepartmentDto department_course = new DepartmentDto(); 
                                department_course.setCode(schudel.getCodeDeparment());
                                course.setDepartment(department_course);
                               
                                LocationTypeDto loc = new LocationTypeDto() ;
                                loc.setCode(PrefSpace.getCell(k+1).toString());
                                course.setNeededLocType(loc);
                                if(course.getCode()!="" && course.getName()!=""&&course.getCode()!=null);
                                CourseBao.saveCourse(course);
                               
                               
                                SlotDto slot = new SlotDto();
                                slot.setCode(slotCode.getCell(k+1).toString());
                                slot.setCurrentCourse(course);
                                slot.setPrefSpace(PrefSpace.getCell(k + 1).toString());
                                slot.setType(Type.getCell(k + 1).toString());
                                if(slot.getCurrentCourse().getCode()!=null)
                                slots.add(slot);
                              
                            } // end of inner loop

                        } // end of outer loop 
                        
                         schudel.setSchedual_Slots(slots);
                        
                         
                                               
                          if( SchedualBao.saveSchedual(schudel))
                            JOptionPane.showMessageDialog(this, " saved");
                            else
                            JOptionPane.showMessageDialog(this, "don't save"); 
                    
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
           
            
        }


         
    }//GEN-LAST:event_insertActionPerformed

    private void insertBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertBTNMouseClicked
        PanelInsert.setVisible(true);

    }//GEN-LAST:event_insertBTNMouseClicked

    private void searchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBTNMouseClicked
        PanelInsert.setVisible(false);
        if (ScheduleCode.getText() != null) 
        {searchSchedual = schedualBao.SearchSchedual(ScheduleCode.getText());  }
     else {
            searchSchedual = schedualBao.listAll();
        }

        if (searchSchedual == null) {
            JOptionPane.showMessageDialog(this, "not found");
            
           
        }

        else
        TableReset(searchSchedual);

    }//GEN-LAST:event_searchBTNMouseClicked

    private void deleteBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBTNMouseClicked

        PanelInsert.setVisible(false);
        if (table.getSelectedRow() >= 0)
        {
            String selectedCode = table.getValueAt(table.getSelectedRow(), 0).toString();
            // call business to delete
            // don't forget you need to update the users table and remove this record
            // and check the returned value to tell the user if the delete is done or not
            int msg=  JOptionPane.showConfirmDialog(this, "are you sure you need to delete ");
                           if (msg == JOptionPane.OK_OPTION)
                           {    if (schedualBao.deleteSchedual(selectedCode)) {
                JOptionPane.showMessageDialog(this, "Deleted successfully"); // tell the user that we done it
                // reset the table's content
                
                TableReset(schedualBao.listAll());

            } else {
                JOptionPane.showMessageDialog(this, "Can not delete may be deleted using another user ");
            }}
        }

        else { // this means that the user no selection on table
            JOptionPane.showMessageDialog(this, "you should select a user first to delete  ");
        }
    }//GEN-LAST:event_deleteBTNMouseClicked

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertBTNActionPerformed

    private void ScheduleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScheduleCodeActionPerformed

    public void TableReset(List<SchedualDto> scheduals) 
    {

        Object[][] schedualArr = new Object[scheduals.size()][4];
        
        for (int i = 0; i<scheduals.size();i++)
        {

            schedualArr[i][0] = scheduals.get(i).getSCHEDULECODE();
            schedualArr[i][1] = scheduals.get(i).getAcademicYear();
            schedualArr[i][2] = scheduals.get(i).getStudent_number();
            schedualArr[i][3] = scheduals.get(i).getCodeDeparment();
             
        }
        table.setModel(new javax.swing.table.DefaultTableModel(schedualArr, new String[]
        {"Scheduale Code", "Academic Year","Student Numbers" ," Deparment Codec" }));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInsert;
    private javax.swing.JTextField ScheduleCode;
    private javax.swing.JComboBox academicYearcombox;
    private javax.swing.JLabel academicYearlable;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox departmentcombox;
    private javax.swing.JLabel departmentlable;
    private javax.swing.JButton insert;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}