/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_GUI_v1;

import final_year_project_logic_v1.TestDataGen;

/**
 *
 * @author my301
 */
public class Step_One_Gen extends javax.swing.JFrame {

    /**
     * Creates new form Step_One_Gen
     */
    public Step_One_Gen() {
        initComponents();
//          rangeFrom.disable();
//            rangeTO.disable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rangeFrom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nextOne = new javax.swing.JButton();
        selectFormatCombo = new javax.swing.JComboBox();
        note = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rangeTO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("TO");

        jLabel5.setText("Length");

        jLabel3.setText("STEP ONE");

        jLabel2.setText("Format ");

        nextOne.setText("Next");
        nextOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextOneActionPerformed(evt);
            }
        });

        selectFormatCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Custom", "Random" }));
        selectFormatCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFormatComboMouseClicked(evt);
            }
        });
        selectFormatCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectFormatComboItemStateChanged(evt);
            }
        });
        selectFormatCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFormatComboActionPerformed(evt);
            }
        });

        note.setText("Note");

        jLabel4.setText("Range");

        rangeTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeTOActionPerformed(evt);
            }
        });

        jLabel1.setText("TEST DATA GENERATOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(note)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rangeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rangeTO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(nextOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(selectFormatCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFormatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rangeTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextOne)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextOneActionPerformed
        // TODO add your handling code here:
        if(selectFormatCombo.getSelectedItem().equals("Custom"))
        {
            if(length.getText().equals(""))
            {
                note.setText("Note: please enter a value in the length feild");
            }
            else
            {
                if(Integer.parseInt(length.getText())== 0)
                {
                    note.setText("Note: please enter the length greater");
                }
                else
                {
                    for(int i= 0; i<Integer.parseInt(length.getText()); i++)
                    {
                        this.setVisible(false);
                        Step_Two_Gen stepTwoPanel = new Step_Two_Gen();
                        stepTwoPanel.setSize(480,380);
                        stepTwoPanel.setLocationRelativeTo(null);
                        ///stepTwoPanel.setDefaultCloseOperation(Step_One1_Gen.DISPOSE_ON_CLOSE); not sure
                        stepTwoPanel.setVisible(true);
                        //this.dispose(); not sure
                    }
                }
            }
        }
        else 
        {
            if(rangeFrom.equals("") || rangeTO.equals(""))
            {
                 note.setText("Note: please enter value in range feilds");
            }
            else{
                
                if(Integer.parseInt(rangeFrom.getText()) > Integer.parseInt(rangeTO.getText()))
                {
                    note.setText("Note: Range From value has to less then Range To value");
                }
                else{                        
                    
                TestDataGen obj = new TestDataGen();
                obj.intGen(rangeFrom.getText(),rangeTO.getText());
           
                
            }
                    
              
            }
        }
        
    }//GEN-LAST:event_nextOneActionPerformed

    private void selectFormatComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFormatComboMouseClicked
        // TODO add your handling code here:
        
        /** need to be deleted **/

    }//GEN-LAST:event_selectFormatComboMouseClicked

    private void selectFormatComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectFormatComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFormatComboItemStateChanged

    private void selectFormatComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFormatComboActionPerformed
        // TODO add your handling code here:
        if(selectFormatCombo.getSelectedItem().equals("Custom"))
        {
            System.out.println("xxxxx");
            rangeFrom.disable();
            rangeTO.disable();
            length.enable();
       
        }
        else
        {
            System.out.println("xxxxxzzzzz");
            length.disable();
            rangeFrom.enable();
            rangeTO.enable();
        }
    }//GEN-LAST:event_selectFormatComboActionPerformed

    private void rangeTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangeTOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Step_One_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Step_One_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Step_One_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Step_One_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Step_One_Gen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField length;
    private javax.swing.JButton nextOne;
    private javax.swing.JLabel note;
    private javax.swing.JTextField rangeFrom;
    private javax.swing.JTextField rangeTO;
    private javax.swing.JComboBox selectFormatCombo;
    // End of variables declaration//GEN-END:variables
}
