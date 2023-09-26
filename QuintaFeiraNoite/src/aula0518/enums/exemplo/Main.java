package aula0518.enums.exemplo;
public class Main {
    public enum DiasDaSemana{
        SEGUNDA(1, "Segunda-feira"),
        TERCA(2, "Terça-feira"),
        QUARTA(3, "Quarta-feira"),
        QUINTA(4, "Quinta-feira"),
        SEXTA(5, "Sexta-feira"),
        SABADO(6, "Sábado"),
        DOMINGO(7, "Domingo");
 
        private final int valor;
        private final String dia;
 
        DiasDaSemana(int valor, String dia) {
            this.valor = valor;
            this.dia = dia;
        }
 
    }
    public static void main(String[] args) {
        DiasDaSemana diaAtual = DiasDaSemana.SEGUNDA;
        switch (diaAtual){
            case SEGUNDA:
                System.out.println(diaAtual.dia);
                break;
            case TERCA:
                System.out.println(diaAtual.dia);
                break;
            default:
                System.out.println("Outro dia da semana");
        }
    }
 }
/*Resultado:
Segunda-feira
*/