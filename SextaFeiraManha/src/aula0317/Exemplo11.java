package aula0317;

import java.util.Scanner;

public class Exemplo11 {

    public static void main(String[] args) {
//        hombres: 72.7 * altura - 58
//        mujeres: 62.1 * altura - 44,7

        Scanner tc = new Scanner(System.in);
        double altura;
        String sexo;

        System.out.println("Digite sua altura");
        altura = tc.nextDouble();

        System.out.println("Informe seu sexo biologico:\n"
                + "M para Masculino\n"
                + "F para Feminino");

        sexo = tc.next();

        if (sexo.equalsIgnoreCase("m")) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Seu peso ideal seria de %.2f\n", pesoIdeal);
        } else if (sexo.equalsIgnoreCase("f")){
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal seria de " + pesoIdeal);
        }else{
            System.out.println("Opcao invalida");
        }
        

        tc.close();
    }

}
