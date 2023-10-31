package helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class TesteString {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String palavra = "palavra";
        String resultado = "";
        String[] mostrador = new String[palavra.length()];
        String[] letras = palavra.split("");
        int contador = 0;
        
        for (int a = 0; a < palavra.length(); a++) {
            mostrador[a] = "-";
        }
        
        System.out.println("Entre com uma letra:");
        char entradaTeclado = teclado.next().toLowerCase().charAt(0);
        String entrada = String.valueOf(entradaTeclado);
        System.out.println(entrada);
        for(String letra : letras) {
            resultado = "";
            if (letra.equals(entrada)) {
                mostrador[contador] = entrada;
            }
            resultado += mostrador[contador];
            contador++;
        }
        System.out.println(resultado);
        System.out.println(Arrays.toString(mostrador));
    }
    
}
