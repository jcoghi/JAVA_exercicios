package javaapplication89;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ler {

    public String[][] lerArquivo() throws FileNotFoundException {
        
        String dado;
        String[][] dataBase = new String[4][4];
        int linha = 0;
        
        File file = new File("teste.txt");
        try (Scanner leitor = new Scanner(file)) {
            while (leitor.hasNextLine()) {
                dado = leitor.nextLine();
                dataBase[linha] = dado.split(",");
                linha++;
            }
        }
        return dataBase;
    }
}
