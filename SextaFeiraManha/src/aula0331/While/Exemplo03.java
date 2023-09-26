package aula0331.While;

import java.util.Scanner;

/* 3 chances para liberar acesso com login e senha.
 * Após a 3ª tentativa, aparece que o acesso tá bloqueado
*/
public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        String username = "joao", login, senha, pwd = "123";
        int contador = 3;
        
        while ( contador > 0) {
            System.out.println("Voce ainda tem " + contador + " tentativas");
            System.out.println("Login:");
            login = tc.next().toLowerCase();
            
            System.out.println("Senha:");
            senha = tc.next();
            
            if (login.equals(username) && senha.equals(pwd)) {
                break;
            } else {
                System.out.println("Login/Senha invalidos");
                contador--;
            }
        }
        
        if (contador == 0) {
            System.out.println("Acesso Bloqueado");
        } else{
            System.out.println("Acesso liberado");
        }
        
    }
}
