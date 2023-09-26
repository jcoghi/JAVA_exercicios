/*
    USUÁRIO ENTRA COM UM NÚMERO E O PROGRAMA DEFINE SE É UM NÚMERO PRIMO.
*/















package listarevisao;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Entre com um numero: ");
        int numero = tc.nextInt();
        int flag = 0;
        
        if (numero <= 1){
            System.out.println("Nao  primo");
        }
        
        else {
            for (int i = 2; i < numero; i++) {
                if (numero % i ==0) {
                    System.out.println(numero + " nao primo");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(numero + " primo");
            }
        }
        
        
        tc.close();
    }
    
}
