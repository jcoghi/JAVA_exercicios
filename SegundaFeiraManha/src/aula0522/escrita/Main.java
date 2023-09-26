package aula0522.escrita;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        String[][] dados = {{"Nome", "Idade", "Cidade"},
                          {"Ana", "25", "Sao Paulo"},
                          {"Rafael", "20", "Diameda"},
                          {"Thiago", "30", "Cidade Ademar"}};
        
        try{
            System.out.print("Qual o nome do arquivo: ");
            String nome = tc.next();
            FileWriter escritor = new FileWriter(nome+".txt");
            
            for(int i = 0; i < dados.length; i++){
                for (int j = 0; j < dados[0].length; j++) {
                    escritor.write(dados[i][j] + ",");
                }
                escritor.write("\n");
            }
            escritor.close();
            
            System.out.println("Arquivo criado com sucesso!");
            
        } catch(Exception e) {
            System.out.println("Erro: " + e);
        }
    }

}
