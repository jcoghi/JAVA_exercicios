package aula0612.editortexto;

import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EditorTexto extends javax.swing.JFrame {

    Filtro meuFiltro = new Filtro();
    
    public EditorTexto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        Copiar = new javax.swing.JMenuItem();
        Colar = new javax.swing.JMenuItem();
        Recortar = new javax.swing.JMenuItem();
        Limpar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Times = new javax.swing.JRadioButtonMenuItem();
        Verdana = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        fileChooser.setFileFilter(meuFiltro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        setResizable(false);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        Arquivo.setMnemonic('A');
        Arquivo.setText("Arquivo");

        Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula0612/editortexto/imagens/Abrir.jpg"))); // NOI18N
        Abrir.setMnemonic('B');
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Arquivo.add(Abrir);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula0612/editortexto/imagens/Sair.jpg"))); // NOI18N
        Sair.setMnemonic('S');
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Arquivo.add(Sair);

        jMenuBar1.add(Arquivo);

        Editar.setText("Editar");

        Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        Editar.add(Copiar);

        Colar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Colar.setText("Colar");
        Colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColarActionPerformed(evt);
            }
        });
        Editar.add(Colar);

        Recortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Recortar.setText("Recortar");
        Recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecortarActionPerformed(evt);
            }
        });
        Editar.add(Recortar);

        Limpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        Editar.add(Limpar);
        Editar.add(jSeparator1);

        Times.setText("Times new Roman");
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });
        Editar.add(Times);

        Verdana.setText("Verdana");
        Verdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdanaActionPerformed(evt);
            }
        });
        Editar.add(Verdana);

        jMenuBar1.add(Editar);

        jMenu1.setText("About");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu1MouseReleased(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        int escolherArquivo = fileChooser.showOpenDialog(this);
        if(escolherArquivo == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            try {
                txtArea.read(new FileReader(arquivo.getAbsolutePath()),null);
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        txtArea.copy();
    }//GEN-LAST:event_CopiarActionPerformed

    private void ColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColarActionPerformed
        txtArea.paste();
    }//GEN-LAST:event_ColarActionPerformed

    private void RecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecortarActionPerformed
        txtArea.cut();
    }//GEN-LAST:event_RecortarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        txtArea.setText(null);
    }//GEN-LAST:event_LimparActionPerformed

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed
        if(Times.isSelected()) {
            Verdana.setSelected(false);
            Font f = new Font("Times new Roman", Font.BOLD, 22);
            txtArea.setFont(f);
        }
    }//GEN-LAST:event_TimesActionPerformed

    private void VerdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdanaActionPerformed
        if(Verdana.isSelected()) {
            Times.setSelected(false);
            Font f = new Font("Verdana", Font.PLAIN, 16);
            txtArea.setFont(f);
        }
    }//GEN-LAST:event_VerdanaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseReleased
        About tela = new About();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       About tela = new About();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenuItem Colar;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JMenuItem Recortar;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JRadioButtonMenuItem Times;
    private javax.swing.JRadioButtonMenuItem Verdana;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
