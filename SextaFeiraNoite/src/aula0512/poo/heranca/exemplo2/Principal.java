package aula0512.poo.heranca.exemplo2;

public class Principal {

    public static void main(String[] args) {
        
        Carros uno = new Carros("MiniCarro",65,2,80);
        uno.acelerar(10);
        System.out.println(uno.cavalos + " " + uno.chassis);
        
        Motos bis = new Motos("Vespa", 90);
        bis.acelerar(20);
    }
}
