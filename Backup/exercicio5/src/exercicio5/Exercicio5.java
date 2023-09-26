package exercicio5;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
     double s,perc,au,ns;
     Scanner e =new Scanner(System.in);
     System.out.println("\n insira o salario:\n");
     s=e.nextDouble();
     System.out.println("\n Insira o percentual de aumento:\n");
     perc=e.nextDouble();
     au=s*(perc/100.0);
     ns=s+au;
     System.out.printf("\n Aumento R$ %.2f\n", au);
     System.out.printf("\n Novo salário: R$ %.2f\n",ns);
    }   
}
