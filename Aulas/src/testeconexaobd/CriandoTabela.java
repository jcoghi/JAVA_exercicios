package testeconexaobd;

import java.sql.*;

public class CriandoTabela {

    public static void main(String[] args) {
        try {
            ControlleJdbc con = new ControlleJdbc();
            Connection conexao = con.getConexao();

            // COMEÇAR APENAS COM O NOME.
            String sql = """
                     CREATE TABLE IF NOT EXISTS Pessoas(
                        codigo INT AUTO_INCREMENT PRIMARY KEY,
                        nome   VARCHAR(80) NOT NULL,
                        idade  INT NOT NULL
                     );
                     """;

            Statement stmt = conexao.createStatement();
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso");
            conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }

    }

}
