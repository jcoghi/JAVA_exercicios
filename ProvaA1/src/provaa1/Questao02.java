package provaA1;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double desconto = 0;
        System.out.println("Digite o valor da compra: ");
        double valor = teclado.nextDouble();
        
        
        //Para resolver a falha, precisamos colocar um "limite", no if e else, usando o "&&". Porque se não, 
        //qualquer valor que colocarmos acima de "100", ele irá colocar todos os descontos.
        
        if (valor > 100 && valor < 200) {
            desconto = valor * 0.02;
        } else if (valor > 200 && valor < 300) {
            desconto = valor * 0.05;
        } else if (valor > 300){
            desconto = valor * 0.10;
        } else {
            System.out.println("Sem desconto.");
        }

        double valorfinal = valor - desconto;
        System.out.println("Valor da compra: " + valor + "\nValor do desconto: " + desconto);
        System.out.println("Valor final com desconto: " + valorfinal);

    }
}
