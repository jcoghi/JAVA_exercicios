package aula0512.poo.heranca.exemplo2;

public class Carros extends Veiculos{
    
    public final int rodas = 4;
    public int portas;
    public int velocidadeFinal;
    
    public Carros(String chassis, int cavalos, 
            int portas, int velocidadeFinal) {
        super(chassis, cavalos);
        this.portas = portas;
        this.velocidadeFinal = velocidadeFinal;
    }
    
    @Override
    public int acelerar(int aceleracao) {
        if (velocidade < velocidadeFinal) {
            return super.acelerar(aceleracao);
        }
        return velocidadeFinal;
    }
    
    
    public void abrirPortas() {
        System.out.println("Portas abertas");
    }
}
