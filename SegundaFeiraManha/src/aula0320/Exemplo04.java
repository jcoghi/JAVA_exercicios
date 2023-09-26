package aula0320;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        char sexo;
        double altura, pesoIdeal;

        System.out.println("Altura?");
        altura = tc.nextDouble();

        System.out.println("Informe o sexo biologico:\n"
                + "M - Masculino\n"
                + "F - Feminino");
        sexo = tc.next().toLowerCase().charAt(0);

        switch (sexo) {
            case 'm':
                pesoIdeal = 72.7 * altura - 58;
                System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
                break;
            case 'f':
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
                break;
            default:
                System.out.println("Opcao invalida");
        }

//        if (sexo == 'm') {
//            double pesoIdeal = 72.7 * altura - 58;
//            System.out.println("Peso ideal = " + pesoIdeal);
//        } else if (sexo == 'f') {
//            double pesoIdeal = 62.1 * altura - 44.7;
//            System.out.println("Peso ideal = " + pesoIdeal);
//        } else {
//            System.out.println("Opcao invalida");
//        }

        tc.close();
    }

}
