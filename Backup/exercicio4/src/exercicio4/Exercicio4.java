package exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        double s,ns;
        Scanner e = new Scanner (System.in);
        System.out.println("insira o salário:\n");
        s=e.nextDouble();
        ns=s+s*(25.0/100.0);
        System.out.printf("novo salario = %.2f\n", ns);   
    } 
}
