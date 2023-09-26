package javaapplication89;

import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
    
    public void escrever(String[][] dataBase) throws IOException {
        FileWriter escritor = new FileWriter("teste.txt");
        
        for (String[] data : dataBase) {
            for (String data1 : data) {
                escritor.write(data1 + ",");
            }
            escritor.write("\n");
        }
        escritor.flush();
        escritor.close();
        System.out.println("Arquivo criado com sucesso!");
        }
}
