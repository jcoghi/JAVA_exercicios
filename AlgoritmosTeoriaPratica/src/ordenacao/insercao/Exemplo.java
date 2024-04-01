package ordenacao.insercao;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author prof. João Felipe F. Coghi
 */
public class Exemplo {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            // Asking for the amount of elements 
            System.out.println("Insira a quantidade de elementos:");
            int quantidade = teclado.nextInt();
            
            // Declaring the vector
            int[] amostra = new int[quantidade];
            
            // Creating the vector's elements by random numbers beetween 0 and 1000
            Random gerador = new Random();
            
            for(int i = 0; i < amostra.length; i++) {
                amostra[i] = gerador.nextInt(0, 1001);
            }
            
            // Insertion-sort
            for(int j = 2; j < amostra.length; j++) {
                int auxiliar = amostra[j];
                int i = j - 1;
                while(i >= 0 && amostra[i] > auxiliar) {
                    amostra[i + 1] = amostra[i];
                    amostra[i] = auxiliar;
                    i--;
                }
            }
            
            System.out.println(Arrays.toString(amostra));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
