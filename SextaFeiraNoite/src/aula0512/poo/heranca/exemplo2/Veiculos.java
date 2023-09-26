package aula0512.poo.heranca.exemplo2;

public class Veiculos {
    
    public String chassis;
    public int cavalos;
    public int velocidade = 0;

    public Veiculos(String chassis, int cavalos) {
        this.chassis = chassis;
        this.cavalos = cavalos;
    }
    
    public int acelerar(int aceleracao) {
        velocidade += aceleracao;
        return velocidade;
    }
}
