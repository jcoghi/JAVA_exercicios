/*
 * Elabore um algorítmo em Java e apresente sua lógica para solucionar a seguinte
 * situação:
 * O usuário informará sua data de nascimento no formato dd/mm/aaaa
 * O programa deve calcular a quantidade de dias vividos até o dia atual (dia da
 * execussão do programa).
 * IMPORTANTE:
 *   Não pode utilizar as bilbiotecas LocalDate e ChronoUnit;
 *   Utilizar apenas Calendar e Scanner;
 *   Lembre-se dos anos bissextos.
 */
package listaExercicios;
import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Data de nascimento (dd/mm/aaaa)");
        String dataNascimento = tc.nextLine();
        
        int dia = Integer.parseInt(dataNascimento.substring(0,2));
        int mes = Integer.parseInt(dataNascimento.substring(3,5));
        int ano = Integer.parseInt(dataNascimento.substring(6));
        
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(ano, mes-1,dia);
        
        long diasVividos = 0;
        while(dataNasc.before(dataAtual)) {
            dataNasc.add(Calendar.DAY_OF_MONTH, 1);
            diasVividos++;
        }
        System.out.println("Viveu " + diasVividos);
    }

}
