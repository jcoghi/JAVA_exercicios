
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        
        final String url="jdbc:mysql://127.0.0.1:3306/aula";
        final String user = "root";
        final String psw = "123456";
        
        Connection conn = null;
        Statement stmt = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,psw);
            System.out.println("Conectado");
            
            stmt = conn.createStatement();
            String sql = "CREATE TABLE TESTE("
                    + "ID INT,"
                    + "NAME VARCHAR(80));";
            
            stmt.executeUpdate(sql);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
