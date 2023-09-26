package listacondicional;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        /* FAÇA UM PROGRAMA QUE LEIA UM NÚMERO INTEIRO E RETORNA AO USUÁRIO
        SE É PAR OU ÍMPAR E SE É POSITIVO OU NEGATIVO*/
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0){
            if (numero > 0){
                System.out.println("Par e positivo");
            }else if (numero == 0){
                System.out.println("Par e neutro");
            }else{
                System.out.println("Par e negativo");
            }
            
        } else {
            if (numero > 0){
                System.out.println("Impar e positivo");
            }else{
                System.out.println("Impar e negativo");
            }
        }
        
        teclado.close();
    }

}
