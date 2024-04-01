package testeconexaobd;

import java.sql.SQLException;
import java.util.Scanner;

public class DeletandoAluno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ControlleJdbc conexao = new ControlleJdbc();

        try {

            conexao.buscarTudo();
            System.out.println("Qual id deseja deletar?");
            int id = entrada.nextInt();

            if (conexao.deletarDado(id) > 0) {
                System.out.println("Deletado");
            } else {
                System.out.println("Não deletado");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
