package l43;
import java.util.Scanner;
public class L43 {
    public static void main(String[] args) {
     double n1,n2,n3;
     Scanner e = new Scanner(System.in);
     System.out.printf("insira os valores:\n");
     n1=e.nextDouble();
     n2=e.nextDouble();
     n3=e.nextDouble();
     if(n1<n2&&n1<3){
         if(n2<n3){
             System.out.printf("%f < %f < %f\n", n1,n2,n3);  
         }else{
             System.out.printf("%f < %f < %f\n",n1,n3,n2);
         }
     }
     if(n2<n1&&n2<n3){
         if(n1<n3){
             System.out.printf("%f < %f < %f\n", n2,n1,n3);
         }else{
             System.out.printf("%f < %f < %f\n", n2,n3,n1);
         }
     }
     if(n3<n2&&n3<n1){
         if(n2<n1){
             System.out.printf("%f < %f < %f\n", n3,n2,n1);
         }else{
             System.out.printf("%f < %f < %f\n", n3,n1,n3);
         }
     }
    }
}
