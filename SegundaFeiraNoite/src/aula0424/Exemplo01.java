/* Fazer uma calculadora das 4 operações básicas.
Cada operação deve ser uma função. Todos os números devem
ser DOUBLE. Usar o try para evitar erros de digitação.
 */
package aula0424;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        double[] entradas = new double[2];
        boolean ligado = true;
        
        while (ligado) {
            try {
                for (int i = 0; i < entradas.length; i++) {
                    System.out.println("Digite um numero:");
                    entradas[i] = tc.nextDouble();
                }

                System.out.println("*** OPERACOES ***\n"
                        + "  + para Somar;\n"
                        + "  - para Subtrair;\n"
                        + "  * para Multiplicar;\n"
                        + "  / para dividir;\n"
                        + " S para sair.\n"
                        + "Escolha a operacao desejada:");
                String operacao = tc.next();

                switch (operacao) {
                    case "+":
                        System.out.println("Resultado: "
                                + soma(entradas[0], entradas[1]));
                        break;
                    case "-":
                        System.out.println("Resultado: "
                                + subtracao(entradas[0], entradas[1]));
                        break;
                    case "*":
                        System.out.println("Resultado: "
                                + multiplicacao(entradas[0], entradas[1]));
                        break;

                    case "/":
                        double div = divisao(entradas[0], entradas[1]);

                        if (div == Double.MIN_VALUE) {
                            System.out.println("Nao dividiras por ZERO");
                        } else {
                            System.out.println("Resultado: " + div);
                        }
                        break;

                    case "S":
                        System.out.println("Encerrando o programa...");
                        ligado = false;
                        break;

                    default:
                        System.out.println("Voce selecionou uma"
                                + " opecao invalida");
                }

                tc.close();
            } catch (Exception e) {
                System.out.println("Voce deve digitar um numero");
                System.out.println(e);
            }
        }
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {

        if (validacao(num2)) {
            return Double.MIN_VALUE;
        }

        return num1 / num2;
    }

    public static boolean validacao(double num) {
        if (num == 0) {
            return true;
        }
        return false;
    }

}
