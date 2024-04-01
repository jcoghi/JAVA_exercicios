package ordecacaoinsercao;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author joaof
 */
public class OrdenacaoInsercao {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        try {
            System.out.println("Insira a quantidade de elementos no vetor");
            int qtd = tc.nextInt();
            int[] num = gerador(qtd);

            for (int j = 1; j < num.length; j++) { // varrendo o vetor num
                int chave = num[j]; // salvando o valor numa chave auxiliar
                // pegando sempre um valor anterior do valor analisado.
                int i = j - 1; // criando um novo contador, para inicializar em 0

                /*
             * Laço repetição verificando se contador >= 0 e
             * se o valor atual é maior do que a chave (próximo valor da lista)
                 */
                while (i >= 0 && num[i] > chave) {
                    num[i + 1] = num[i]; // Guardando o valor maior na casa anterior
                    i -= 1; // voltanto o contador até chegar na primeira posição
                    num[i + 1] = chave; // colocando o valor na posição correta.
                }
            }

            System.out.println(Arrays.toString(num));

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] gerador(int qtd) {
        Random gerador = new Random();
        int num[] = new int[qtd];

        for (int i = 0; i < num.length; i++) {
            num[i] = gerador.nextInt(0,1001);
        }
        return num;
    }
}
