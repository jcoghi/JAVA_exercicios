package aula0502.poo.exemplo;

public class Principal {

    public static void main(String[] args) {

        Veiculos carroPreto = new Veiculos();
        carroPreto.cor = "Preto";
        carroPreto.pessoas = 5;
        carroPreto.rodas = 4;
        
        System.out.println(carroPreto.pessoas);
        
        
        Veiculos onibus = new Veiculos();
        onibus.cor = "Roxo";
        onibus.pessoas = 44;
        onibus.rodas = 6;
        
    }
}
