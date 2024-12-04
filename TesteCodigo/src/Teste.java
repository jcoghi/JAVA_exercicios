import java.util.Scanner;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numero = new Random();
        int numeroSecreto = numero.nextInt(0, 10);
        int tentativas = 1, entrada;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Tente acertar o número que estou pensando: ");
            entrada = teclado.nextInt();
            if (entrada == numeroSecreto) {
                System.out.printf("Acertou o número %d com %d tentativas. \n", numeroSecreto, tentativas);
                acertou = true;
            } else {
                tentativas++;
            }
        }
        teclado.close();
        }
    }
