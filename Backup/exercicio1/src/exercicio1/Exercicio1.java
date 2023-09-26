package exercicio1;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
    int n1,n2,n3,n4,s;
    Scanner ent = new Scanner(System.in);
    System.out.print("insira os valores");
    n1=ent.nextInt();
    n2=ent.nextInt();
    n3=ent.nextInt();
    n4=ent.nextInt();
    s=n1+n2+n3+n4;
    System.out.println("soma = "+s);    
    }
    
}
