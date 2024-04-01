package testeconexaobd;

import java.sql.*;
public class InserindoAluno {
    
    public static void main(String[] args) throws SQLException {
        ControlleJdbc controle = new ControlleJdbc();
        String[] lista = new String[]
        {"Bruno Urccella Wiss", "Diego Vinicius Santiago Coelho",
         "Gustavo Furnari da Silva", "Joao Victor Gomes Pernambuco",
         "Julia Muniz Ferreira", "Laura Akemi Suzuki", "Lucas Rodrigues Gonçalves",
         "Mateus Kenji Vicente Ribeiro", "Patrick de Araujo Martins", "Renato Gomes Pereira",
         "Vinicius Castilho", "Vinicius da Silva Santos"};

        
        for (int i = 0; i < lista.length; i++) {
            controle.inserirDado(lista[i]);
        }
        
    }
    
}
