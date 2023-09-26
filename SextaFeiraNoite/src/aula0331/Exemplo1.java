package aula0331;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        int fatorial, acumulador = 1; // acumular algo
        
        System.out.println("Numero?");
        fatorial = tc.nextInt();
        
        for (int i = fatorial; i >1; i--) {
            acumulador *= i;
        }
        
        System.out.println(acumulador);
        tc.close();
    }

}

//  github.com/jcoghi/java




