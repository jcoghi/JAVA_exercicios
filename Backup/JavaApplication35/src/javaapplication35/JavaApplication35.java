/*
 Faça um programa contendo uma sub-rotina que receba dois números 
positivos por parâmetro e retorne a soma dos N números inteiros 
existentes entre eles.
 */
package javaapplication35;
import java.util.Scanner;
public class JavaApplication35 {
    public static void main(String[] args) {
    Scanner e=new Scanner(System.in);
    int a,b;
        do{
        System.out.println("insira valores a e b");
        a=e.nextInt();
        b=e.nextInt();
        }while(a<0||b<0);
        soma(a,b);
    }
    public static void soma(int a,int b){
        int n=0,i;
        if(a<=b){
            for(i=a;i<=b;i++){
               n=n+i; 
            }
        }else{
            for(i=a;i>=b;i--){
               n=n+i; 
            }
        }
        System.out.printf("soma entre os valores %d e %d sera %d\n",a,b,n);
    }
}
