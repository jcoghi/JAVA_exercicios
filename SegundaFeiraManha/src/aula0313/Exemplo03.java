/*VERIFICAÇÃO SE O NÚMERO É PAR ou impar e se é positivo ou negativo*/
package aula0313;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = tc.nextInt();

        if (numero % 2 == 0) { // VERIFICAÇÃO SE É PAR
            if (numero >= 0) { // VERIFICA SE É POSITIVO
                System.out.println("Par e positivo");
            } else { // CASO NÃO SEJA POSITIVO
                System.out.println("Par e negativo");
            }

        } else { // PARA QUANDO NÃO FOR PAR
            if (numero >= 0) { // VERIFICA SE É POSITIVO
                System.out.println("Impar e positivo");
            } else { // CASO NÃO SEJA POSITIVO
                System.out.println("Impar e negativo");
            }
        }
    }
}
