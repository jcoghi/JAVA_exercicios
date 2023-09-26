package lista36;
import java.util.Scanner;
public class Lista36 {
    public static void main(String[] args) {
     double imp,ld,pfinal,pf,imp1,ld1;
     Scanner e =new Scanner(System.in);
     System.out.print("\ninsira o preço\n");
     pf=e.nextDouble();
     System.out.print("\ninsira o percentual de imposto\n");
     imp=e.nextDouble();
     System.out.print("\ninsira o percentual de lucro\n");
     ld=e.nextDouble();
     imp1=pf*(imp/100.0);
     ld1=pf*(ld/100.0);
     pfinal=pf+ld1+imp1;
     System.out.println("\nlucro distribuidor: "+ld1);
     System.out.println("\nimposto: "+imp1+" valor total: "+pfinal);
    }
}
