/*
 Crie um programa que preencha uma matriz 8 x 8 com números inteiros e 
mostre uma mensagem dizendo se amatriz digitada é simétrica. 
Uma matriz só pode ser considerada simétrica se A[i,j] = A[j,i] .
 */
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
    public static void main(String[] args) {
     int i,j,c=0;
     int x[][]=new int[3][3];
     Scanner e=new Scanner(System.in);
     System.out.println("insira os elementos da matriz");
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             System.out.printf("linha %d coluna %d",i,j);
             x[i][j]=e.nextInt();
         }
     }
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             if(x[i][j]==x[j][i]){
                 c++;
             }
         }
     }
     if(c>=6){
         System.out.println("matriz simétrica");
     }
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             System.out.printf("%d\t",x[i][j]);
             if(j==2){
                 System.out.printf("\n");
             }
         }
     }
    }
}
