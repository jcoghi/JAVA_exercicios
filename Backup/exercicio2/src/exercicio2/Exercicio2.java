package exercicio2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
    double n1,n2,n3,m;
    Scanner e=new Scanner(System.in);
    System.out.println("insira as notas:\n");
    n1=e.nextDouble();
    n2=e.nextDouble();
    n3=e.nextDouble();
    m=(n1+n2+n3)/3.0;
    System.out.printf("média = %5.2f\n",m);
    }  
}
