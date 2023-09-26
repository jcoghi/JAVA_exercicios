package exercicio3;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
    double n1,n2,n3,p1,p2,p3,mp;
    Scanner e= new Scanner(System.in);
    System.out.println("\n insira as notas:\n");
    n1=e.nextDouble();
    n2=e.nextDouble();
    n3=e.nextDouble();
    System.out.println("\n insira os pesos: \n");
    p1=e.nextDouble();
    p2=e.nextDouble();
    p3=e.nextDouble();
    mp=(n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
    System.out.println("\n Media = "+mp);
    }
}
