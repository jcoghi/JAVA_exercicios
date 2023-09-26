package aula0320;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        double altura, pesoIdeal;
        char sexo;

        System.out.println("Altura?");
        altura = tc.nextDouble();

        System.out.println("Feminino ou Masculuno?");
        sexo = tc.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'F':
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("Peso Ideal = %.2f\n", pesoIdeal);
                break;
            case 'M':
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Peso Ideal = %.2f\n", pesoIdeal);
                break;
            default:
                System.out.println("Opcao Invalida");
                ;
        }

        tc.close();
    }

}
