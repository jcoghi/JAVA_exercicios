
package desafio.oo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    String nome;
    final List<Compra> compras = new ArrayList<>();
    
    Cliente(String nome) {
        this.nome = nome;
    }
    
    double getValorTotal(){
        double total = 0;
        
        for (Compra compra: compras){
            total += compra.getValorTotal();
        }
        
        return total;
    }
    
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    
}
