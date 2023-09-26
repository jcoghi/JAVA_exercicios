package aula0417;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {
    public static void main(String[] args) {
        String [][]nomes = new String[2][3];
        Random fabiano = new Random();
        
        for (int rua = 0; rua < nomes.length; rua++) { // Entra na matriz
            for ( int num = 0; num < nomes[0].length; num++) { // Entra no vetor
                nomes[rua][num] = Integer.toString(fabiano.nextInt(10));
            }
        }
        
        System.out.println(Arrays.deepToString(nomes));
    }
}
