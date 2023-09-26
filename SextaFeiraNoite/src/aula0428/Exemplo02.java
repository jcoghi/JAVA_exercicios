package aula0428;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) throws IOException{
        
        String[][] bd = new String[4][3];
        String data = "";
        int linha = 0;
        
        try {
            File arquivo = new File("database.txt");
            Scanner leitor = new Scanner(arquivo);
            
            while ( leitor.hasNextLine()) {
                data = leitor.nextLine();
                bd[linha] = data.split(",");
                linha++;
            }
            
            for(int i = 0; i < bd.length; i++) {
                System.out.println(Arrays.toString(bd[i]));
        }
            
            leitor.close();

        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
        
        
    }

}
