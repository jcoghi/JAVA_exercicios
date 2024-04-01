package exemplo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        ControllerJdbc conexao = new ControllerJdbc();
        Login telaLogin = new Login();
        SorveteriaAdmin telaAdmin = new SorveteriaAdmin();
        SorveteriaUser telaUser = new SorveteriaUser();
        String usuario = "";
        String pass = "";
        int tipo;
        boolean visivel = !verificarLogin(usuario, pass);

        while (visivel) {
            telaLogin.setVisible(true);
            espera(8000);

            usuario = telaLogin.getLogin();
            pass = telaLogin.getSenha();

            visivel = !verificarLogin(usuario, pass);

            if (!visivel) {
                telaLogin.setVisible(false);
                tipo = verificarUser(usuario);
                if(tipo == 0) {
                    telaAdmin.setTitle("usuário: " + usuario);
                    telaAdmin.setVisible(true);
                } else if (tipo == -1) {
                    telaUser.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(telaLogin, "Usuário ou senha inválidos");
            }
        }

        System.out.println(usuario);
        System.out.println(pass);
    }

    public static void espera(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean verificarLogin(String username, String password) {
        try {
            ControllerJdbc conexao = new ControllerJdbc();
            ResultSet resultado = conexao.buscar(username);

            while (resultado.next()) {
                if (password.equals(resultado.getString("senha"))) {
                    return true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public static int verificarUser(String username) {
        try {
            ControllerJdbc conexao = new ControllerJdbc();
            ResultSet resultado = conexao.buscar(username);

            while (resultado.next()) {
                int tipo = resultado.getInt("tipo");
                return tipo;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Integer.MAX_VALUE;
    }
    
    public static boolean verificarVendedor(String nome, String login, String senha) {
        if (nome.length() >= 3 && login.length() >= 3 && senha.length() >= 3) {
            return true;
        }
        return false;
    }
    
        public static boolean verificarVendedor(String login) {
        if (login.length() >= 3) {
            return true;
        }
        return false;
    }

}
