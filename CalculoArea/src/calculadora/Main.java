package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        Scanner tc = new Scanner(System.in);

        String entrada;
        String status = "on";

        while (status.equals("on")) {
            System.out.println("""
                           Selecione: 
                           1 - Quadrado
                           2 - Retangulo
                           3 - Trapezio
                           4 - Losando
                           5 - Sair
                           """);

            entrada = tc.next();

            switch (entrada) {
                case "1":
                    System.out.print("Inserir lado: ");
                    calc.calcularArea(tc.nextInt());
                    break;
                case "2":
                    System.out.print("Inserir base: ");
                    double base = tc.nextInt();
                    System.out.print("Inserir altura: ");
                    double altura = tc.nextInt();
                    calc.calcularArea(base, altura);
                    break;
                case "3":
                    System.out.print("Inserir base menor: ");
                    double baseMenor = tc.nextDouble();
                    System.out.print("Inserir base maior: ");
                    double baseMaior = tc.nextDouble();
                    System.out.print("Inserir base altura: ");
                    altura = tc.nextInt();
                    calc.calcularArea(baseMaior, baseMenor, altura);
                    break;
                case "4":
                    System.out.print("Inserir diagonal maior: ");
                    float diagonalMaior = tc.nextFloat();
                    System.out.print("Inserir diagonal menor: ");
                    float diagonalMenor = tc.nextFloat();
                    calc.calcularArea(diagonalMaior, diagonalMenor);
                    break;
                case "5":
                    status = "off";
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        tc.close();
    }

}
