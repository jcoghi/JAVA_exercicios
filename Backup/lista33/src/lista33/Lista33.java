package lista33;
import java.util.Scanner;
import java.lang.Math.*;
public class Lista33 {
    public static void main(String[] args) {
     double n1,n2,p1,p2;
     Scanner e = new Scanner(System.in);
     System.out.print("insira os dois numeros:\n");
     n1=e.nextDouble();
     n2=e.nextDouble();
     p1=Math.pow(n1, n2);
     p2=Math.pow(n2, n1);
     //System.out.printf("%f elevado %f = %f\n",n1,n2,p1);
     System.out.println(n1+" elevado "+n2+" = "+p1);
     //System.out.printf("\n%f elevado %f = %f",n2,n1,p2);
     System.out.println(n2+" elevado "+n1+" = "+p2);
    }    
}
