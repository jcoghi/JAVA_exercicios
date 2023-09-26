package aula0306;
// Vir aqui para importar as APIs
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
// Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        String nome;
// Atribuição dos valores
        System.out.print("Qual o seu nome? ");
        nome = teclado.next();
// Saída dos dados
        System.out.println("Ola " + nome + ", como voce vai?");
        System.out.printf("Ola %s, como voce vai?\n", nome);
        
    }
}
