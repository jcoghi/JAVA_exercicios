package helloworld;

/**
 * @author joaof
 */
public class Banco {
    public static void main(String[] args) {
        
        Conta c1 = new Conta(01, 100, new Pessoa("Joao", "11155566688"));
        
        
        c1.getDono().getNome();
    }
}
