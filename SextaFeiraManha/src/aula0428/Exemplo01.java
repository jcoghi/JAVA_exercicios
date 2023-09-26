/*
Função é trecho de código que executa uma determinada
tarefa
 */
package aula0428;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.println("Digite + - / * para a operacao"
                + "desejada: ");
        char operacao = tc.next().charAt(0);

        chamarCalculadora(operacao);
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrai(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static void divisao(int num1, int num2) {
        try {
             System.out.println("Divisao = " + num1/num2);
        } catch (Exception e) {
            System.out.println("Nao pode dividir por ZERO");
        }
    }

    public static void chamarCalculadora(char operacao) {

        int[] num = entrada();
        switch (operacao) {
            case '+' -> System.out.println("Soma = " + soma(num[0], num[1]));

            case '-' -> System.out.println("Subtracao = " + subtrai(num[0], num[1]));

            case '*' -> System.out.println("Multiplicacao = " + multiplica(num[0], num[1]));

            case '/' -> divisao(num[0],num[1]);

            default -> System.out.println("Opcao errada");
        }
    }

    public static int[] entrada() {
        Scanner tc = new Scanner(System.in);
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o primeiro numero");
            numeros[i] = tc.nextInt();
        }

        return numeros;
    }
}
