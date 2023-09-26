package javaapplication40;
import java.util.Scanner;
public class JavaApplication40 {
    public static void main(String[] args) {
       Scanner e=new Scanner(System.in);
       String cargo,s;
       double salario,p,pp;
       String veiculo;
       System.out.println("Escolha um dos cargos:");
       System.out.println("Gerente\nDiretor\nSupervisor");
       cargo=e.next();
       System.out.println("Insira o salario");
       salario=e.nextDouble();
       System.out.println("Qual o sexo do funcionario?");
       s=e.next();
       System.out.println("Possui veiculo? True ou FALSE");
       veiculo=e.next();
        System.out.println("Percentual de aumento");
        p=e.nextDouble();
        pp=p/100.0;
       switch(cargo){
           case "Gerente":
               Gerente g1=new Gerente(salario,s,veiculo,pp);
               g1.aumentar_salario();
               g1.vale_transporte();
               break;
           case "Diretor":
               Diretor d1=new Diretor(salario,s,veiculo,pp);
               d1.aumentar_salario();
               d1.vale_transporte();
               break;
           case "Supervisor":
               Supervisor s1=new Supervisor(salario,s,veiculo,pp);
               s1.aumentar_salario();
               s1.vale_transporte();
               break;
           default:
               System.out.println("erro!!!!");
       } 
    }
}
