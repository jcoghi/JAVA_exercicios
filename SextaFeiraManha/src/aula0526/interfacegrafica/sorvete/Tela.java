package aula0526.interfacegrafica.sorvete;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }
    double total = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rdbChocolate = new javax.swing.JRadioButton();
        rdbCreme = new javax.swing.JRadioButton();
        rdbFlocos = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cbCaramelo = new javax.swing.JCheckBox();
        cbChocolate = new javax.swing.JCheckBox();
        cbMenta = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorveteria do Jão");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "<html><h2>SABORES</h2></html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        rdbChocolate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbChocolate.setText("CHOCOLATE - R$ 10,00");
        rdbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbChocolateActionPerformed(evt);
            }
        });

        rdbCreme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbCreme.setText("CREME- R$ 5,00");
        rdbCreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCremeActionPerformed(evt);
            }
        });

        rdbFlocos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbFlocos.setText("FLOCOS- R$ 7,00");
        rdbFlocos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFlocosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbCreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbFlocos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbChocolate)
                .addGap(18, 18, 18)
                .addComponent(rdbCreme)
                .addGap(18, 18, 18)
                .addComponent(rdbFlocos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "<html><h2>COBERTURAS</h2></html>", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        cbCaramelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCaramelo.setText("CARAMELO - R$ 2,00");
        cbCaramelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarameloActionPerformed(evt);
            }
        });

        cbChocolate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChocolate.setText("CHOCOLATE - R$ 3,00");
        cbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChocolateActionPerformed(evt);
            }
        });

        cbMenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMenta.setText("MENTA - R$ 5,00");
        cbMenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCaramelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCaramelo)
                .addGap(18, 18, 18)
                .addComponent(cbChocolate)
                .addGap(18, 18, 18)
                .addComponent(cbMenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><h2>TOTAL:</h2></html>");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 102, 51));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbChocolateActionPerformed
        
        cbCaramelo.setSelected(false);
        cbChocolate.setSelected(false);
        cbMenta.setSelected(false);
        
        if(rdbChocolate.isSelected()) {
            rdbCreme.setSelected(false);
            rdbFlocos.setSelected(false);
            total = 10;
        }   
        
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbChocolateActionPerformed

    private void rdbCremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCremeActionPerformed
        
        cbCaramelo.setSelected(false);
        cbChocolate.setSelected(false);
        cbMenta.setSelected(false);
        
        if(rdbCreme.isSelected()) {
            rdbChocolate.setSelected(false);
            rdbFlocos.setSelected(false);
            total = 5;
        }
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbCremeActionPerformed

    private void rdbFlocosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFlocosActionPerformed
        
        cbCaramelo.setSelected(false);
        cbChocolate.setSelected(false);
        cbMenta.setSelected(false);
        
        if(rdbFlocos.isSelected()) {
            rdbCreme.setSelected(false);
            rdbChocolate.setSelected(false);
            total = 7;
        }    
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbFlocosActionPerformed

    private void cbCarameloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarameloActionPerformed
        if(cbCaramelo.isSelected()) {
            total += 2;
        }
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_cbCarameloActionPerformed

    private void cbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChocolateActionPerformed
        if(cbChocolate.isSelected()) {
            total += 2;
        }
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_cbChocolateActionPerformed

    private void cbMentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMentaActionPerformed
        if(cbMenta.isSelected()) {
            total += 2;
        }
        lblTotal.setText("R$ " + String.valueOf(total));
    }//GEN-LAST:event_cbMentaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbCaramelo;
    private javax.swing.JCheckBox cbChocolate;
    private javax.swing.JCheckBox cbMenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbChocolate;
    private javax.swing.JRadioButton rdbCreme;
    private javax.swing.JRadioButton rdbFlocos;
    // End of variables declaration//GEN-END:variables
}
