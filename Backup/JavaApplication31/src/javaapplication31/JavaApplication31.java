/*
 Faça um programa que, no momento de preencher um vetor com oito
números inteiros, já os armazene de forma crescente.
*/
package javaapplication31;
import java.util.Scanner;
public class JavaApplication31 {
    public static void main(String[] args) {
      int i,j,aux;
      int v[]=new int[8];
      Scanner e=new Scanner(System.in);
        System.out.println("insira os valores do vetor");
        for(i=0;i<8;i++){
            v[i]=e.nextInt();
        }
        System.out.println("vetor normal");
        for(i=0;i<8;i++){
            System.out.println(v[i]);
        }
        for(i=0;i<8;i++){
            for(j=0;j<7;j++){
                if(v[j]>v[j+1]){
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
        System.out.println("Vetor ordenado");
        for(i=0;i<8;i++){
            System.out.println(v[i]);
        }
    }
}
