package TesteAula1106;

import java.util.Random;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

/**
 *
 * @author joaof
 */
public class Main extends javax.swing.JFrame {

    String imageName;
    private CadastroHerois cadastroHerois;

    public Main() {
        initComponents();
        cadastroHerois = new CadastroHerois(this, rootPaneCheckingEnabled);
    }
    int vidaHeroi, vidaMonstro, vMonstro, vHeroi, ataqueHeroi, ataqueMonstro, defesaHeroi, defesaMonstro;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jogo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblHeroiNome = new javax.swing.JLabel();
        heroLife = new javax.swing.JProgressBar();
        lblHeroiImg = new javax.swing.JLabel();
        lblMonstroNome = new javax.swing.JLabel();
        monsterLife = new javax.swing.JProgressBar();
        lblMonstroImg = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnHeroi = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setEnabled(false);

        jLabel1.setText("Login");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(96, 96, 96))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Main.addTab("Login", jPanel1);

        Jogo.setEnabled(false);

        jPanel4.setLayout(new java.awt.GridLayout(6, 1, 0, 10));

        lblHeroiNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblHeroiNome);

        heroLife.setBackground(new java.awt.Color(255, 0, 0));
        heroLife.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        heroLife.setForeground(new java.awt.Color(0, 0, 0));
        heroLife.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        heroLife.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        heroLife.setEnabled(false);
        jPanel4.add(heroLife);

        lblHeroiImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblHeroiImg);

        lblMonstroNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblMonstroNome);
        jPanel4.add(monsterLife);

        lblMonstroImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblMonstroImg);

        jPanel5.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        btnHeroi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/Hero.jpg"))); // NOI18N
        btnHeroi.setToolTipText("Escolher heroi");
        btnHeroi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeroiActionPerformed(evt);
            }
        });
        jPanel5.add(btnHeroi);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/search.jpg"))); // NOI18N
        jButton4.setToolTipText("Procurar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/weapons.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/man.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);

        javax.swing.GroupLayout JogoLayout = new javax.swing.GroupLayout(Jogo);
        Jogo.setLayout(JogoLayout);
        JogoLayout.setHorizontalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JogoLayout.setVerticalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Main.addTab("Jogar", Jogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = txtNome.getText();
        String senha = String.valueOf(jPasswordField1.getPassword());

        if (nome.equalsIgnoreCase("joao") & senha.equals("123")) {
            Main.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHeroiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeroiActionPerformed

        cadastroHerois.setVisible(true);
        lblHeroiNome.setText(txtNome.getText());
        lblHeroiImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/warrior.jpg")));

        vidaHeroi = Integer.parseInt(cadastroHerois.getHeroInfo().get(1));
        vHeroi = Integer.parseInt(cadastroHerois.getHeroInfo().get(1));
        ataqueHeroi = Integer.parseInt(cadastroHerois.getHeroInfo().get(2));
        defesaHeroi = Integer.parseInt(cadastroHerois.getHeroInfo().get(3));

        VidaHeroi(vHeroi,vidaHeroi);
        btnHeroi.setEnabled(false);
    }//GEN-LAST:event_btnHeroiActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Random gerador = new Random();
        int num = gerador.nextInt(4);

        switch (num) {
            case 0 -> {
                lblMonstroNome.setText(Monstros.ESQUELETO.getNome());
                lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/esqueleto.png")));
                vidaMonstro = Monstros.ESQUELETO.getVida();
                vMonstro = Monstros.ESQUELETO.getVida();
                ataqueMonstro = Monstros.ESQUELETO.getForca();
                defesaMonstro = Monstros.ESQUELETO.getDefesa();
                VidaMonstro(vMonstro, vidaMonstro);
            }
            case 1 -> {
                lblMonstroNome.setText(Monstros.GOBLIN.getNome());
                lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/esqueleto.png")));
                vidaMonstro = Monstros.GOBLIN.getVida();
                vMonstro = Monstros.GOBLIN.getVida();
                ataqueMonstro = Monstros.GOBLIN.getForca();
                defesaMonstro = Monstros.GOBLIN.getDefesa();
                VidaMonstro(vMonstro, vidaMonstro);
            }
            case 2 -> {
                lblMonstroNome.setText(String.valueOf(Monstros.SLIME.getNome()));
                lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/esqueleto.png")));
                vidaMonstro = Monstros.SLIME.getVida();
                vMonstro = Monstros.SLIME.getVida();
                ataqueMonstro = Monstros.SLIME.getForca();
                defesaMonstro = Monstros.SLIME.getDefesa();
                VidaMonstro(vMonstro, vidaMonstro);
            }
            case 3 -> {
                lblMonstroNome.setText(Monstros.ZUMBIE.getNome());
                lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TesteAula1106/esqueleto.png")));
                vidaMonstro = Monstros.ZUMBIE.getVida();
                vMonstro = Monstros.ZUMBIE.getVida();
                ataqueMonstro = Monstros.ZUMBIE.getForca();
                defesaMonstro = Monstros.ZUMBIE.getDefesa();
                VidaMonstro(vMonstro, vidaMonstro);
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        if(vidaHeroi > 0 && vidaMonstro > 0) {
            if (ataqueHeroi > defesaMonstro) {
                vidaMonstro -= (ataqueHeroi - defesaMonstro);
                if (vidaMonstro <= 0) {
                    monsterLife.setValue(0);
                    int result = JOptionPane.showConfirmDialog(rootPane, "Ganhou! Deseja continuar?", "Deseja continuar", ConfirmationCallback.YES_NO_OPTION);
                    if (result == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                } else {
                    VidaMonstro(vMonstro, vidaMonstro);
                    
                }
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

     private void VidaHeroi(int viaInicial, int vidaAtual) {
        heroLife.setMaximum(viaInicial);
        heroLife.setValue(vidaAtual);
        heroLife.setStringPainted(true);
        heroLife.setString(String.valueOf(vidaAtual) + "/" + String.valueOf(viaInicial));
    }

    private void VidaMonstro(int viaInicial, int vidaAtual) {
        monsterLife.setMaximum(viaInicial);
        monsterLife.setValue(vidaAtual);
        monsterLife.setStringPainted(false);
        monsterLife.setStringPainted(true);
        monsterLife.setString(String.valueOf(vidaAtual) + "/" + String.valueOf(viaInicial));
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jogo;
    private javax.swing.JPanel Login;
    private javax.swing.JTabbedPane Main;
    private javax.swing.JButton btnHeroi;
    private javax.swing.JProgressBar heroLife;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblHeroiImg;
    private javax.swing.JLabel lblHeroiNome;
    private javax.swing.JLabel lblMonstroImg;
    private javax.swing.JLabel lblMonstroNome;
    private javax.swing.JProgressBar monsterLife;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
