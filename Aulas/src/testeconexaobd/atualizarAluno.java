package testeconexaobd;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class atualizarAluno {

    public static void main(String[] args) {
        
        ControlleJdbc conexao = new ControlleJdbc();
        
        try {
            if (conexao.atualizarDado("Joao Felipe ", 1) > 0){
                System.out.println("Pessoa inserida com sucesso");
            } else {
                System.out.println("Nada feito");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
