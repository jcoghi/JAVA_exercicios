package aula0321;

import java.util.Scanner;
/* LÓGICA CONDICIONAL */
public class Exemplo01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int a = 3;
        
        if (a == 2) {
            System.out.println("Passei aqui");
        } else{
            System.out.println("Agora foi aqui");
        }
        
        teclado.close();
    }
}
