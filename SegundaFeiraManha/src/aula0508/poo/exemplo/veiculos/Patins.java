package aula0508.poo.exemplo.veiculos;

public class Patins extends Veiculo{
    
    public String categoria = "tradicional";
    public int rodas = 8;
    
    public Patins(String categoria, int rodas){
        if(categoria.equalsIgnoreCase("gelo")) {
            this.rodas = 0;
        } else {
            this.rodas = rodas;
        }
    }
    
}
