package aula0605.relacaoentreclasses;

import javax.swing.JOptionPane;

public class NovaTela extends javax.swing.JFrame {

    String jogada = "X";

    public NovaTela() {
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

        jPanel2 = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel2.add(btn00);

        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel2.add(btn01);

        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn02);

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn10);

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel2.add(btn11);

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel2.add(btn12);

        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel2.add(btn20);

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel2.add(btn21);

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel2.add(btn22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed

        if (btn00.getText().equals("") && jogada.equals("X")) {
            btn00.setText(jogada);
            jogada = "O";
        } else if (btn00.getText().equals("") && jogada.equals("O")) {
            btn00.setText(jogada);

        }
        String[] textos = textos();
        if(textos[0].equals(textos[1]) && textos[0].equals(textos[2])) {
            ganhou();
        } else {
        }
    }//GEN-LAST:event_btn00ActionPerformed


    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        if (btn01.getText().equals("") && jogada.equals("X")) {
            btn01.setText(jogada);
            jogada = "O";
        } else if (btn01.getText().equals("") && jogada.equals("O")) {
            btn01.setText(jogada);
            jogada = "X";
        }
        String[] textos = textos();
        if(textos[0].equals(textos[1]) && textos[1].equals(textos[2])) {
            ganhou();
        } else {
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        if (btn02.getText().equals("") && jogada.equals("X")) {
            btn02.setText(jogada);
            jogada = "O";
        } else if (btn02.getText().equals("") && jogada.equals("O")) {
            btn02.setText(jogada);
            jogada = "X";
        }
        String[] textos = textos();
        if(textos[2].equals(textos[1]) && textos[0].equals(textos[2])) {
            ganhou();
        } else {
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (btn10.getText().equals("") && jogada.equals("X")) {
            btn10.setText(jogada);
            jogada = "O";
        } else if (btn10.getText().equals("") && jogada.equals("O")) {
            btn10.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (btn11.getText().equals("") && jogada.equals("X")) {
            btn11.setText(jogada);
            jogada = "O";
        } else if (btn11.getText().equals("") && jogada.equals("O")) {
            btn11.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (btn12.getText().equals("") && jogada.equals("X")) {
            btn12.setText(jogada);
            jogada = "O";
        } else if (btn12.getText().equals("") && jogada.equals("O")) {
            btn12.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        if (btn20.getText().equals("") && jogada.equals("X")) {
            btn20.setText(jogada);
            jogada = "O";
        } else if (btn20.getText().equals("") && jogada.equals("O")) {
            btn20.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if (btn21.getText().equals("") && jogada.equals("X")) {
            btn21.setText(jogada);
            jogada = "O";
        } else if (btn21.getText().equals("") && jogada.equals("O")) {
            btn21.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if (btn22.getText().equals("") && jogada.equals("X")) {
            btn22.setText(jogada);
            jogada = "O";
        } else if (btn22.getText().equals("") && jogada.equals("O")) {
            btn22.setText(jogada);
            jogada = "X";
        }
    }//GEN-LAST:event_btn22ActionPerformed

    public String[] textos() {
        String[] textos = {btn00.getText(), btn01.getText(),btn01.getText(),
                           btn10.getText(), btn11.getText(),btn11.getText(),
                           btn20.getText(), btn21.getText(),btn21.getText(),};
        return textos;

    }

    public void ganhou() {
        travar();
        if (JOptionPane.showConfirmDialog(rootPane, "Jogar novamente?", "De novo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            liberar();
            apagar();
        }
        if (JOptionPane.showConfirmDialog(rootPane, "Jogar novamente?", "De novo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void apagar() {
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
    }

    public void travar() {
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }

    public void liberar() {
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(NovaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
