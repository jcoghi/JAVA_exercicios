package aula0410;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        var tc = new Scanner(System.in);
        int[] idades = new int[3];
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite sua idade");
            idades[i] = tc.nextInt();
        }
        
        System.out.println("");
        
        for (int idade: idades) {
            System.out.println(idade);
        }
        
    }
}
