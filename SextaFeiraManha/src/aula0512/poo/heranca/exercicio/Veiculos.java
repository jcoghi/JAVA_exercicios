package aula0512.poo.heranca.exercicio;

public class Veiculos {
    
//    ATRIBUTOS:
    private int rodas;
    private String chassis;
    
//    MÉTODOS
    public void acelerar() {
        System.out.println("Sou um veiculo e estou acelerando");
    }
    
    public void ligar() {
        System.out.println("Estou ligando");
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    
    
}
/*
Criar a classe Veiculos que terá:
atributos: int rodas, String chassis
métodos: void acelerar() e void ligar()
*/