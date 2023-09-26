package javaapplication89;

import java.io.IOException;
import java.util.Arrays;


public class JavaApplication89 {

   
    public static void main(String[] args) throws IOException {
       
        String[][] nome = {{"Nome", "Idade", "Cidade"},
                           {"Joao", "41", "Santos"}};
        
//        Escrever escritor = new Escrever();
//        escritor.escrever(nome);
        Ler leitor = new Ler();
        String dataBase[][] = leitor.lerArquivo();
        
        for (String[] data: dataBase) {
            System.out.println(Arrays.toString(data));
        }
        
    }
    
}
