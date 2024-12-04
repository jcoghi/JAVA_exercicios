import javax.swing.*;

public class Login {
    public void show() {

        JFrame frame = new JFrame("Login");
        frame.setSize(250,160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(10, 20, 80, 25);

        JTextField usuarioTextField = new JTextField();
        usuarioTextField.setBounds(80, 20,150,25);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(10, 50, 80, 25);

        JPasswordField senhaPasswordField = new JPasswordField();
        senhaPasswordField.setBounds(80, 50,150,25);

        JButton entrarButton = new JButton();
        entrarButton.setBounds(80,80,150,25);
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(e -> {

            String usuario = usuarioTextField.getText();
            String senha = String.valueOf(senhaPasswordField.getPassword());

            if ("joao".equals(usuario) && "123".equals(senha)) {
                    Jogo jogo = new Jogo();
                    jogo.show();
                    frame.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }

        });

        panel.add(usuarioLabel);
        panel.add(usuarioTextField);
        panel.add(senhaLabel);
        panel.add(senhaPasswordField);
        panel.add(entrarButton);

        frame.add(panel);
        // Componente padrão da tela  -> ENTER clica este botão.
        frame.getRootPane().setDefaultButton(entrarButton);
        frame.setVisible(true);


    }
}
