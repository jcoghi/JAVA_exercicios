import java.sql.*;


public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String url = "jdbc:mysql://localhost:3306/aula";
        final String user = "root";
        final String psw = "123456";

        try {
            conn = DriverManager.getConnection(url,user,psw);
            System.out.println("Done");

            pstmt = conn.prepareStatement("INSERT INTO pessoas(nome,idade) VALUE(?,?)");
            pstmt.setString(1,"Joao");
            pstmt.setString(2,"41");
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("SELECT * FROM pessoas");
            rs = pstmt.executeQuery();

            while(rs.next()) {

                String nome = rs.getString("nome");
                System.out.println("Nome do Cliente: " + nome);
            }

            pstmt = conn.prepareStatement("DELETE FROM pessoas WHERE nome = Joao;");

            conn.close();
        } catch (SQLException esql) {
            esql.printStackTrace();
        }


    }
}