package aula0512.poo.heranca.exercicio;

public class Motos extends Veiculos{
//    ATRIBUTOS
    private int buzina;
    private int cavalos;
    
//    MÉTODOS
    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("BIBIBIBIBIBIBBIBIBIBIBIBIBI");
    }

    public int getBuzina() {
        return buzina;
    }

    public void setBuzina(int buzina) {
        this.buzina = buzina;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
    
    
}

