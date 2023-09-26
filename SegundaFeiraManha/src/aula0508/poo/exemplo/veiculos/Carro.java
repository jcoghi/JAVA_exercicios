package aula0508.poo.exemplo.veiculos;

import aula0508.poo.exemplo.veiculos.Veiculo;

public class Carro extends Veiculo{
    
    public final int rodas = 4;
    public double motorizacao = 1.0;
    public double potencia = 65;
    public String combustivel = "Gasolina";
    
    public void getRodas() {
        System.out.println("Tenho " + rodas  + " rodas");
    }

    public void andarBuzinando() {
        super.andar(true);
        System.out.println("Tambem estou buzinando");
    }
}
