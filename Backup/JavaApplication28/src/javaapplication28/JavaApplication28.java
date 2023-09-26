/*
 Faça umprograma que receba o número sorteado por um dado em vinte jogadas.
Mostre os números sorteados e a frequência com que apareceram.
 */
package javaapplication28;
import java.util.Scanner;
public class JavaApplication28 {
    public static void main(String[] args) {
     int i,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
     int s[]=new int[20];
     Scanner e=new Scanner(System.in);
        System.out.println("insira os valores sorteados");
     for(i=0;i<20;i++){
         s[i]=e.nextInt();
     }
        System.out.println("valores sorteados");
        for(i=0;i<20;i++){
            System.out.printf("%d\n",s[i]);
        }
        for(i=0;i<20;i++){
            switch(s[i]){
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
                default:
                    System.out.println("valor inválido");
            }
        }
        System.out.println("valores 1: "+c1);
         System.out.println("valores 2: "+c2);
          System.out.println("valores 3: "+c3);
           System.out.println("valores 4: "+c4);
            System.out.println("valores 5: "+c5); 
            System.out.println("valores 6: "+c6);
    }
}
