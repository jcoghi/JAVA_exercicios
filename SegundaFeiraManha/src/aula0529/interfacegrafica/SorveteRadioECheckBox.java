package aula0529.interfacegrafica;

public class SorveteRadioECheckBox extends javax.swing.JFrame {

    private double total;
    
    public SorveteRadioECheckBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdbChocolate = new javax.swing.JRadioButton();
        rdbCreme = new javax.swing.JRadioButton();
        rdbPistache = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        ckbChocolate = new javax.swing.JCheckBox();
        ckbCaramelo = new javax.swing.JCheckBox();
        ckbAvela = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora de Sorvete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SABORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        rdbChocolate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbChocolate.setText("CHOCOLATE - R$ 12,00");
        rdbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbChocolateActionPerformed(evt);
            }
        });

        rdbCreme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbCreme.setText("CREME - R$ 7,00");
        rdbCreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCremeActionPerformed(evt);
            }
        });

        rdbPistache.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbPistache.setText("PISTACHE - R$ 15,00");
        rdbPistache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPistacheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rdbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(rdbCreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rdbPistache, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbChocolate)
                .addGap(18, 18, 18)
                .addComponent(rdbCreme)
                .addGap(18, 18, 18)
                .addComponent(rdbPistache)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COBERTURAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        ckbChocolate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbChocolate.setText("CHOCOLATE - R$ 3,00");
        ckbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbChocolateActionPerformed(evt);
            }
        });

        ckbCaramelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbCaramelo.setText("CARAMELO - R$ 5,00");
        ckbCaramelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCarameloActionPerformed(evt);
            }
        });

        ckbAvela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbAvela.setText("AVELÃ - R$ 35,00");
        ckbAvela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAvelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbCaramelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(ckbAvela, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbChocolate)
                .addGap(18, 18, 18)
                .addComponent(ckbCaramelo)
                .addGap(18, 18, 18)
                .addComponent(ckbAvela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL:"));
        jPanel4.setPreferredSize(new java.awt.Dimension(338, 60));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbChocolateActionPerformed
        
        if (rdbChocolate.isSelected()) {
            rdbCreme.setSelected(false);
            rdbPistache.setSelected(false);
            total = 12;
        }
        
        lblTotal.setText("R$ " + total);
    }//GEN-LAST:event_rdbChocolateActionPerformed

    private void rdbCremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCremeActionPerformed
        
        if(rdbCreme.isSelected()) {
            rdbChocolate.setSelected(false);
            rdbPistache.setSelected(false);
            total = 7;
        }
        
        lblTotal.setText("R$ " + total);
    }//GEN-LAST:event_rdbCremeActionPerformed

    private void rdbPistacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPistacheActionPerformed
        
        if(rdbPistache.isSelected()) {
            rdbChocolate.setSelected(false);
            rdbCreme.setSelected(false);
            total = 15;
            
        }
        
        lblTotal.setText("R$ " + total);
                
    }//GEN-LAST:event_rdbPistacheActionPerformed

    private void ckbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbChocolateActionPerformed
        // TODO add your handling code here:
        if (ckbChocolate.isSelected()) {
            total += 3;
        } else {
            total -= 3;
        }
        lblTotal.setText("R$ " + total);
    }//GEN-LAST:event_ckbChocolateActionPerformed

    private void ckbCarameloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCarameloActionPerformed
        // TODO add your handling code here:
        if (ckbCaramelo.isSelected()) {
            total += 3;
        }else {
            total -= 3;
        }
        lblTotal.setText("R$ " + total);
    }//GEN-LAST:event_ckbCarameloActionPerformed

    private void ckbAvelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAvelaActionPerformed
        // TODO add your handling code here:
        if (ckbAvela.isSelected()) {
            total += 35;
        }
        lblTotal.setText("R$ " + total);
    }//GEN-LAST:event_ckbAvelaActionPerformed

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
            java.util.logging.Logger.getLogger(SorveteRadioECheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SorveteRadioECheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SorveteRadioECheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SorveteRadioECheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SorveteRadioECheckBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckbAvela;
    private javax.swing.JCheckBox ckbCaramelo;
    private javax.swing.JCheckBox ckbChocolate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbChocolate;
    private javax.swing.JRadioButton rdbCreme;
    private javax.swing.JRadioButton rdbPistache;
    // End of variables declaration//GEN-END:variables
}
