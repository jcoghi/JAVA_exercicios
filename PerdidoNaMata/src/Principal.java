
import java.util.Random;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    int fome = 0;
    int comida = 0;
    int agua = 0;
    int sede = 0;
    int sono = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Comida = new javax.swing.JLabel();
        Agua = new javax.swing.JLabel();
        Madeira = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Fome = new javax.swing.JLabel();
        Sede = new javax.swing.JLabel();
        Sono = new javax.swing.JLabel();
        Ferimentos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Comer = new javax.swing.JButton();
        Comer.setEnabled(false);
        Beber = new javax.swing.JButton();
        Beber.setEnabled(false);
        Dormir = new javax.swing.JButton();
        Dormir.setEnabled(false);
        Cacar = new javax.swing.JButton();
        Cacar.setEnabled(false);
        PegarMadeira = new javax.swing.JButton();
        PegarMadeira.setEnabled(false);
        PegarAgua = new javax.swing.JButton();
        PegarAgua.setEnabled(false);
        Comecar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Mensagem = new javax.swing.JLabel();
        Recomecar = new javax.swing.JButton();
        Recomecar.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perdido na Floresta");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Perdido na Floresta"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conquistas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(760, 150));
        jPanel2.setMinimumSize(new java.awt.Dimension(760, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 150));
        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        Comida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comida", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        Comida.setMaximumSize(new java.awt.Dimension(200, 250));
        Comida.setMinimumSize(new java.awt.Dimension(200, 250));
        Comida.setName(""); // NOI18N
        Comida.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel2.add(Comida);

        Agua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Água", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.add(Agua);

        Madeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Madeira.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Madeira", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.add(Madeira);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(760, 150));
        jPanel3.setMinimumSize(new java.awt.Dimension(760, 150));
        jPanel3.setPreferredSize(new java.awt.Dimension(760, 150));
        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        Fome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fome", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        Fome.setMaximumSize(new java.awt.Dimension(200, 250));
        Fome.setMinimumSize(new java.awt.Dimension(200, 250));
        Fome.setName(""); // NOI18N
        Fome.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel3.add(Fome);

        Sede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sede.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sede", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel3.add(Sede);

        Sono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel3.add(Sono);

        Ferimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ferimentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ferimentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel3.add(Ferimentos);

        jPanel1.setMaximumSize(new java.awt.Dimension(760, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(760, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 250));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        Comer.setText("Comer");
        Comer.setToolTipText("");
        Comer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComerActionPerformed(evt);
            }
        });

        Beber.setText("Beber");
        Beber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeberActionPerformed(evt);
            }
        });

        Dormir.setText("Dormir");
        Dormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DormirActionPerformed(evt);
            }
        });

        Cacar.setText("Sair para Caçar");
        Cacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CacarActionPerformed(evt);
            }
        });

        PegarMadeira.setText("Pegar Madeira");

        PegarAgua.setText("Pegar Água");

        Comecar.setText("Começar");
        Comecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComecarActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Mensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensagem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Recomecar.setText("Recomeçar");
        Recomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecomecarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Comer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Beber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dormir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PegarAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PegarMadeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Comecar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comecar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Recomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(Comer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Beber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dormir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PegarAgua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PegarMadeira)
                        .addGap(42, 42, 42))
                    .addComponent(Mensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        
    }//GEN-LAST:event_jPanel1MouseEntered
    
    private void ComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComerActionPerformed
        comida = Integer.parseInt(Comida.getText());
        fome = Integer.parseInt(Fome.getText());
        sede = Integer.parseInt(Sede.getText());
        sono = Integer.parseInt(Sono.getText());
        
        if(comida > 0 && fome >= 1) {
            if (sede > 0 && sede < 9){
            Mensagem.setText("<html><p><center>"
                    + "Dimiua 1 de fome para cada 1 de comida."
                    + "<br><br> Se a fome chegar a 10, o você morre de fome."
                    + "<br><br><strong>O que deseja fazer?</strong>"
                    + "</p></html>");
            Fome.setText(String.valueOf(fome - 2));
            Comida.setText(String.valueOf(comida - 1));
            Sede.setText(String.valueOf(sede + 1));
            Sono.setText(String.valueOf(sono + 1));
            if (sono >= 10){
                Mensagem.setText("<html><p><center>"
                    + "<strong>Você desmaiou de sono.</strong>"
                    + "</p></html>");
                Fome.setText(String.valueOf(fome + 2));
                Sede.setText(String.valueOf(sede + 1));
                Sono.setText("5");
            }
            } else if (sede == 9) {
                Mensagem.setText("<html><p><center>"
                    + "<strong>Você está com muita sede para comer.</strong>"
                    + "</p></html>");
            } else {
                Mensagem.setText("<html><p><center>"
                    + "<strong>Você morreu de sede.</strong>"
                    + "</p></html>");
            }
        } else if (comida == 0 && fome >= 1) {
            Mensagem.setText("<html><p><center>"
                    + "Você <strong>não </strong>"
                    + "tem comida. <br><br>"
                    + "Precisa conseguir comida para comer."
                    + "<br><br><strong>O que deseja fazer?</strong>"
                    + "</p></html>");
        }else if (fome >= 0 && fome < 1) {
            Mensagem.setText("<html><p><center>"
                    + "Você está sem fome"
                    + "</p></html>");
        } else if (fome >= 10) {
            Mensagem.setText("<html><p><center>"
                    + "<strong>Você morreu de fome</strong>"
                    + "</p></html>");
        }
    }//GEN-LAST:event_ComerActionPerformed

    private void ComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComecarActionPerformed
        
        Comer.setEnabled(true);
        Beber.setEnabled(true);
        Dormir.setEnabled(true);
        Cacar.setEnabled(true);
        PegarAgua.setEnabled(true);
        PegarMadeira.setEnabled(true);
        Recomecar.setEnabled(true);
        Comecar.setEnabled(false);
        String mensagem = "<html><p><center>Você acordou em uma floresta.<br><br>"
             + "Olhando ao seu redor, percebeu que havia uma machadinha perto de você."
             + "<br><br>Você tenta se lembrar como chegou lá, mas não consegue."
             + "<br><br> Sua cabeça doi muito<br><br><strong>O que deseja fazer?</strong></p></html>";
        Mensagem.setText(mensagem);

        Comida.setText("0");
        Agua.setText("0");
        Madeira.setText("0");
        Fome.setText("5");
        Sede.setText("3");
        Sono.setText("0");
        Ferimentos.setText("<html><p>"
                + "Dor de cabeça"
                + "</p></html>");
  
    }//GEN-LAST:event_ComecarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void BeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeberActionPerformed
        
        agua = Integer.parseInt(Agua.getText());
        sede = Integer.parseInt(Sede.getText());
        fome = Integer.parseInt(Fome.getText());
        
        if(agua > 0 && sede <= 10) {
            Mensagem.setText("<html><p><center>"
                    + "Dimiua 2 de sede para cada 1 de água."
                    + "<br><br> Se a sede chegar a 10, o você morre de sede."
                    + "<br><br><strong>O que deseja fazer?</strong>"
                    + "</p></html>");
            agua =- 1;
            fome =- 1;
            Sede.setText("0");
            Fome.setText(String.valueOf(fome-1));
          Agua.setText(String.valueOf(agua));
        } else if (agua == 0 && sede <= 10) {
            Mensagem.setText("<html><p><center>"
                    + "Você <strong>não </strong>"
                    + "tem água. <br><br>"
                    + "Precisa conseguir água para beber."
                    + "<br><br><strong>O que deseja fazer?</strong>"
                    + "</p></html>");
        }else if (sede > 10) {
            Mensagem.setText("<html><p><center>"
                    + "Você morreu de fome"
                    + "</p></html>");
        }
    }//GEN-LAST:event_BeberActionPerformed

    private void DormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DormirActionPerformed
        fome = getFome(Fome.getText());
        sede = getFome(Sede.getText());
        sono = getFome(Sono.getText());
        
        if (sono >= 5){
            if (fome >= 9){
                Mensagem.setText("<html><p><center>"
                + "Você está com muita <strong>fome</strong> para dormir"
                + "</p></html>");
            } else if (sede >= 9) {
            Mensagem.setText("<html><p><center>"
                + "Você está com muita <strong>sede</strong> para dormir"
                + "</p></html>");
        } else if (sono <=9) {
            Mensagem.setText("<html><p><center>"
                + "você dormiu <strong>muito</strong> bem"
                + "</p></html>");
            Sono.setText("0");
        }
        } else {
            Mensagem.setText("<html><p><center>"
                    + "Você está sem sono!!"
                    +"</p></html>");
        }
        
    }//GEN-LAST:event_DormirActionPerformed

    private void CacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CacarActionPerformed
        // TODO add your handling code here:
        comida = Integer.parseInt(Comida.getText());
        sono = Integer.parseInt(Sono.getText());
        sede = Integer.parseInt(Sede.getText());
        fome = Integer.parseInt(Fome.getText());
        
        Random aleatorio = new Random();
        int random = aleatorio.nextInt(0, 10);
        if (random <= 6) {
            comida++;
            Comida.setText(String.valueOf(comida));
        }
        sono++;
        sede++;
        fome++;
        Sono.setText(String.valueOf(sono));
        Sede.setText(String.valueOf(sede));
        Fome.setText(String.valueOf(fome));
        
       
    }//GEN-LAST:event_CacarActionPerformed

    private void RecomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecomecarActionPerformed
        
        Random gerador = new Random();
        Comer.setEnabled(true);
        Beber.setEnabled(true);
        Dormir.setEnabled(true);
        Cacar.setEnabled(true);
        PegarAgua.setEnabled(true);
        PegarMadeira.setEnabled(true);
        Recomecar.setEnabled(true);
        Comecar.setEnabled(false);
        String mensagem = "<html><p><center>Você acordou em uma floresta.<br><br>"
             + "Olhando ao seu redor, percebeu que havia uma machadinha perto de você."
             + "<br><br>Você tenta se lembrar como chegou lá, mas não consegue."
             + "<br><br> Sua cabeça doi muito<br><br><strong>O que deseja fazer?</strong></p></html>";
        Mensagem.setText(mensagem);

        Comida.setText("0");
        Agua.setText("0");
        Madeira.setText("0");
        Fome.setText(String.valueOf(gerador.nextInt(2, 7)));
        Sede.setText(String.valueOf(gerador.nextInt(2, 7)));
        Sono.setText(String.valueOf(gerador.nextInt( 3)));
        Ferimentos.setText("<html><p>"
                + "Dor de cabeça"
                + "</p></html>");
    }//GEN-LAST:event_RecomecarActionPerformed

  
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
    
    public boolean verificaFome(int fome){
        if (fome >= 10){
            return false;
        }
        return true;
    }
    
    public boolean verificaSede(int sede){
        if (sede >= 10) {
            return false;
        }
        return true;
    }
    public boolean verificaSono(int sono){
        if (sono >- 10){
            return false;
        }
        return true;
    }
    
    public int getFome(String fome){
        int fomeAtual = Integer.parseInt(fome);
        return fomeAtual;
    }
    
    public int getSede(String sede){
        int sedeAtual = Integer.parseInt(sede);
        return sedeAtual;
    }

    public int getSono(String sono){
        int sonoAtual = Integer.parseInt(sono);
        return sonoAtual;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agua;
    private javax.swing.JButton Beber;
    private javax.swing.JButton Cacar;
    private javax.swing.JButton Comecar;
    private javax.swing.JButton Comer;
    private javax.swing.JLabel Comida;
    private javax.swing.JButton Dormir;
    private javax.swing.JLabel Ferimentos;
    private javax.swing.JLabel Fome;
    private javax.swing.JLabel Madeira;
    private javax.swing.JLabel Mensagem;
    private javax.swing.JButton PegarAgua;
    private javax.swing.JButton PegarMadeira;
    private javax.swing.JButton Recomecar;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Sede;
    private javax.swing.JLabel Sono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
