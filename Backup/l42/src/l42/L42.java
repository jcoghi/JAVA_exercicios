package l42;
import java.util.Scanner;
public class L42 {
    public static void main(String[] args) {
     double n1,n2;
     Scanner e = new Scanner(System.in);
     System.out.println("insira os dois numeros");
     n1=e.nextDouble();
     n2=e.nextDouble();
     if(n1>n2){
         System.out.printf("%f > %f\n",n1,n2);
     }
     else{
         System.out.printf("%f > %f\n", n2,n1);
     }
    }
}
