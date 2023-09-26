
package operadoreslogicos;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");
        String resultado;
        
        resultado = (nome1 == "Joao")?"igual":"Diferente";
        
        System.out.println(resultado);
        
    }
}
