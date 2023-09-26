package l41;
import java.util.Scanner;
public class L41 {
    public static void main(String[] args) {
      double n1,n2,n3,m;
      Scanner e = new Scanner(System.in);
      System.out.println("insira as notas");
      n1=e.nextDouble();
      n2=e.nextDouble();
      n3=e.nextDouble();
      m=(n1+n2+n3)/3.0;
      if(m>=0&&m<3){
          System.out.println("reprovado");
      }
      if(m>=3&&m<7){
          System.out.println("Exame");
          double exame=12-m;
          System.out.println("Exame: "+exame);
      }
      if(m>=7&&m<=10){
          System.out.println("aprovado");
      }
    }  
}
