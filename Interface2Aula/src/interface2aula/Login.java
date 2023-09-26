package interface2aula;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    public void run() {
        
        JFrame frame = new JFrame("Login");
        frame.setSize(250, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel lblUsuario = new JLabel("Login:");
        lblUsuario.setBounds(10, 10, 80, 25);
        
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(60, 10, 160, 25);
        
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(10, 50, 80, 25);
        
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(60, 50, 160, 25);
        
        JButton btnEntrar = new JButton();
        btnEntrar.setBounds(60, 85, 70, 25);
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(e ->{
            
            String usuario = txtUsuario.getText();
            String senha = String.valueOf(txtSenha.getPassword());
            
            if(usuario.equalsIgnoreCase("joao") &&
                    senha.equalsIgnoreCase("123")){
                Jogo novaTela = new Jogo();
                novaTela.run();
                frame.setVisible(false);
        }
            else {
                JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos");
            }
            
        });
        
        
        panel.add(lblUsuario);
        panel.add(lblSenha);
        panel.add(txtUsuario);
        panel.add(txtSenha);
        panel.add(btnEntrar);
        
        frame.add(panel);
        frame.getRootPane().setDefaultButton(btnEntrar);
        frame.setVisible(true);
    }
}
