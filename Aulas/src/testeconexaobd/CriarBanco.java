package testeconexaobd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joaof
 */
public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        ControlleJdbc con = new ControlleJdbc();
        Connection conexao = con.getConexao();

        Statement stmt = conexao.createStatement();
        String query = "CREATE DATABASE IF NOT EXISTS teste_aula";
        stmt.execute(query);
        
        System.out.println("Banco criado com sucesso");
        conexao.close();
        
    }
}
