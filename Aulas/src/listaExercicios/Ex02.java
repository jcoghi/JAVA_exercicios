/*
 * Cálculo de idade a partir da data de aniversário
*/

package listaExercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        try {
            Calendar c = Calendar.getInstance();
            // Reconhecendo a data de hoje.
            int ano = c.get(Calendar.YEAR);
            int mes = c.get(Calendar.MONTH) + 1;
            int dia = c.get(Calendar.DAY_OF_MONTH);

            // Recebendo a data de aniversário do usuário
            String[] dataAniversario = {};
            String data;
            Scanner tc = new Scanner(System.in);
            System.out.println("Data do aniversário[dd/mm/aaaa]?");
            data = tc.next();
            dataAniversario = data.split("/");

            int diaAniversario = Integer.parseInt(dataAniversario[0]),
                mesAniversario = Integer.parseInt(dataAniversario[1]),
                anoAniversario = Integer.parseInt(dataAniversario[2]);
            int idade;

            if (anoAniversario < 1800 || diaAniversario < 1 || mesAniversario < 1) {
                System.out.println("Data incorreta");
            } else {
                if(mes >= mesAniversario && dia >= diaAniversario) {
                    idade = ano - anoAniversario;
                    System.out.println("Você tem " + idade + " anos");
                } else {
                    idade = ano - anoAniversario - 1;
                    System.out.println("Você tem " + idade + " anos");
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }

}
