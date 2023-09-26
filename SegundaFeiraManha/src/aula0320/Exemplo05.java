package aula0320;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int sexo;
        double altura, pesoIdeal;

        System.out.println("Altura?");
        altura = tc.nextDouble();

        System.out.println("Informe o sexo biologico:\n"
                + "1 - Masculino\n"
                + "2 - Feminino");
        sexo = tc.nextInt();
        
        switch (sexo) {
            case 1:
                pesoIdeal = 72.7 * altura - 58;
                System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
                break;
            case 2:
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
                break;
            default:
                System.out.println("Opcao invalida");
        }
        
        tc.close();
    }
    
}
