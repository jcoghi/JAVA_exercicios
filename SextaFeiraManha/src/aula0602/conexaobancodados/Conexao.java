package aula0602.conexaobancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        
        Connection conexao =null;
            
            try { 
                String url = "jdbc:mysql:localhost:3306/conector";
                String usuario = "root";
                String senha = "123456";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(url,usuario,senha);
                
            } catch(SQLException e) {
                System.out.println(e);

            }
        
    }
    
}
