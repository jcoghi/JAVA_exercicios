package lista31;
import java.util.Scanner;
import java.lang.Math.*;
public class Lista31 {
    public static void main(String[] args) {
     double r,a,pi;
     Scanner e =new Scanner(System.in);
     System.out.print("\n insira o raio:\n");
     r=e.nextDouble();
     pi=Math.acos(-1.0);
     a=pi*Math.pow(r,2);//a=pi*r*r;
     System.out.printf("area: %.2f\n",a);
    }   
}
