
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String psw = "123456";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,psw);

            stmt = conn.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        }
    }
}
