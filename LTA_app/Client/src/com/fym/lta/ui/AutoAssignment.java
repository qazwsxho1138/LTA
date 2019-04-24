
package com.fym.lta.ui;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nada
 */
public class AutoAssignment extends javax.swing.JPanel {

    /** Creates new form AutoAssignment */
    public AutoAssignment() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        upload = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Location Automatic Assignment"));
        setLayout(new java.awt.GridBagLayout());

        upload.setText("Upload File");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(122, 139, 204, 210);
        add(upload, gridBagConstraints);
    }//GEN-END:initComponents

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel file", "xls", "xlsx");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null,"You chose to open this file: " +
                chooser.getSelectedFile().getName());
        }
        else
        JOptionPane.showMessageDialog(null, "Invalid File");
    }//GEN-LAST:event_uploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

}
