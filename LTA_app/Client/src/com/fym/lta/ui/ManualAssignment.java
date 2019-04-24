
package com.fym.lta.ui;

import com.fym.lta.Bao.BaoFactory;
import com.fym.lta.Bao.LocationBao;
import com.fym.lta.dto.LocationDto;

import java.util.List;

/**
 *
 * @author Nada
 */
public class ManualAssignment extends javax.swing.JPanel {
    private LocationBao business;
    private void setTableModel(List<LocationDto> location){
        Object [][] locationArr = new Object [location.size()][2];
        for(int i =0;i<location.size();i++){
            locationArr[i][0] = location.get(i).getCode();
            locationArr[i][1] = location.get(i).getCapacity();
           
        }
        LocatTable.setModel(new javax.swing.table.DefaultTableModel(locationArr,
            new String [] {
                "Location Type", "Building Code"
            }
        ));    
    }

    /** Creates new form ManualAssignment */
    public ManualAssignment() {
        try {
            business = new BaoFactory().createLocationBao();
            initComponents();
        
            setTableModel(business.ListAll());            
            
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new javax.swing.JScrollPane();
        LocatTable = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Location Manual Assignment"));

        LocatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Location Type", " Building Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LocatTable.setToolTipText("");
        LocatTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(LocatTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LocatTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
