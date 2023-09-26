package exercicio6;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
     double gra,imp,sb,sr;
     Scanner e= new Scanner(System.in);
     System.out.println("\n insira o salario base:\n");
     sb=e.nextDouble();
     gra=0.05*sb;
     imp=0.07*sb;
     sr=sb+gra-imp;
     System.out.printf("\n salario a receber: R$ %.2f\n",sr);
    }
}
