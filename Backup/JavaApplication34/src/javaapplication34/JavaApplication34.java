/*
Faça umprograma contendo uma sub-rotina que retorne 1 se o 
número digitado for positivo ou 0 se for negativo.
 */
package javaapplication34;
import java.util.Scanner;
public class JavaApplication34 {
    public static void main(String[] args) {
     int n,r;   
     Scanner e=new Scanner(System.in);
        System.out.println("\nInsira o numero");
        n=e.nextInt();
        r=aval(n);
        System.out.println("valor: "+r);
    }
    public static int aval(int n){
        int x;
        if(n>0){
            x=1;
        }else{
            x=0;
        }
        return x;
    }
}
