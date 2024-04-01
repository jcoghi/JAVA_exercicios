package exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ControllerJdbc {

    private PreparedStatement stmt;
    private Statement stmt1;
    private String query;
    private String url = "jdbc:mysql://localhost:3306/exemplo";

    public Connection getConexao() {
        try {
            final String user = "root";
            final String senha = "123456";

            return DriverManager.getConnection(this.url, user, senha);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean inserirDado(String nome, String login, String senha, int tipo) {
        try {
        String sql = "INSERT INTO usuario(nome, login, senha, tipo) VALUES (?, ?, ?, ?);";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, login);
        stmt.setString(3, senha);
        stmt.setInt(4, tipo);

        return stmt.execute();
        } catch(SQLException e){
            return false;
        }
        
    }

    public int atualizarDado(String nome, String login, String senha, int tipo) {
        try {String sql = "UPDATE usuario SET nome = ?, senha = ?, tipo = ? WHERE login = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        stmt.setInt(3, tipo);
        stmt.setString(4, login);

        return stmt.executeUpdate();
        } catch (SQLException e) {
            return Integer.MIN_VALUE;
        }        
    }

    public int deletarDado(String login){
        try {
        String sql = "DELETE FROM usuario WHERE login = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, login);

        return stmt.executeUpdate();
        } catch(SQLException e) {
            return Integer.MIN_VALUE;
        }
    }

    public ResultSet buscarTudo() throws SQLException {
        String sql = "SELECT * FROM usuario";
        this.stmt1 = this.getConexao().createStatement();
        stmt1.execute(sql);

        return this.stmt1.executeQuery(sql);
    }

    public ResultSet buscar(String username) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, username);
        
        return stmt.executeQuery();
    }
}
