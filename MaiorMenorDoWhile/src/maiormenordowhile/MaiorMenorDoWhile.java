package maiormenordowhile;

import java.util.Scanner;

public class MaiorMenorDoWhile {

    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        int entrada;
        int maior = 0;
        int menor = 0;
        int contador = 1;

        do {
            if (contador == 1) {
                System.out.printf("Digite um valor %d: ", 
                        contador, "\n");
                entrada = teclado.nextInt();
                menor = entrada;
                maior = entrada;
            } else {
                System.out.printf("Digite um valor %d: ", 
                        contador, "\n");
                entrada = teclado.nextInt();
                menor = (menor < entrada) ? menor : entrada;
                maior = (maior > entrada) ? maior : entrada;
            }
            contador++;
        } while (contador <= 5);

        System.out.printf("O maior numero: %d \n", maior);
        System.out.printf("O menor numero: %d \n", menor);
        teclado.close();
    }

}
