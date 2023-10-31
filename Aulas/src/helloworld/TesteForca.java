package helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TesteForca {
    public static void main(String[] args) {
        String resultado;
        String[] bancoDados = {"mamão"};
        boolean ligado = true;
        int contador;
        
        Scanner tc = new Scanner(System.in);
        Random gerador = new Random();
        
        String senha = bancoDados[gerador.nextInt(bancoDados.length)];
        String[] mostrador = new String[senha.length()];
        char[] senhaVetor = senha.toCharArray();
        
        int tentativa = senha.length();
        
        for(int a = 0; a < senha.length(); a++) {
            mostrador[a] = "-";
        }
        
        while (ligado) {
            resultado = "";
            contador = 0;
            boolean encontrado = false;
            System.out.println(Arrays.toString(mostrador));
            System.out.println("Você tem " + tentativa + " tentativas");
            System.out.println("Entre com uma letra: ");
            char entrada = tc.next().toLowerCase().charAt(0);
            
            if (entrada != 'ã' || entrada != 'á') {
                if (entrada < 'a' || entrada > 'z') {
                System.out.println("Entrada inválida");
                }
            } else {
                
                for(char letra : senhaVetor) {
                    
                    if (entrada == letra) {
                        mostrador[contador] = String.valueOf(letra);
                        encontrado = true;
                    } 
                    resultado += mostrador[contador].toLowerCase();
                    contador++;
                }
                
                if (resultado.equals(senha)) {
                    System.out.println("\n" + resultado + "\n VOCÊ GANHOU");
                    
                    ligado = false;
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
