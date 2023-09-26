/*
 Crie um programa que preencha uma matriz 8 x 8 com números inteiros e 
mostre uma mensagem dizendo se amatriz digitada é simétrica. 
Uma matriz só pode ser considerada simétrica se A[i,j] = A[j,i] . versao generica
 */
package javaapplication33;
import java.util.Scanner;
import java.lang.Math.*;
public class JavaApplication33 {
    public static void main(String[] args) {
        int i,j,c=0,m,y;
        double k;
        Scanner e=new Scanner(System.in);
        System.out.println("insira o número linhas e colunas da matriz quadrada");
        m=e.nextInt();
        int x[][]=new int[m][m];
        //System.out.println("insira os valores da matriz");
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
             //System.out.printf("linha %d coluna %d\n",i,j);
                //x[i][j]=e.nextInt();
                k=10*Math.random();
                y=(int)k;
                x[i][j]=y;
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(x[i][j]==x[j][i]){
                    c++;
                }
            }
        }
        if(c>=((m*m)-m)){
        System.out.println("matriz simetrica");
        }
        else{
            System.out.println("matriz não simetrica");
        }
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.printf("%d\t",x[i][j]);
                if(j==(m-1)){
                    System.out.printf("\n");
                }
            }
        }
    }
}
