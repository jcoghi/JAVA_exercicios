/*
Elabore umprograma que preencha uma matriz 6 x 4 comnúmeros inteiros, 
calcule e mostre quantos elementos dessa matriz são maiores que 30 e, 
em seguida, monte uma segunda matriz com os elementos diferentes de 30. 
No lugar do número 30, da segundamatriz, coloque o número zero.
 */
package javaapplication30;
import java.util.Scanner;
public class JavaApplication30 {
    public static void main(String[] args) {
     int i,j,n30=0;
     int x[][]=new int[6][4];
     int y[][]=new int[6][4];
     Scanner e =new Scanner(System.in);
     for(i=0;i<6;i++){
         for(j=0;j<4;j++){
             x[i][j]=e.nextInt();
         }
     }
     for(i=0;i<6;i++){
         for(j=0;j<4;j++){
             if(x[i][j]==30){
                 n30++;
             }
         }
     }
        System.out.println("total de valores iguais a 30 "+n30);
        for(i=0;i<6;i++){
         for(j=0;j<4;j++){
             if(x[i][j]==30){
                 y[i][j]=0;
             }else{
                 y[i][j]=x[i][j];
             }
         }
     }
        for(i=0;i<6;i++){
         for(j=0;j<4;j++){
             System.out.printf("%d\t",y[i][j]);
             if(j==3){
                 System.out.printf("\n");
             }
         }
     }
    }
}
