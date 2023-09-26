package aula0512.poo.heranca.exercicio;

public class Principal {

    public static void main(String[] args) {
        
        Carros uno = new Carros();
        uno.setChassis("MiniCarro");
        uno.setCavalos(65);
        uno.setRodas(4);
        uno.setPortas(2);
        uno.acelerar();
        
        Motos bis = new Motos();
        bis.setBuzina(100000);
        bis.setCavalos(90);
        bis.setChassis("Vespa");
        bis.setRodas(2);
        bis.acelerar();
    }

}
