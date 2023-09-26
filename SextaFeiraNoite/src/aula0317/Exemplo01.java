package aula0317;

import java.util.Scanner;
/*
a.	Homens: Peso Ideal = (72,7 * altura) - 58
b.	Mulheres: Peso Ideal = (62,1 * altura) – 44,7
*/
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double altura, peso;
        int sexo;
        System.out.println("Digite sua altura:");
        altura = tc.nextDouble();
        
        System.out.println("Informe sexo biologico:\n" + 
                " 1 - Feminino\n" + 
                " 2 - Masculino");
        sexo = tc.nextInt();
        if (sexo == 1) {
            peso = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal = %.2f\n", peso);
        } else if (sexo == 2){
            peso = 72.7 * altura - 58;
            System.out.println("Peso ideal = " + peso);
        } else {
            System.out.println("Opcao invalida");
        }

        tc.close();
    }
}
