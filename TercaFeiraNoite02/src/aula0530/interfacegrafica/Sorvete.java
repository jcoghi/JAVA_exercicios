/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula0530.interfacegrafica;

/**
 *
 * @author joaof
 */
public class Sorvete extends javax.swing.JFrame {

    double total;
    
    public Sorvete() {
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
        jLabel1 = new javax.swing.JLabel();
        rdbChocolate = new javax.swing.JRadioButton();
        rdbMorango = new javax.swing.JRadioButton();
        rdbMilhoVerde = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ckbChocolate = new javax.swing.JCheckBox();
        ckbChocolate.setEnabled(false);
        ckbCaramelo = new javax.swing.JCheckBox();
        ckbCaramelo.setEnabled(false);
        ckbPistache = new javax.swing.JCheckBox();
        ckbPistache.setEnabled(false);
        jPanel3 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SABORES");

        rdbChocolate.setText("Chocolate - R$ 5,00");
        rdbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbChocolateActionPerformed(evt);
            }
        });

        rdbMorango.setText("Morango - R$ 10,00");
        rdbMorango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMorangoActionPerformed(evt);
            }
        });

        rdbMilhoVerde.setText("Milho Verde - R$ 15,00");
        rdbMilhoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMilhoVerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbMorango, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(rdbMilhoVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbMorango)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbMilhoVerde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COBERTURAS");

        ckbChocolate.setText("Chocolate - R$ 4,00");
        ckbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbChocolateActionPerformed(evt);
            }
        });

        ckbCaramelo.setText("Caramelo - R$ 10,00");
        ckbCaramelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCarameloActionPerformed(evt);
            }
        });

        ckbPistache.setText("Pistache - R$ 25,00");
        ckbPistache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbPistacheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbCaramelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(ckbPistache, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(ckbChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbCaramelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbPistache)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotal.setText("TOTAL:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ligarBotoes(){
        ckbChocolate.setEnabled(true);
        ckbCaramelo.setEnabled(true);
        ckbPistache.setEnabled(true);
    }
    
    public void limparTela(){
        rdbChocolate.setSelected(true);
        rdbMorango.setSelected(false);
        rdbMilhoVerde.setSelected(false);
        total = 5;
        
        ckbChocolate.setSelected(false);
        ckbCaramelo.setSelected(false);
        ckbPistache.setSelected(false);
        lblTotal.setText("Total: R$ " + String.valueOf(total));
    }
    
    private void rdbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbChocolateActionPerformed
        
        ligarBotoes();
        
        if(rdbChocolate.isSelected()) {
            rdbMorango.setSelected(false);
            rdbMilhoVerde.setSelected(false);
            total = 5;
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbChocolateActionPerformed

    private void rdbMorangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMorangoActionPerformed
        ligarBotoes();
        if(rdbMorango.isSelected()) {
            rdbChocolate.setSelected(false);
            rdbMilhoVerde.setSelected(false);
            total = 10;
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbMorangoActionPerformed

    private void rdbMilhoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMilhoVerdeActionPerformed
        ligarBotoes();
        if(rdbMilhoVerde.isSelected()) {
            rdbChocolate.setSelected(false);
            rdbMorango.setSelected(false);
            total = 15;
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_rdbMilhoVerdeActionPerformed

    private void ckbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbChocolateActionPerformed
        
        if(ckbChocolate.isSelected()) {
            total += 4;
        } else{
            limparTela();
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_ckbChocolateActionPerformed

    private void ckbCarameloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCarameloActionPerformed
        if(ckbCaramelo.isSelected()) {
            total += 10;
        } else{
            limparTela();
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_ckbCarameloActionPerformed

    private void ckbPistacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbPistacheActionPerformed
        if(ckbPistache.isSelected()) {
            total += 25;
        } else{
            limparTela();
        }
        lblTotal.setText("TOTAL: R$ " + String.valueOf(total));
    }//GEN-LAST:event_ckbPistacheActionPerformed

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
            java.util.logging.Logger.getLogger(Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorvete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckbCaramelo;
    private javax.swing.JCheckBox ckbChocolate;
    private javax.swing.JCheckBox ckbPistache;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbChocolate;
    private javax.swing.JRadioButton rdbMilhoVerde;
    private javax.swing.JRadioButton rdbMorango;
    // End of variables declaration//GEN-END:variables
}
