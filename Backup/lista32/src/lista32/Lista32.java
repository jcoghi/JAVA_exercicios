package lista32;
import java.util.Scanner;
import java.lang.Math.*;
public class Lista32 {
    public static void main(String[] args) {
     double n,q,c,r,rc;
     Scanner e =new Scanner(System.in);
     System.out.print("\ninsira o numero:\n");
     n=e.nextDouble();
     q=Math.pow(n, 2);//q=n*n;
     c=Math.pow(n,3);//c=n*n*n;
     r=Math.sqrt(n);//r=Math.pow(n,1.0/2.0);
     rc=Math.cbrt(n);//rc=Math.pow(n,1.0/3.0);
     System.out.printf("quadrado: %f", q);
     System.out.printf("cubo: %f\nraiz: ",c,r);
     System.out.printf("raiz cubica: %f",rc);
    }   
}
