package javaapplication24;
import java.util.Scanner;
public class JavaApplication24 {
    public static void main(String[] args) {
     double peso,preco,imposto,total;
     int codestado,codcarga;
     Scanner e=new Scanner(System.in);
     System.out.println("insira o peso em toneladas\nInsira o codigo de estado");
     System.out.println("insira o codigo da carga");
     peso=e.nextDouble();
     codestado=e.nextInt();
     codcarga=e.nextInt();
     preco=0;
     if(codcarga>=10 && codcarga<20){
         preco=peso*100.0;
     }else if(codcarga>=20 && codcarga<30){
         preco=peso*250.0;
     }else if(codcarga>=30 && codcarga<=40){
         preco=peso*340.0;
     }else{
         System.out.println("codigo de carga invalido");
     }
     imposto=0;
     switch(codestado){
         case 1:
             imposto=preco*0.35;
             break;
         case 2:
             imposto=preco*0.25;
             break;
         case 3:
             imposto=preco*0.15;
             break;
         case 4:
             imposto=preco*0.05;
             break;
         case 5:
             imposto=0;
             break;
         default:
             System.out.println("\ncodigo de estado invalido");
     }
     total=preco+imposto;
     System.out.printf("valor total: %.2f\n", total);
    } 
}
