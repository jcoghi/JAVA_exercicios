package aula0428;

import java.io.FileWriter;

public class Exemplo01 {

    public static void main(String[] args) {
        
        String[][] dados = {{"Nome", "Idade", "Cidade"},
                            {"Ana", "63", "Sao Paulo"},
                            {"Joao", "41", "Santos"},
                            {"Carla", "25", "Diadema"}};
        
        try{
            String file = "database.txt";
            FileWriter escritor = new FileWriter(file);
            
            for (int i = 0; i < dados.length; i++){
                for (int j = 0; j < dados[i].length; j++) {
                    escritor.write(dados[i][j] + ",");
                }
                escritor.write("\n");
            }
            
            escritor.close();
            System.out.println("Arquivo criado com sucesso");
            
        }catch(Exception e){
            System.out.println("Erro! " + e.getMessage());
        }
    }
}
