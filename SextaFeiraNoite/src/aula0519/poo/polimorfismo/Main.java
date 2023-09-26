package aula0519.poo.polimorfismo;

public class Main {

    public static void main(String[] args) {


        Cachorro poodle = new Cachorro();
        Gato persa = new Gato();

        poodle.fazerSom();
        System.out.println(poodle.toString());
        persa.fazerSom();
    }
}
