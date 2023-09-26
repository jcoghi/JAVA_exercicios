package lista34;
import java.util.Scanner;
public class Lista34 {
    public static void main(String[] args) {
     double pe,ja,pol,mil;
     Scanner e =new Scanner (System.in);
     System.out.print("\ninsira o valor em pes:\n");
     pe=e.nextDouble();
     pol=pe/12.0;
     ja=pe/3.0;
     mil=ja*1.760;
     System.out.println("polegadas: "+pol+" jardas: "+ja+" milhas: "+mil);
    }
}
