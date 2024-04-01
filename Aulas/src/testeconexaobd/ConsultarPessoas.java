package testeconexaobd;

import java.sql.*;

public class ConsultarPessoas {

    public static void main(String[] args) throws SQLException {
        ControlleJdbc con = new ControlleJdbc();
        Connection conexao = con.getConexao();
        
        String sql = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        
        /*
        resultado tem todas as linhas do banco de dados;
        Usamos o .next() para percorrer linha a linha
        */
        
        // Retorna verdadeiro ou false para existência de próxima linha no bd
        while(resultado.next()) {
            System.out.print(resultado.getInt("codigo") + " ");
            System.out.print(resultado.getString("nome") + " ");
            System.out.println(resultado.getInt("idade"));

        }
        
        // Criando filtros na consulta
        

        stmt.close();
        conexao.close();
    }
}
