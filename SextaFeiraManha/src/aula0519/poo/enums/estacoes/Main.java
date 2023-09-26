/*
Criar uma classe
Dentro desta classe colocar -> Enum com os dias da semana
No método main, printar na telas os dias da semana
*/
package aula0519.poo.enums.estacoes;

public class Main {
    enum Estacoes {
        VERAO,OUTONO,INVERNO,PRIMAVERA;
    }
    
    public static void main(String[] args) {
        
        for (Estacoes e: Estacoes.values()) {
            System.out.println(e);
        }
        
    }
    
}
