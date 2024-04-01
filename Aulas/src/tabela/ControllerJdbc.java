package tabela;

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
    private String url = "jdbc:mysql://localhost:3306/alunos";

    public Connection getConexao() {
        try {
            final String user = "root";
            final String senha = "123456";

            return DriverManager.getConnection(this.url, user, senha);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean inserirDado(String nome) throws SQLException {
        String sql = "INSERT INTO Alunos(nome) VALUES (?);";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, nome);

        return stmt.execute();
    }

    public int atualizarDado(String dado, int id) throws SQLException {
        String sql = "UPDATE alunos SET nome = ? WHERE id = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, dado);
        stmt.setInt(2, id);

        return stmt.executeUpdate();
    }

    public int deletarDado(int id) throws SQLException {
        String sql = "DELETE FROM alunos WHERE id = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setInt(1, id);

        return stmt.executeUpdate();
    }

    public ResultSet buscarTudo() throws SQLException {
        String sql = "SELECT * FROM alunos";
        this.stmt1 = this.getConexao().createStatement();
        stmt1.execute(sql);

        return this.stmt1.executeQuery(sql);
    }

    public ResultSet buscar(String username) throws SQLException {
        String sql = "SELECT * FROM alunos WHERE login = ?";
        this.stmt = this.getConexao().prepareStatement(sql);
        stmt.setString(1, username);
        
        return stmt.executeQuery();
    }
}
