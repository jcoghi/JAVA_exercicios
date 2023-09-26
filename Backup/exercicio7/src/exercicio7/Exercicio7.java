package exercicio7;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
     double rend,dep,tx,rendt;
     Scanner e= new Scanner(System.in);
     System.out.println("\n Insira o deposito:");
     dep=e.nextDouble();
     System.out.println("\n insira a taxa de juros:");
     tx=e.nextDouble();
     rend=dep*(tx/100.0);
     rendt=dep+rend;
     System.out.printf(" rendimento: %.2f\n Deposito total: %.2f",rend,rendt);
    }
}
