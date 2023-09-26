package aula0522.leitura;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        
        String [][]database = new String[4][3];
        String data = "";
        int linha = 0;
        
        try {
            
            File arquivo = new File("test.txt");
            Scanner leitor = new Scanner(arquivo);
            
            while(leitor.hasNextLine()) {
                data = leitor.nextLine();
                database[linha] = data.split(",");
                linha++;
            }
            
            for (String[] database1 : database) {
                System.out.println(Arrays.toString(database1));
            }
            
            leitor.close();
            
        } catch(IOException e) {
            System.out.println("Erro: " + e);
        }
    }
    
}
