package javaapplication25;
import java.util.Scanner;
public class JavaApplication25 {
    public static void main(String[] args) {
     double n1,n2,m,mt;
     int ta,te,tr;
     Scanner e =new Scanner(System.in);
     ta=0;
     te=0;
     tr=0;
     mt=0;
     for(int i=1;i<=6;i++){
         System.out.println("insira as notas: ");
         n1=e.nextDouble();
         n2=e.nextDouble();
         m=(n1+n2)/2.0;
         System.out.println("media = "+m);
         if(m>=0 && m<3){
             System.out.println("reprovado");
             tr++;
         }
         if(m>=3 && m<7){
             System.out.println("exame");
             te++;
         }
         if(m>=7 && m<=10){
             System.out.println("aprovado");
             ta++;
         }
         mt=mt+m;
     }
     mt=mt/6.0;
     System.out.println("Total de aprovados: "+ta);
     System.out.println("Total exame: "+te);
     System.out.println("Total de reprovados: "+tr);
     System.out.println("Media da turma: "+mt);
    }
}
