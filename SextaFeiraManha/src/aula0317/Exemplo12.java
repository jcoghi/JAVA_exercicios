package aula0317;

import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double altura;
        int sexo;

        System.out.println("Digite sua altura");
        altura = tc.nextDouble();

        System.out.println("Informe seu sexo biologico:\n"
                + "1 - Masculino\n"
                + "2 - Feminino");

        sexo = tc.nextInt();

        switch (sexo) {
            case 1:
                {
                    double pesoIdeal = 72.7 * altura - 58;
                    System.out.printf("Seu peso ideal seria de %.2f\n", pesoIdeal);
                    break;
                }
            case 2:
                {
                    double pesoIdeal = 62.1 * altura - 44.7;
                    System.out.println("Seu peso ideal seria de " + pesoIdeal);
                    break;
                }
            default:
                System.out.println("Opcao invalida");
                break;
        }
        
        tc.close();
        
    }
    
}
