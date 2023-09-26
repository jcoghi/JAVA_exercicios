package pacoteio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class leitura {

    public static void main(String[] args) throws IOException {
        // Entrada de Arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // Leitura 
        String linha = br.readLine();
        
        // readeLine() retorna -1 quando não temos mais linhas. 
        while (linha != null) {
            // Escrita na tela
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }

}
