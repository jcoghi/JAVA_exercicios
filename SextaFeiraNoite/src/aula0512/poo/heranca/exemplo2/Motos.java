package aula0512.poo.heranca.exemplo2;

public class Motos extends Veiculos {

    public final int rodas = 2;

    public Motos(String chassis, int cavalos) {
        super(chassis, cavalos);
    }

    @Override
    public int acelerar(int aceleracao) {
        System.out.println("BIBIBIBIBIBIBIBIBIBI");
        return super.acelerar(aceleracao);
    }
}
