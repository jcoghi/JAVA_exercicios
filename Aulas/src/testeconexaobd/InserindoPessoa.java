package testeconexaobd;

import java.util.Scanner;
import java.sql.*;

public class InserindoPessoa {

    public static void main(String[] args) throws SQLException {
        ControlleJdbc con = new ControlleJdbc();
        Connection conexao = con.getConexao();
        Scanner teclado = new Scanner(System.in);
        
        // Começar apenas com nome
        System.out.println("Informe o nome: ");
        String nome = teclado.nextLine();
        
        // No final colocar idade para adicionar outro parâmetro
        System.out.println("Informe o Idade: ");
        int idade = teclado.nextInt();
        
        /*
        String sql = "INSERT INTO Pessoas(nome) VALUES ('" + nome + "');";
        
        System.out.println(sql);
     
        Exemplo de SQL injection: Joao');set sql_safe_updates = 0;delete from tsegundona.pessoas where('1' = '1
         */
        
        
        String sql = "INSERT INTO Pessoas(nome, idade) VALUES (?,?);";
        // Para evitar SQL Injection
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, idade);
        
        stmt.execute();
        teclado.close();
    }

}
