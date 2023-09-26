package aula0317;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int idade;
        char sexo;
        System.out.println("Idade?");
        idade = tc.nextInt();
        
        System.out.println("Sexo?");
        sexo = tc.next().toLowerCase().charAt(0);
        
        if(idade >= 2 && idade <=6) {
            //hemoglobina
        } else if (idade <6 && idade <= 12) {
            // hemoglobina
        } else if (idade > 12 && idade <= 120) {
            if (sexo == 'm') {
                // hemoglobina
            } else if (sexo == 'f') {
                
            } else {
                System.out.println("Sexo invalido");
            }
        }else{
            System.out.println("Idade invalida");
        }
        
        tc.close();
        
    }
    
}
