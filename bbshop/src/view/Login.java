package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "123456";
    private static final String base = "jdbc:mysql://localhost:3306/conector";
    int q, i, id, deletItem;
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    //===================================
    
    public void upDateDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(base,username,password);
            pst = sqlConn.prepareStatement("select * from conector");
            
            pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel recordTable = (DefaultTableModel)jTable1.getModel();
            recordTable.setRowCount(0);
            
            while(rs.next()) {
                Vector columnData = new Vector();
                
                for(i = 1; i <= q; i++) {
                    columnData.add(rs.getShort("id"));
                    columnData.add(rs.getShort("AlunoID"));
                    columnData.add(rs.getShort("Nome"));
                    columnData.add(rs.getShort("Sobrenome"));
                    columnData.add(rs.getShort("Endereco"));
                    columnData.add(rs.getShort("Telefone"));
                }
                recordTable.addRow(columnData);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Error");
        }
    }
    
    //====================================
    
    public Login() {
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
        Sair = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sobrenome = new javax.swing.JTextField();
        Endereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel2.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, -1));

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jButton3.setText("Editar");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, -1));

        jButton4.setText("Imprimir");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        jButton5.setText("Reiniciar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        jButton6.setText("Apagar");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 230, 490));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 220, 390));

        jLabel1.setText("id");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel5.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, -1));

        jLabel2.setText("Nome:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel5.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 250, -1));
        jPanel5.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, -1));

        jLabel3.setText("Telefone:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setText("Endereço:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("Sobrenome");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel5.add(Sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, -1));
        jPanel5.add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AlunoID", "Nome:", "Sobrenome", "Endereco", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 720, 90));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 760, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirmar sair","Conector MYSQL",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_SairActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(base,username,password);
            pst = sqlConn.prepareStatement("insert into conector(AlunoID,Nome,Sobrenome,Endereco,Telefone)value(?,?,?,?,?)");
            
            pst.setString(1, Id.getText());
            pst.setString(2, Nome.getText());
            pst.setString(3, Sobrenome.getText());
            pst.setString(4, Endereco.getText());
            pst.setString(5, Telefone.getText());
            
            rs = pst.executeQuery();
            upDateDB();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Sem dados");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Id.setText("");
        Nome.setText("");
        Sobrenome.setText("");
        Endereco.setText("");
        Telefone.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Endereco;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField Sobrenome;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
