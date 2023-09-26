package aula0508.poo.exemplo;

import aula0508.poo.exemplo.veiculos.*;


public class Main {

    public static void main(String[] args) {
        
        Carro fiatUno = new Carro();
        Navio pesqueiro = new Navio();
        Patins inline = new Patins("inline", 4);
        
        fiatUno.andar(true);
        
        pesqueiro.andar(true);
        
        inline.andar(true);
        inline.andar(false);

    }
}
