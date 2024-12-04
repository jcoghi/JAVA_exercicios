package poo.calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        try {
            Calculadora calc;
            Scanner tc = new Scanner(System.in);

            System.out.println("""
                    ******** CALCULADORA *******
                        + para Soma
                        - para Subtração
                        * para Multiplicação
                        / para Divisão
                        ! para Fatorial
                    Esscolha uma opção:
                    """);
            int escolha = tc.next().charAt(0);

            switch (escolha) {
                case '+'-> {
                    double[] entradas = entrada();
                    calc = new Calculadora(entradas[0],entradas[1]);
                    System.out.println(calc.getNum1() + " + " + calc.getNum2()
                     + " = " + calc.soma());
                }
                case '-'-> {
                    double[] entradas = entrada();
                    calc = new Calculadora(entradas[0],entradas[1]);
                    System.out.println(calc.subtracao());
                }
                case '*'-> {
                    double[] entradas = entrada();
                    calc = new Calculadora(entradas[0],entradas[1]);
                    System.out.println(calc.multiplicacao());
                }
                case '/'-> {
                    double[] entradas = entrada();
                    calc = new Calculadora(entradas[0],entradas[1]);
                    System.out.println(calc.divisao());
                }
                case '!'-> {
                    System.out.println("Digite um numero");
                    int entrada = tc.nextInt();
                    calc = new Calculadora(entrada);
                    System.out.println(calc.fatorial());
                }
                default -> System.out.println("Escolha uma opção válida");
            }

        }catch (Exception e) {
            System.out.println("Você deve digitar um número");
        }


    }

    public static double[] entrada() {
        Scanner tc = new Scanner(System.in);
        double[] numeros = new double[2];
        for (int i = 0; i< numeros.length; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = tc.nextDouble();
        }
        return numeros;
    }

}
