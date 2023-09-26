/*
Criar uma classe
Dentro desta classe colocar -> Enum com os dias da semana
No método main, printar na telas os dias da semana
*/
package aula0519.poo.enums.diassemana;

public class Main {
    enum DiasSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
    }
    
    public static void main(String[] args) {
        
        for (DiasSemana dias: DiasSemana.values()) {
            System.out.println(dias);
        }
        
    }
    
}
