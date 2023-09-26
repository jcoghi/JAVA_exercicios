package aula0522.interfacegrafica.exemplo01;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBotoes = new javax.swing.JPanel();
        btnOla = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jMensagens = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste");
        setBackground(new java.awt.Color(51, 255, 51));

        jBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        btnOla.setText("Welcome");
        btnOla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Clear");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBotoesLayout = new javax.swing.GroupLayout(jBotoes);
        jBotoes.setLayout(jBotoesLayout);
        jBotoesLayout.setHorizontalGroup(
            jBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOla, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jBotoesLayout.setVerticalGroup(
            jBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        jMensagens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensagem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jMensagens.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sobrenome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Idade:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Senha:");

        javax.swing.GroupLayout jMensagensLayout = new javax.swing.GroupLayout(jMensagens);
        jMensagens.setLayout(jMensagensLayout);
        jMensagensLayout.setHorizontalGroup(
            jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMensagensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMensagensLayout.createSequentialGroup()
                        .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jMensagensLayout.createSequentialGroup()
                        .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jMensagensLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))
                                .addGroup(jMensagensLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)))
                            .addGroup(jMensagensLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addComponent(txtSobrenome)
                            .addComponent(txtIdade))
                        .addGap(6, 6, 6))
                    .addGroup(jMensagensLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jMensagensLayout.setVerticalGroup(
            jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMensagensLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlaActionPerformed
        String nome = txtNome.getText();
        String sobrenome = txtSobrenome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        char[] senha = pswSenha.getPassword();
        
        txtNome.setEditable(false);
                
        lblMensagem.setText("Senha: " + senha);
    }//GEN-LAST:event_btnOlaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtSobrenome.setText("");
        txtIdade.setText("");
        lblMensagem.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOla;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jBotoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jMensagens;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
