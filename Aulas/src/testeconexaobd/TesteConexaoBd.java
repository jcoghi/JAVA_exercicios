package testeconexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joaof
 */
public class TesteConexaoBd {

    public static void main(String[] args) throws SQLException {
        
        final String url = "jdbc:mysql://localhost";
        final String user = "root";
        final String senha = "123456";
        
        Connection conexao = DriverManager.getConnection(url, user, senha);
        
        System.out.println("conectado");
        conexao.close();
        
    }

}
