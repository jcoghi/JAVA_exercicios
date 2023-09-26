
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        criptografar = new javax.swing.JCheckBox();
        descriptografar = new javax.swing.JCheckBox();
        txtInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtChave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifra de Cesar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cifra de Cesar");

        txtFinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mensagem Final:");

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        criptografar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        criptografar.setText("Criptografar");
        criptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criptografarActionPerformed(evt);
            }
        });

        descriptografar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descriptografar.setText("Descriptografar");
        descriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptografarActionPerformed(evt);
            }
        });

        txtInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mensagem Inicial:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Chave:");

        txtChave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(criptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptografar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEnviar))))
                    .addComponent(txtFinal))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(txtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criptografar)
                    .addComponent(descriptografar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnEnviar)
                    .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel3)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criptografarActionPerformed
        if(criptografar.isSelected()) {
            descriptografar.setSelected(false);
        }
    }//GEN-LAST:event_criptografarActionPerformed

    private void descriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptografarActionPerformed
        if(descriptografar.isSelected()) {
            criptografar.setSelected(false);
        }
    }//GEN-LAST:event_descriptografarActionPerformed

    
    public static void escreverTexto(String caminho, String texto) {
        try ( // Não precisa usar o close de recursos porque já usamos try resources
                FileWriter criadoArquivo = new FileWriter(caminho, true); //true -> Cria ou abre o arquivo e escreve ao final do conteúdo do arquivo
                BufferedWriter buffer = new BufferedWriter(criadoArquivo);
                PrintWriter escritorArquivo = new PrintWriter(buffer);
                ){
            
            escritorArquivo.append(texto);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder mensagem = new StringBuilder();
        StringBuilder novaMensagem = new StringBuilder();
        String entradaTexto = txtInicial.getText();
        int chave = Integer.parseInt(txtChave.getText());
        
        
        for (int i = 0; i < entradaTexto.length(); i++) {
            mensagem.append(String.valueOf(entradaTexto.charAt(i)));
        }
        if(criptografar.isSelected()){
        for (int letra = 0; letra < mensagem.length(); letra++) {
            if (mensagem.charAt(letra) == 32) {
                novaMensagem.append((char) (32));
            } else {
                int test = mensagem.charAt(letra) + chave;
                if (test > 122) {
                    System.out.println("Passou do Z");
                    test = test - 26;
                }
                novaMensagem.append((char) (test));
            }
        }
        escreverTexto("mensagem.txt", String.valueOf(novaMensagem));
        txtFinal.setText(String.valueOf(novaMensagem));
        }
        else if(descriptografar.isSelected()){
        for (int letra = 0; letra < mensagem.length(); letra++) {
            if (mensagem.charAt(letra) == 32) {
                novaMensagem.append((char) (32));
            } else {
                int test = mensagem.charAt(letra) - chave;
                if (test < 97) {
                    System.out.println("Passou do a");
                    test = test + 26;
                }
                novaMensagem.append((char) (test));
            }
        }
        escreverTexto("mensagem.txt", String.valueOf(novaMensagem)+"\n");
        txtFinal.setText(String.valueOf(novaMensagem));
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

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
    private javax.swing.JButton btnEnviar;
    private javax.swing.JCheckBox criptografar;
    private javax.swing.JCheckBox descriptografar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtChave;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicial;
    // End of variables declaration//GEN-END:variables
}
