package aula0317;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double altura, peso;
        String sexo;
        
        System.out.println("Altura?");
        altura = tc.nextDouble();
        
        System.out.println("Sexo biologico:");
        sexo = tc.next().toLowerCase(); // M m ou F f
        
        if(sexo.equals("m")){
            peso = 72.7 * altura - 58;
            System.out.printf("Peso ideal = %.2f\n", peso);
        } else if (sexo.equals("f")) {
            peso = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal = %.2f\n", peso);
        } else{
            System.out.println("Opcao Invalida");
        }
        
        tc.close();
    }
    
}
