/*
* Escreva um programa em Java que crie um vetor de 100 elementos aleatoriamente com
* valores entre 10 e 50. O programa deve imprimir na tela: O vetor, a quantidade de
*  pares, a quantidade de ímpares e a média.
*/
import java.util.Random;

public class VetorCemElementos {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vector = new int[100];
        double sum = 0;
        int even = 0, odd = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10,50);
            sum += vector[i];
            if (vector[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Mean = " + sum/vector.length);
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
