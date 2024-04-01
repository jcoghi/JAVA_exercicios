package gui.editor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Editor extends javax.swing.JFrame {

    JFileChooser abrir;

    public Editor() {
        initComponents();
        abrir = new JFileChooser();
        abrir.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        abrir.addChoosableFileFilter(filter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaEditor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor Texto do Jão");
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setResizable(false);

        txaEditor.setColumns(20);
        txaEditor.setLineWrap(true);
        txaEditor.setRows(5);
        jScrollPane1.setViewportView(txaEditor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Salvar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Copiar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Colar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Recortar");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
JFileChooser fileChooser = new JFileChooser();

        // Definir o título da janela do JFileChooser
        fileChooser.setDialogTitle("Abrir arquivo");

        // Mostrar a janela do JFileChooser e obter o valor de retorno
        int userSelection = fileChooser.showOpenDialog(this);

        // Verificar se o usuário clicou no botão abrir
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obter o arquivo selecionado pelo usuário
            File fileToOpen = fileChooser.getSelectedFile();

            // Verificar se o arquivo tem a extensão .txt
            if (fileToOpen.getName().endsWith(".txt")) {
                // Criar um objeto FileReader para ler o arquivo
                FileReader reader = null;

                try {
                    // Inicializar o FileReader com o arquivo a ser aberto
                    reader = new FileReader(fileToOpen);

                    // Limpar o conteúdo do JTextArea
                    txaEditor.setText("");

                    // Criar um array de caracteres para armazenar os dados lidos
                    char[] buffer = new char[1024];

                    // Criar uma variável para armazenar o número de caracteres lidos
                    int numRead = 0;

                    // Ler o arquivo até o final
                    while ((numRead = reader.read(buffer)) != -1) {
                        // Escrever os caracteres lidos no JTextArea
                        txaEditor.append(new String(buffer, 0, numRead));
                    }

                    // Fechar o FileReader
                    reader.close();

                } catch (IOException e) {
                    // Mostrar uma mensagem de erro
                    JOptionPane.showMessageDialog(this, "Ocorreu um erro ao abrir o arquivo: " + e.getMessage());
                }
            } else {
                // Mostrar uma mensagem de aviso
                JOptionPane.showMessageDialog(this, "O arquivo selecionado não é um arquivo de texto.");
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int result = JOptionPane.showConfirmDialog(rootPane, "Deseja sair?", "Sair", ConfirmationCallback.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        txaEditor.copy();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        txaEditor.paste();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Criar um objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Definir o título da janela do JFileChooser
        fileChooser.setDialogTitle("Salvar arquivo");

        // Mostrar a janela do JFileChooser e obter o valor de retorno
        int userSelection = fileChooser.showSaveDialog(this);

        // Verificar se o usuário clicou no botão salvar
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obter o arquivo selecionado pelo usuário
            File fileToSave = fileChooser.getSelectedFile();

            // Verificar se o arquivo tem a extensão .txt
            if (!fileToSave.getName().endsWith(".txt")) {
                // Adicionar a extensão .txt ao nome do arquivo
                fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
            }

            FileWriter writer = null;

            try {
                // Inicializar o FileWriter com o arquivo a ser salvo
                writer = new FileWriter(fileToSave);

                // Escrever o conteúdo do JTextArea no arquivo
                writer.write(txaEditor.getText());

                // Fechar o FileWriter
                writer.close();

                // Mostrar uma mensagem de sucesso
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");

            } catch (IOException e) {
                // Mostrar uma mensagem de erro
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaEditor;
    // End of variables declaration//GEN-END:variables
}
