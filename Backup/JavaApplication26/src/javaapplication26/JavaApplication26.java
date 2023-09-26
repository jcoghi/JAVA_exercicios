/*
programa de método de monte carlo para determinar o número pi com 
dupla precisão.
Uso de estruturas de repetição 
*/
package javaapplication26;
import java.lang.Math.*;
public class JavaApplication26 {
    public static void main(String[] args) {
     double a=0,x,y,area,pi;
     int i,n;
     n=1000000000;
     for(i=0;i<=n;i++){
         x=Math.random();
         y=Math.random();
         if(x*x+y*y<=1){
             a=a+1;
         }
     }
     area=4.0*(a/n);
     pi=Math.acos(-1.0);
        System.out.println("Valor de PI = "+area);
        System.out.println("Valor de PI via função: "+pi);
    }    
}
