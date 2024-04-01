package testeconexaobd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuscaAluno {

    public static void main(String[] args) {
        try {
            Scanner tc = new Scanner(System.in);
            ControlleJdbc conexao = new ControlleJdbc();
            Connection con = conexao.getConexao();
            String sql = "SELECT * FROM Alunos WHERE nome LIKE ?";
            
            System.out.println("Busca: ");
            String search = tc.nextLine();
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + search + "%");
            ResultSet resultado = stmt.executeQuery();
            
            List<Aluno> alunos = new ArrayList<>();
            
            while(resultado.next()) {
                int codigo = resultado.getInt("id");
                String nome = resultado.getString("nome");
                alunos.add(new Aluno(codigo, nome));
            }
            
            for(Aluno a: alunos) {
                System.out.println(a.getId() + ": " + a.getNome());
            }
            
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + Arrays.toString(e.getStackTrace()));
        }
    }

}
