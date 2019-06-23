

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

import java.awt.HeadlessException;
import java.awt.event.KeyListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
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
    private KeyListener listener;

    /** Creates new form ScheduleInsert */
    public ScheduleInsert() {
        initComponents();
        table_Panel.setVisible(false);
        if(schedualBao.listAll()!=null)
            TableReset(schedualBao.listAll());
        this.requestFocus();
              this.addKeyListener(listener);
        // roleID = 14 
        // now one step we will create an object of ScreenBao to know the current permission 
        int permissionType = new BaoFactory().createScreenBao().getCurrentPermission(14);
        Utilities.mandate(null,insertBTN , deleteBTN ,14, Utilities.convertTOBase2(permissionType));
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        insertBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        ScheduleCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        table_Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(10, 260, 520, 250);

        insertBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertBTN.setText("Insert  New ");
        insertBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertBTNMouseClicked(evt);
            }
        });
        add(insertBTN);
        insertBTN.setBounds(370, 190, 160, 54);

        searchBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBTNMouseClicked(evt);
            }
        });
        add(searchBTN);
        searchBTN.setBounds(310, 90, 97, 60);

        ScheduleCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ScheduleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleCodeActionPerformed(evt);
            }
        });
        add(ScheduleCode);
        ScheduleCode.setBounds(10, 100, 250, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search");
        add(jLabel1);
        jLabel1.setBounds(10, 60, 110, 30);

        deleteBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBTN.setLabel("Delete");
        deleteBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBTNMouseClicked(evt);
            }
        });
        add(deleteBTN);
        deleteBTN.setBounds(220, 190, 111, 50);

        table_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 14)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Slot1", "slot2", "slot4", "slot4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setRowHeight(80);
        jScrollPane2.setViewportView(table2);
        table2.getColumnModel().getColumn(0).setResizable(false);
        table2.getColumnModel().getColumn(0).setHeaderValue("Day");
        table2.getColumnModel().getColumn(1).setResizable(false);
        table2.getColumnModel().getColumn(1).setHeaderValue("Slot1");
        table2.getColumnModel().getColumn(2).setResizable(false);
        table2.getColumnModel().getColumn(2).setHeaderValue("slot2");
        table2.getColumnModel().getColumn(3).setResizable(false);
        table2.getColumnModel().getColumn(3).setHeaderValue("slot4");
        table2.getColumnModel().getColumn(4).setResizable(false);
        table2.getColumnModel().getColumn(4).setHeaderValue("slot4");
        table2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout table_PanelLayout = new javax.swing.GroupLayout(table_Panel);
        table_Panel.setLayout(table_PanelLayout);
        table_PanelLayout.setHorizontalGroup(
            table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        table_PanelLayout.setVerticalGroup(
            table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_PanelLayout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(table_Panel);
        table_Panel.setBounds(550, 55, 570, 460);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Scheduels Screen");
        add(jLabel2);
        jLabel2.setBounds(420, 10, 177, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("view content");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(20, 190, 151, 50);
    }//GEN-END:initComponents

    private void insertBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertBTNMouseClicked
        readXLX();

    }//GEN-LAST:event_insertBTNMouseClicked

    private void searchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBTNMouseClicked
        table_Panel.setVisible(false);
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

        table_Panel.setVisible(false);
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

    private void ScheduleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScheduleCodeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if (table.getSelectedRow() >= 0)
{ table_Panel.setVisible(true);
     SchedualDto sch =   schedualBao.getSlectedTable(table.getValueAt(table.getSelectedRow(), 0).toString());
           
            Utilities.schResetModel(table2, sch.getSchedual_Slots());
        }
             else JOptionPane.showMessageDialog(null, "select a table to view"); 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Utilities.printRecord(table_Panel);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     
    Utilities.export_PDF(table2);
 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    Utilities.exportSch_XLX(table2);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    if(evt.isPopupTrigger())
    {
    popup.show(this, evt.getX(), evt.getY());    
    }
       
    }//GEN-LAST:event_formMouseReleased

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
    private javax.swing.JTextField ScheduleCode;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton insertBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JPanel table_Panel;
    // End of variables declaration//GEN-END:variables
   

    
     // this method implmented by mina 
    private String[] string_splitter(String Word ){
                // types of the charchters that will be in the name
                String result[] = Word.split("[/ ,.-]");
                String name [] = new String[5];
            try{ 
                for (int i=0,j=0 ; i<result.length; i++,j++){   
                if (result[i].toLowerCase().equalsIgnoreCase("el")||result[i].toLowerCase().equalsIgnoreCase("abd")||
                        result[i].toLowerCase().equalsIgnoreCase("abdel")){
                    name[j] =result[i].concat(" ").concat(result[++i]);
                    
                }
                
                else
                    name[j]=result[i];
                }
                System.out.println(Arrays.toString(name));
            }
            catch (Exception e){
                System.out.println(e);    
            }    
       return name; }
    
    
    
  void readXLX()
  {
      
          //Choose XLS FILE
          JFileChooser Chooser = new JFileChooser();
          int Variable = Chooser.showOpenDialog(null);
          
          
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
                          
                          float temp = Float.parseFloat(Acadimcyear.getCell(1).toString());
                          int acadYear = (int)temp ; 
                          schudel.setAcademicYear(acadYear);
                          schudel.setSCHEDULECODE(SCHEDULECODE.getCell(1).toString());
                          schudel.setCodeDeparment(CodeDeparment.getCell(1).toString());
                          float temp1 = Float.parseFloat(Acadimcyear.getCell(3).toString()) ;
                          int num = (int) temp1;
                          schudel.setStudent_number(num );
                          int slotCode = 1;
                          
                          List<CourseDto> courses = new ArrayList<>();
                          List<EmployeeDto> employees = new ArrayList<>();
                          for (int i = 5; i < 30; i += 5)
                          {   
                              
                              HSSFRow courseName = Sheet.getRow(i); 
                              HSSFRow StaffName1 = Sheet.getRow(i + 1);
                              HSSFRow StaffName2 = Sheet.getRow(i + 2);
                              HSSFRow Type = Sheet.getRow(i + 3);
                              HSSFRow PrefSpace = Sheet.getRow(i + 4);   
                              
                              for (int k = 1; k < 9; k += 2)
                              {                        
                                  EmployeeDto instructor = new EmployeeDto();
                                  CourseDto course = new CourseDto();
                                  List<EmployeeDto> instructors = new ArrayList<>();
                                  
                                  instructor.setEmail(StaffName1.getCell(k + 1).toString());
                                  // you need to cut the string and set the name as comming +++++++++
                                  // use string cut or any format
                                  //+++++++++++++++++++++++++++++++++++++++
                        /*   try {
                            String[] enteredName = string_splitter(StaffName1.getCell(k).toString());
                            instructor.setFName(enteredName[1]);
                            instructor.setSName(enteredName[2]);
                            instructor.setLName(enteredName[3]);
                            instructor.setFamilyName(enteredName[4]);
                            instructor.setCareerDgree(enteredName[0]);


                        } catch (Exception e) {
                            
                            e.printStackTrace();
                        } */
                        instructor.setFName("a");
                        instructor.setSName("b");
                        instructor.setLName("c");
                        instructor.setFamilyName("d");
                        instructor.setCareerDgree("dr");

                                  
                                  //+++++++++++++++++++++++++++++++++++++++
                                  instructor.setInsertedBy(LoginEngine.currentUser);
                                  instructor.setUpdatedBy(LoginEngine.currentUser);
                                  instructor.setInertion_Date(new Date(System.currentTimeMillis()));
                                  instructor.setUpdate_Date(new Date(System.currentTimeMillis()));
                                  DepartmentDto department = new DepartmentDto(); 
                                  department.setCode(schudel.getCodeDeparment());
                                  instructor.setDepartment(department);
                                  
                                
                                  instructors.add(instructor);
                                  employees.add(instructor);
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
                                 
                                  LocationTypeDto locType = new LocationTypeDto() ;
                                  locType.setCode(PrefSpace.getCell(k+1).toString());
                                  course.setNeededLocType(locType);
                                  if(course.getCode()!="" && course.getName()!=""&&course.getCode()!=null);
                                  courses.add(course);
                                 
                                 
                                  SlotDto slot = new SlotDto();
                                  slot.setCode(slotCode);
                                  slot.setCurrentCourse(course);
                                  slot.setPrefSpace(PrefSpace.getCell(k + 1).toString());
                                  slot.setType(Type.getCell(k + 1).toString());
                                  if(slot.getCurrentCourse().getCode()!=null)
                                  slots.add(slot);
                                  slotCode++;
                                  
                                  System.out.println("code_in"+slotCode);
                              } // end of inner loop

                          } // end of outer loop 
                          
                          CourseBao.saveCourses(courses);
                           try {
                              EmployeeBao.saveEmployees(employees);
                               } catch (LTAException ltae) {
                               ltae.printStackTrace();
                          }
                           schudel.setSchedual_Slots(slots);

                try {
                    if (SchedualBao.saveSchedual(schudel))
                        JOptionPane.showMessageDialog(this, " saved");
                    else
                        JOptionPane.showMessageDialog(this, "don't save");
                } catch (LTAException ltae) {
                    
                    JOptionPane.showMessageDialog(this, "don't save Error in DB");
                } catch (HeadlessException he) {
                    // TODO: Add catch code
                    he.printStackTrace();
                }
                      
                      } catch (IOException e) {
                          e.printStackTrace();
                      }
                  }
     
      } 


  //inside button

   private void writeToExcel (SchedualDto schedule){  
           JFileChooser fileChooser = new JFileChooser();
           fileChooser.setDialogTitle("Specify a file to save");   
           int returnVal =  fileChooser.showSaveDialog(this);     
           if (returnVal == JFileChooser.APPROVE_OPTION) {
             String  filepath = fileChooser.getSelectedFile().getAbsolutePath();
             File file = new File(filepath +".xls");
                if (file.exists() == false) {
                        HSSFWorkbook workbook = new HSSFWorkbook();
                        HSSFSheet Sheet = workbook.createSheet(); 
                        HSSFRow DepartmentCodeRow = Sheet.createRow(0);
                        HSSFRow AcademicYearRow = Sheet.createRow(1);
                        HSSFRow ScheduleCodeRow = Sheet.createRow(2);
                        HSSFRow TimeSlotRow = Sheet.createRow(3);
                        HSSFRow RowAfterTimeSlot = Sheet.createRow(4);
                        
                        
                        AcademicYearRow.createCell(1).setCellValue(schedule.getAcademicYear());
                        DepartmentCodeRow.createCell(0).setCellValue(schedule.getDepartment().getName());
                        DepartmentCodeRow.createCell(1).setCellValue(schedule.getCodeDeparment()); 
                        ScheduleCodeRow.createCell(0).setCellValue("SCHEDULECODE"); 
                        ScheduleCodeRow.createCell(1).setCellValue(schedule.getSCHEDULECODE()); 
                        AcademicYearRow.createCell(2).setCellValue("STUDENT NUMBER");
                        AcademicYearRow.createCell(3).setCellValue(schedule.getStudent_number());
                        TimeSlotRow.createCell(0).setCellValue("Time slot");
                        TimeSlotRow.createCell(1).setCellValue("1st slot");
                        TimeSlotRow.createCell(3).setCellValue("2nd slot");
                        TimeSlotRow.createCell(5).setCellValue("3rd slot");
                        TimeSlotRow.createCell(7).setCellValue("4th slot");
                          for(int i=1; i<8; i+=2) {
                              RowAfterTimeSlot.createCell(i).setCellValue("start-end");}
                        RowAfterTimeSlot.createCell(2).setCellValue("8.50");
                        RowAfterTimeSlot.createCell(4).setCellValue("10.20");
                        RowAfterTimeSlot.createCell(6).setCellValue("12.30");
                        RowAfterTimeSlot.createCell(8).setCellValue("2");
                        HSSFRow row1 =  Sheet.createRow(5);
                        row1.createCell(0).setCellValue("Sunday");
                        HSSFRow row2 =  Sheet.createRow(10);
                        row2.createCell(0).setCellValue("Monday");
                        HSSFRow row3 =  Sheet.createRow(15);
                        row3.createCell(0).setCellValue("Tuesday");
                        HSSFRow row4 =  Sheet.createRow(20);
                        row4.createCell(0).setCellValue("Wednesday");
                        HSSFRow row5 =  Sheet.createRow(25);
                        row5.createCell(0).setCellValue("Thursday");

                        for (int i = 5; i < 30; i += 5){                       
                             HSSFRow courseNameRow = Sheet.createRow(i); 
                             HSSFRow StaffNameRow = Sheet.createRow(i + 1);
                             HSSFRow TypeRow = Sheet.createRow(i + 3);
                             HSSFRow PrefSpaceRow = Sheet.createRow(i + 4);   
                                         
                              for (int k = 1; k < 9; k += 2){                                    
                                   EmployeeDto instructor = new EmployeeDto();
                                   StaffNameRow.createCell(k).setCellValue(instructor.getCareerDgree()+" "+instructor.getFName()+ " " +instructor.getSName()+ " "+instructor.getLName()+" "+instructor.getFamilyName());                               
                           
                                   CourseDto course = new CourseDto();
                                   courseNameRow.createCell(k+1).setCellValue(course.getCode());
                                   courseNameRow.createCell(k).setCellValue(course.getName());
                                    
                                   LocationTypeDto loctionType = new LocationTypeDto() ;
                                   TypeRow.createCell(k).setCellValue("Type");
                                   TypeRow.createCell(k+1).setCellValue(loctionType.getCode());
                                   PrefSpaceRow.createCell(k).setCellValue("PrefSpace");
                                   PrefSpaceRow.createCell(k+1).setCellValue(course.getNeededLocType().getCode());
                                             } // end of inner loop
                                             } // end of outer loop
                               try (
                                  //Write the workbook in file 
                                   FileOutputStream out = new FileOutputStream(file)) {
                                   workbook.write(out);
                                   JOptionPane.showMessageDialog(this, "File Saved Successfully ");
                                       }
                        catch (IOException e){
                            System.out.println("error");
                              }
                    }
               
                         else { // Sheet already exists
                              JOptionPane.showMessageDialog(this,"File already exist");}       
                               
                     }
                     else { // Sheet already exists
                       JOptionPane.showMessageDialog(this,"User cancelled  ");}       
                        
                           }
                
    
}