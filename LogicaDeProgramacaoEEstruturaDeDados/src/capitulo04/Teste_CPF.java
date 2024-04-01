package capitulo04;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Teste_CPF {

    public static void main(String[] args) {

        String nome;
        String cpf;
        Scanner tc  = new Scanner(System.in);
        
        System.out.print("Nome: ");
        nome = tc.nextLine();
        
        System.out.println("CPF");
        cpf = tc.next();
        
        if (!nome.matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")) {
            System.out.println("Nome inválido");
        } else {
            System.out.println(nome);
        }
        
        if (!cpf.matches("[0-9]+") && cpf.length() != 11) {
            System.out.println("CPF inválido");
        } else {
            System.out.println(cpf);
        }
    }

}
