package aula0420;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String[] vetor = {"base maior", "base menor", "altura"};
        int[] num = new int[3];
        boolean start = true;

        while (start) {
            char inicio = tela();

            switch (inicio) {
                case 'q' -> {
                    System.out.println("Informe o lado do quadrado");
                    int lado = tc.nextInt();
                    System.out.println("Area do quadrado = "
                            + area(lado));
                }
                
                case 'r' -> {
                    System.out.println("Informe a base do retangulo");
                    int base = tc.nextInt();
                    System.out.println("Informe a altura do retangulo");
                    int altura = tc.nextInt();
                    System.out.println("Area do retangulo = "
                            + area(base, altura));
                }
                
                case 't' -> {

                    for (int i = 0; i < num.length; i++) {
                        System.out.println(vetor[i] + ": ");
                        num[i] = tc.nextInt();
                    }

                    System.out.println("Area do trapezio = "
                            + area(num[0], num[1], num[2]));
                }
                
                case 's' -> {
                    System.out.println("Obrigado por usar nosso programa");
                    start = false;
                }
                
                default -> {
                    System.out.println("Selecione uma opcao valida");
                }
            }
        }
    }

    // Função área com 1 parâmetro de entrada
    public static int area(int lado) {
        return lado * lado;
    }

    // Função área com 2 parâmetro de entrada
    public static int area(int base, int altura) {
        return base * altura;
    }

    // Função área com 3 parâmetro de entrada
    public static int area(int baseMaior, int baseMenor, int altura) {
        return (baseMaior + baseMenor) / 2 * altura;
    }

    // Função tela()
    public static char tela() {
        Scanner tc = new Scanner(System.in);
        System.out.println("""
                           Calculadora de areas:
                              Q para quadrado;
                              R para retangulo;
                              T para trapezio;
                              S para sair;
                           Informe a area a ser calculada:""");
        String entrada = tc.next().toLowerCase();
        return entrada.charAt(0);
    }

}
