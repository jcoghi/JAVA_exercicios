/*
Faça um programa que leia um vetor com cinco posições para números reais e, 
depois, um código inteiro. Se o código for zero, finalize o programa; 
se for 1, mostre o vetor na ordem direta; se for 2,mostre o vetor na ordem 
inversa.
 */
package javaapplication29;
import java.util.Scanner;
public class JavaApplication29 {
    public static void main(String[] args) {
     int i,cod;
     double x[]=new double[5];
     Scanner e=new Scanner(System.in);   
     System.out.println("Insira os valores");
        for(i=0;i<5;i++){
            x[i]=e.nextDouble();
        }
        System.out.println("menu\nEscolha a opção\n0 - para finalizar");
        System.out.println("1 - para exibir o vetor na ordem direta");
        System.out.println("2 - para exibir o vetor n ordem inversa");
        cod=e.nextInt();
     switch(cod){
         case 0:
             break;
         case 1:
             for(i=0;i<5;i++){
                 System.out.println(x[i]);
             }
             break;
         case 2:
             for(i=4;i>=0;i--){
                 System.out.println(x[i]);
             }
             break;
         default:
             System.out.println("Valor inválido");
     }
             
    }
}
