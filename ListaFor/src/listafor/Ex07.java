package listafor;

import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUm, numeroDois;
        System.out.println("******************");
        
        for (int i = 0; i <3; i++) {
            System.out.print("Digite um numero: ");
            numeroUm = teclado.nextInt();
            
            System.out.print("Digite outro numero: ");
            numeroDois = teclado.nextInt();
            
            System.out.printf("%d - %d = %d \n", numeroUm, numeroDois, (numeroUm - numeroDois));
            System.out.println("******************");    
        }
        teclado.close();
    }
    
}
