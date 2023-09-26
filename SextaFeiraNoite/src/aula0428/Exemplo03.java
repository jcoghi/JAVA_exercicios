package aula0428;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        try{
        System.out.println("Digite seu nome:");
        String nome = tc.next();
        System.out.println("Digite sua idade:");
        int idade = tc.nextInt();
        
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        
        } catch(Exception e) {
            System.out.println("Veja o que voce digitou"
                    + " de errado");
//            e.printStackTrace();
        }
        
    }

}
