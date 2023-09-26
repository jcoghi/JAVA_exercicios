package javaapplication39;
import java.util.Scanner;
public class JavaApplication39 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        int tipo,quant;
        String nome_produto;
        double p;
        System.out.println("Escolha o tipo de produto:");
        System.out.println("1 - ALimento\n2 - Limpeza");
        tipo=e.nextInt();
        switch(tipo){
            case 1:
                System.out.println("Qual o nome do alimento");
                nome_produto=e.next();
                System.out.println("Preço do produto");
                p=e.nextDouble();
                System.out.println("Quantidade");
                quant=e.nextInt();
                Alimento a1=new Alimento(nome_produto,p,quant);
                a1.desconto();
                break;
            case 2:
                System.out.println("Qual o nome do Produto de limpeza");
                nome_produto=e.next();
                System.out.println("Preço do produto");
                p=e.nextDouble();
                System.out.println("Quantidade");
                quant=e.nextInt();
                Limpeza l1=new Limpeza(nome_produto,p,quant);
                l1.desconto();
                break;
            default:
                System.out.println("Erro opção incorreta");
        }
    }
}
