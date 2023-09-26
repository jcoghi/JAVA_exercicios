package l44;
import java.util.Scanner;
public class L44 {
    public static void main(String[] args) {
     int n1,n2;
     Scanner e = new Scanner(System.in);
     System.out.println("insira o valor:");
     n1=e.nextInt();
     if(n1%2==0){
         System.out.printf("%d é par\n",n1);
     }
     else{
         System.out.printf("%d é impar\n",n1);
     }
    }
}
