
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.FloorBao;
import com.fym.lta.bao.LocationBao;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.common.LTAException;
import com.fym.lta.dto.BuildingDto;
import com.fym.lta.dto.EquipmentDto;
import com.fym.lta.dto.FloorDto;
import com.fym.lta.dto.LocationDto;
import com.fym.lta.dto.LocationTypeDto;

import java.util.Date;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nada
 */
public class LocationMasterScreen extends javax.swing.JPanel {
    
    //To create a refrence from LocationBao , FloorBao 
    private LocationBao Locationbusiness  = new BaoFactory().createLocationBao();
    
    private FloorBao Floorbusiness  = new BaoFactory().createFloorBao();
    
    // flag , if it equals 1 we update, if zero we insert  
    private int Location_idUpdate ;
   
    //To Get list of building , floor , location type to set comboBox items 
    List<BuildingDto> Allbuildings = new BaoFactory().createBuildingBao().listBuilding();
    List<FloorDto> Allfloors ;
    List<LocationTypeDto> AlllocationTypes = new BaoFactory().createLocationTypeBao().listLocationType();
    List<EquipmentDto> AllEquipments = new BaoFactory().createEquipmentBao().ListAll();


  
        /*To add comboBox items
        We get a list of saved items in Database*/
     void listComboBuildings(List<BuildingDto> building) {
           for (int i = 0; i < building.size(); i++) {
               building_combo.addItem(building.get(i).getCode());
                     }
    }
     
    void listComboFloors(List<FloorDto> floor) {
          for (int i = 0; i < floor.size(); i++) { 
             floor_combo.addItem(floor.get(i).getCode());
                    }
    }
    
    void listComboLocationTypes(List<LocationTypeDto> LocationType) {
          for (int i = 0; i < LocationType.size(); i++)
          {
             type_combo.addItem(LocationType.get(i).getCode());
          }
    }
    
    void listEquipments(List<EquipmentDto> Equipment) {
        if(Equipment!=null) {
        DefaultListModel list = new DefaultListModel();
          for (int i = 0; i < Equipment.size(); i++) 
          {
                 list.addElement(Equipment.get(i).getCode());  
          }
         // EquipmentList.setModel(list);
         }
    }
      
    // To Set the retrieved data from database into the locationTable//  
    private void setTableModel(List<LocationDto> location  ){
        Object [][] locationArr = new Object [location.size()][10];
        for(int i =0;i<location.size();i++){
          //  locationArr[i][0] = location.get(i).getLocation_id();
            locationArr[i][0] = location.get(i).getCode();
            locationArr[i][1] = location.get(i).getDescription();
            locationArr[i][2] = location.get(i).getCapacity();
           
            locationArr[i][3] = location.get(i).getFloor().getBuilding().getCode();
            locationArr[i][4] = location.get(i).getFloor().getCode();
            locationArr[i][5] = location.get(i).getType().getCode();
            locationArr[i][6] = location.get(i).getInsertedBy();
            locationArr[i][7] = location.get(i).getInertion_Date();
            locationArr[i][8] = location.get(i).getUpdatedBy();
            locationArr[i][9] = location.get(i).getUpdate_Date();  }    
        
        LocationTable.setModel(new javax.swing.table.DefaultTableModel(locationArr,
            new String [] {
             "Location Code" , "Description", "capacity" ,"Building", "Floor","Location Type" , "Inserted By","Insertion Date","Updated By","Update Date"
            }
        ));   }  
    
    
   
    /** Creates new form MasterScreen */
    public LocationMasterScreen() {
        initComponents();
      if(Locationbusiness.ListAll()!=null)
      setTableModel(Locationbusiness.ListAll());
        listComboBuildings(Allbuildings);
        //listComboFloors(Allfloors);
        listComboLocationTypes(AlllocationTypes);
        listEquipments(AllEquipments);
        define_location.setVisible(false);
        
        // roleID = 8
        // now one step we will create an object of ScreenBao to know the current permission 
        int permissionType = new BaoFactory().createScreenBao().getCurrentPermission(11);
        Utilities.mandate(updateLocationBtn, insertLocationBtn , deleteLocationBtn ,11, Utilities.convertTOBase2(permissionType));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\loc.png")); // NOI18N

        insertLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\insert.png")); // NOI18N
        updateLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\update.png")); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search.png")); // NOI18N
        deleteLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\delete.png")); // NOI18N
        
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search2.png")); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N
         
    }
  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        popup1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        master = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LocationTable = new javax.swing.JTable();
        insertLocationBtn = new javax.swing.JButton();
        deleteLocationBtn = new javax.swing.JButton();
        updateLocationBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        define_location = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        building_combo = new javax.swing.JComboBox();
        floor_combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        type_combo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem2.setText("Print");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem2);

        jMenuItem3.setText("Expor to PDF");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem3);

        jMenuItem4.setText("Export to XLX");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem4);

        jMenuItem5.setText("Hide Insertion Panel");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem5);

        jMenuItem6.setText("Import Sheet");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        popup1.add(jMenuItem6);

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(400, 400));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        master.setBackground(new java.awt.Color(0, 0, 0));
        master.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 240, 240)), "Locations ", 0, 0, new java.awt.Font("Tekton Pro Cond", 2, 24), new java.awt.Color(204, 240, 240))); // NOI18N
        master.setPreferredSize(new java.awt.Dimension(400, 400));

        LocationTable.setBackground(new java.awt.Color(51, 98, 114));
        LocationTable.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        LocationTable.setForeground(new java.awt.Color(255, 255, 255));
        LocationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        LocationTable.setRowHeight(25);
        LocationTable.setSelectionBackground(new java.awt.Color(22, 224, 236));
        jScrollPane1.setViewportView(LocationTable);
        LocationTable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
        LocationTable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
        LocationTable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        LocationTable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        LocationTable.getColumnModel().getColumn(4).setHeaderValue("Title 5");
        LocationTable.getColumnModel().getColumn(5).setHeaderValue("Title 6");
        LocationTable.getColumnModel().getColumn(6).setHeaderValue("Title 7");
        LocationTable.getColumnModel().getColumn(7).setHeaderValue("Title 8");
        LocationTable.getColumnModel().getColumn(8).setHeaderValue("Title 9");
        LocationTable.getColumnModel().getColumn(9).setHeaderValue("Title 10");
        LocationTable.getColumnModel().getColumn(10).setHeaderValue("Title 11");
        LocationTable.getColumnModel().getColumn(11).setHeaderValue("Title 12");

        javax.swing.GroupLayout masterLayout = new javax.swing.GroupLayout(master);
        master.setLayout(masterLayout);
        masterLayout.setHorizontalGroup(
            masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        masterLayout.setVerticalGroup(
            masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );

        add(master, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 550, 420));

        insertLocationBtn.setBackground(new java.awt.Color(0, 0, 0));
        insertLocationBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\insert.png")); // NOI18N
        insertLocationBtn.setBorderPainted(false);
        insertLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertLocationBtnActionPerformed(evt);
            }
        });
        add(insertLocationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 120, 30));

        deleteLocationBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteLocationBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\delete.png")); // NOI18N
        deleteLocationBtn.setBorderPainted(false);
        deleteLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLocationBtnActionPerformed(evt);
            }
        });
        add(deleteLocationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 80, 30));

        updateLocationBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateLocationBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateLocationBtn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\update.png")); // NOI18N
        updateLocationBtn.setBorderPainted(false);
        updateLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLocationBtnActionPerformed(evt);
            }
        });
        add(updateLocationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, -1));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search.png")); // NOI18N
        search.setBorderPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, 50));

        define_location.setBackground(new java.awt.Color(51, 98, 114));
        define_location.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        define_location.setForeground(new java.awt.Color(255, 255, 255));
        define_location.setToolTipText("");
        define_location.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Code");
        define_location.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 181, 95, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        define_location.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 253, -1, -1));

        save.setBackground(new java.awt.Color(51, 98, 114));
        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\save.png")); // NOI18N
        save.setText(" ");
        save.setBorderPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        define_location.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 371, 140, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacity");
        define_location.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 310, 69, 28));

        code.setBorder(null);
        define_location.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 182, 217, 29));

        desc.setBorder(null);
        define_location.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 223, 217, 69));

        capacity.setBorder(null);
        define_location.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 310, 217, 31));

        building_combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        building_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                building_comboItemStateChanged(evt);
            }
        });
        building_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                building_comboActionPerformed(evt);
            }
        });
        define_location.add(building_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 51, 113, 42));

        floor_combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        define_location.add(floor_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 113, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Choose Building ");
        define_location.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 21, 158, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Choose Floor ");
        define_location.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 122, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Location Type ");
        define_location.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 21, 154, -1));

        type_combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        define_location.add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 51, 113, 42));

        add(define_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 570, 460));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\search2.png")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 196, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\loc.png")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 330, -1));
    }//GEN-END:initComponents


    private void insertLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertLocationBtnActionPerformed
    clearData();
    Location_idUpdate = 0;
    define_location.setVisible(true);  
    }//GEN-LAST:event_insertLocationBtnActionPerformed


    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    try {
        define_location.setVisible(false);
        if (jTextField1.getText()!= null){
        setTableModel(Locationbusiness.searchLocation(jTextField1.getText()));
        jTextField1.setText(null);}
        else 
        setTableModel(Locationbusiness.ListAll()); 
        
    } 
    catch(java.lang.NullPointerException e){
        JOptionPane.showMessageDialog(this, "This location isn't existed ");    
    }
    catch (Exception e) {
        // TODO: Add catch code
        e.printStackTrace();
    }  
    
    }//GEN-LAST:event_searchActionPerformed

    private void deleteLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLocationBtnActionPerformed
    if (LocationTable.getSelectedRow() >= 0) {
          try{ 
               define_location.setVisible(false);
              String LocationIndex = LocationTable.getValueAt(LocationTable.getSelectedRow(), 0).toString();
               LocationDto selected_Location = new LocationDto(); // selected Location, To delete.
               selected_Location.setCode(LocationIndex); 
               if (Locationbusiness.deleteLocation(selected_Location)) {  //if returned true, location will be deleted
                      JOptionPane.showMessageDialog(this, "Location is Deleted Successfully");
                      setTableModel(Locationbusiness.ListAll()); 
                      LocationTable.repaint() ; }
              else
              JOptionPane.showMessageDialog(this, "Can't delete this Location ! ");         
             } 
         catch(Exception e){
            e.printStackTrace();
            }
    }
    else { // if no location is selected on the table
            JOptionPane.showMessageDialog(this, "you should select a location to delete  ");
        }
    }//GEN-LAST:event_deleteLocationBtnActionPerformed

    private void updateLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLocationBtnActionPerformed
     if (LocationTable.getSelectedRow()>=0) {
         // No need to update Id, so we hide it//
            
           try{
             code.setText(LocationTable.getValueAt(LocationTable.getSelectedRow(), 0).toString());
             desc.setText(LocationTable.getValueAt(LocationTable.getSelectedRow(), 1).toString());
             capacity.setText(LocationTable.getValueAt(LocationTable.getSelectedRow(), 2).toString());
             define_location.setVisible(true);
               // flag , if it equals 1 we update, if zero we insert  
             Location_idUpdate = 1; 
               code.setEnabled(false);
           }catch(Exception e){
               e.printStackTrace();
      }
     }
   else JOptionPane.showMessageDialog(this, " you should select a location to update ");
   
    }//GEN-LAST:event_updateLocationBtnActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     try{ 
            //Create Dto Objects to get data from UI and then pass it to Bao//
            BuildingDto BuildingObject = new BuildingDto();
            FloorDto FloorObject = new FloorDto();
            LocationTypeDto LocationTypeObject = new LocationTypeDto();
            LocationDto LocationObject = new LocationDto();
          
            //To get data from UI//
            LocationObject.setCode(code.getText());
            LocationObject.setCapacity(Integer.parseInt(capacity.getText()));
            LocationObject.setDescription(desc.getText());
          
          //  LocationObject.setLocation_equipments(EquipmentList.getSelectedValuesList());
           
           
             //To set id for building ,floor , locationType//
            BuildingObject.setBuilding_id(Allbuildings.get(building_combo.getSelectedIndex()).getBuilding_id());
            FloorObject.setBuilding(BuildingObject);
            FloorObject.setFloor_id(Allfloors.get(floor_combo.getSelectedIndex()).getFloor_id());
            LocationObject.setFloor(FloorObject);
            LocationTypeObject.setLocationType_id(AlllocationTypes.get(type_combo.getSelectedIndex()).getLocationType_id());
            LocationObject.setType(LocationTypeObject);
         
             //To Check whether to insert or update data// 
            if(Location_idUpdate!=0)
            {     
                    LocationObject.setUpdatedBy(LoginEngine.currentUser);
                    LocationObject.setUpdate_Date(new Date(System.currentTimeMillis()));
                    try{   if(Locationbusiness.updateLocation(LocationObject)) {
                    JOptionPane.showMessageDialog(this, "Location Updated Successfully");
                    setTableModel(Locationbusiness.ListAll());
                      }
                else
                JOptionPane.showMessageDialog(this, "Error occured in update");}
                    catch(LTAException ex){
                    JOptionPane.showMessageDialog(this, "Error in Data base");}
                    }
            
            else
            {    
            LocationObject.setInsertedBy(LoginEngine.currentUser);
            LocationObject.setInertion_Date(new Date(System.currentTimeMillis()));
                try {   if( Locationbusiness.insertLocation(LocationObject)){
                JOptionPane.showMessageDialog(this, "Location Saved Successfully");
                setTableModel(Locationbusiness.ListAll());
                code.setEnabled(true);
            }else
            JOptionPane.showMessageDialog(this, "Error occured in insertion");}
                catch(LTAException ex){
                    JOptionPane.showMessageDialog(this, "Error in Data base");}
        }

        } catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error occured, There is an Error in data Type Or Some Of Data is Missed !");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveActionPerformed
   
    private void building_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_building_comboActionPerformed
    //  if (!(building_combo.getSelectedItem().equals(null))) {
      floor_combo.removeAllItems();
      BuildingDto SelectedBuilding = new BuildingDto();
      SelectedBuilding.setBuilding_id(Allbuildings.get(building_combo.getSelectedIndex()).getBuilding_id());     
      Allfloors = Floorbusiness.filterFloor(SelectedBuilding.getBuilding_id()); 
      listComboFloors(Allfloors);

    //  }    
    
    }//GEN-LAST:event_building_comboActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed
   
    private void building_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_building_comboItemStateChanged
       
    }//GEN-LAST:event_building_comboItemStateChanged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    if(evt.isPopupTrigger())
        {
        popup1.show(this, evt.getX(), evt.getY());    
        }
    }//GEN-LAST:event_formMouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Utilities.printRecord(master);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        Utilities.export_PDF(LocationTable);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        Utilities.export_XLX(LocationTable);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        define_location.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        //TableReset(readlist());
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LocationTable;
    private javax.swing.JComboBox building_combo;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField code;
    private javax.swing.JPanel define_location;
    private javax.swing.JButton deleteLocationBtn;
    private javax.swing.JTextField desc;
    private javax.swing.JComboBox floor_combo;
    private javax.swing.JButton insertLocationBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel master;
    private javax.swing.JPopupMenu popup1;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JComboBox type_combo;
    private javax.swing.JButton updateLocationBtn;
    // End of variables declaration//GEN-END:variables
    
    // this method just to clear text and reset the valus on the insert panel
    void clearData() { // clear prvious data
        code.setText(null);
        desc.setText(null);
        capacity.setText(null);
        
    }
    
    
   
}
