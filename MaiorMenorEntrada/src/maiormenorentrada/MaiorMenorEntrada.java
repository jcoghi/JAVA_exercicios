package maiormenorentrada;

import java.util.Scanner;

public class MaiorMenorEntrada {

    public static void main(String[] args) {
        int numero = 0, maior = 0, menor = 0, i;
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro: ");
            numero = teclado.nextInt();
            if (maior == 0 && menor == 0){
                maior = numero;
                menor = numero;
            } else if (numero > maior){
                maior = numero;
            }else if (numero < menor){
                menor = numero;
            }
        }
        System.out.printf("O menor e o maior números são: %d e %d\n", menor,maior);
    }

}
