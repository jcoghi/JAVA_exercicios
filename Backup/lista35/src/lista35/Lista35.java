package lista35;
import java.util.Scanner;
public class Lista35 {
    public static void main(String[] args) {
     double id, id2050,an,at;
     Scanner e =new Scanner(System.in);
     System.out.print("\ninsira seu ano de nascimento\n");
     an=e.nextDouble();
     System.out.print("\ninsira o ano atual:\n");
     at=e.nextDouble();
     id=at-an;
     id2050=2050-an;
     System.out.printf("idade atual: %.0f\n",id);
     System.out.printf("idade em 2050: %.0f", id2050);
    }
}
