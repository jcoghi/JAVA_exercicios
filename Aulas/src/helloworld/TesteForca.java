package helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TesteForca {
    public static void main(String[] args) {
        String[] bancoDados = {"abacate", "mamão", "banana", "morango", "umbu"};
        boolean ligado = true;
        int contador = 0;
        
        Scanner tc = new Scanner(System.in);
        Random gerador = new Random();
        
        String senha = bancoDados[gerador.nextInt(bancoDados.length)];
        String[] mostrador = new String[senha.length()];
        String[] senhaVetor = senha.split("");
        
        int tentativa = senha.length();
        
        for(int a = 0; a < senha.length(); a++) {
            mostrador[a] = "-";
        }
        
        
        while (ligado) {
            
            boolean encontrado = false;
            System.out.println(Arrays.toString(mostrador));
            System.out.println("Você tem " + tentativa + " tentativas");
            System.out.println("Entre com uma letra: ");
            char entrada = tc.next().toUpperCase().charAt(0);
            
            if (entrada < 65 || entrada > 90) {
                System.out.println("Entrada inválida");
            } else {
                
                for(String letra : senhaVetor) {
                    
                    if (letra.charAt(0) == entrada) {
                        mostrador[contador] = letra;
                        contador++;
                        encontrado = true;
                    } else {
                    }
                }
                
                if (!encontrado) {
                    tentativa--;
                    if (tentativa == 0) {
                        System.out.println("Você perdeu");
                        ligado = false;
                    } else {
                    System.out.println("Letra não encontrada");
                    }
                }
                
                System.out.println("");
            }
            
            
        }
        
    }
        
}
